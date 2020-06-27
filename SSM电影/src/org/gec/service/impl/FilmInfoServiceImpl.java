package org.gec.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.gec.mapper.FilminfoMapper;
import org.gec.pojo.Filminfo;
import org.gec.pojo.FilminfoExample;
import org.gec.service.FilmInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FilmInfoServiceImpl implements FilmInfoService {

    @Autowired
    private FilminfoMapper filminfoMapper;

    @Override
    public List<Filminfo> findAllInfo(Filminfo example) {
        //查询
        return filminfoMapper.queryInfos(example);
    }

    @Override
    public void save(Filminfo filminfo) {

        filminfoMapper.insert(filminfo);
    }

    @Override
    public void deleteByIds(int[] filmIds) {
        for(int id:filmIds){
            filminfoMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<Filminfo> findAllInfo2(FilminfoExample filminfo) {
        List<Filminfo> filminfos = filminfoMapper.selectByExample(filminfo);
        return filminfos;
    }

}
