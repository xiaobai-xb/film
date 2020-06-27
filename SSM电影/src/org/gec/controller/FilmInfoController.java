package org.gec.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.gec.pojo.Filminfo;
import org.gec.pojo.FilminfoExample;
import org.gec.pojo.Filmtype;
import org.gec.service.FilmInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.List;

@Controller
public class FilmInfoController {

    @Autowired
    private FilmInfoService filmInfoService;

    public List<Filminfo> getResult() {
        return result;
    }

    //电影list
    List<Filminfo> result ;
    //每页显示数量
    public static final Integer PAGESIZE = 2;

    @RequestMapping("/findFilms")
    public ModelAndView findFilms(FilminfoExample filminfo,@RequestParam(value = "typeid",required = false,defaultValue = "1") Integer typeid,
                                  @RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum) throws Exception{

        if (typeid != 0){
            FilminfoExample.Criteria criteria = filminfo.createCriteria();

            criteria.andTypeidEqualTo(typeid);
        }
        //设置分页
        PageHelper.startPage(pageNum,PAGESIZE);

        //电影条件
        //查询
        result = filmInfoService.findAllInfo2(filminfo);

        ModelAndView mv = new ModelAndView();

        //分页上一页，下一页，尾页，总记录数...
        PageInfo info = new PageInfo(result);

        mv.addObject("info",info);
        mv.addObject("result",result);
        mv.addObject("typeid",typeid);
        mv.setViewName("page/resultpage");
        return mv;
    }

//    @RequestMapping("/deleteFilms")
//    public ModelAndView findFilms(Filminfo filminfo, Integer typeid) throws Exception{
//        //选了类型
//        if (typeid != 0){
//            Filmtype type = new Filmtype();
//            type.setTypeid(typeid);
//
//            filminfo.setFilmtype(type);
//        }
//
//        //电影条件
//        //查询
//        result = filmInfoService.findAllInfo(filminfo);
//
//        for(Filminfo info:result){
//            System.out.println(info.getFilmtype().getTypename());
//        }
//
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("result",result);
//        mv.setViewName("page/result");
//        return mv;
//    }

    @RequestMapping("/FilmAddServlet")
    public String FilmAddServlet(@Validated Filminfo filminfo, BindingResult result, Model model,
                                  Integer typeid, MultipartFile picname) throws Exception{

        //判断有没有校验错误
        if (result.hasErrors()){
            //循环获得错误
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError error:errors){
                model.addAttribute(error.getField(),error.getDefaultMessage());//配置的错误信息
            }
            return "forward:/toAddFilm";
        }


        Filmtype filmtype = new Filmtype();
        filmtype.setTypeid(typeid);

        //上传文件名
        String fileName=picname.getOriginalFilename();
        //文件存储路径
        File file=new File("F:\\file");
        filminfo.setPic(fileName);
        //写到磁盘
        picname.transferTo(file);
        //添加
        filmInfoService.save(filminfo);
        //重定向
        return "redirect:/toAddFilm";
    }
    //批量删除
    @RequestMapping("/deleteFilms")
    public String deleteFilms(int[] filmIds){
        //调用方法删除
        filmInfoService.deleteByIds(filmIds);

        //重定向
        return "redirect:/toCinema";
    }

}
