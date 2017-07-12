package com.watent.pojo.infrastructure.service;

import com.watent.pojo.model.Pojo;
import com.watent.pojo.model.PojoRepository;
import com.watent.pojo.service.PojoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * PojoService Impl
 *
 * Created by Atom on 2017/7/11.
 */
@Service
public class PojoServiceImpl implements PojoService{

    @Resource
    private PojoRepository pojoRepository;

    @Override
    public Long save(Pojo pojo) {
        if(null == pojo.getId()){
            pojoRepository.save(pojo);
        }else {
            pojoRepository.update(pojo);
        }
        return pojo.getId();
    }

    @Override
    public void delete(Long id) {

    }
}
