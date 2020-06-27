package org.gec.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.gec.mapper.FilmtypeMapper;
import org.gec.pojo.Filmtype;
import org.gec.service.FilmTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
/**
 * bean id="filmTypeService" class="org.gec.service.impl.FilmTypeServiceImpl"
 */
@Transactional
public class FilmTypeServiceImpl implements FilmTypeService {

    @Autowired
    private FilmtypeMapper filmtypeMapper;

    @Override
    public List<Filmtype> findAllTypes() {
        List<Filmtype> filmtypes = filmtypeMapper.selectByExample(null);//select * from filmtype
        return filmtypes;
    }

}
