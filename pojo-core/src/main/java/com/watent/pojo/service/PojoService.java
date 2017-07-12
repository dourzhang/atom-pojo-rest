package com.watent.pojo.service;

import com.watent.pojo.model.Pojo;

/**
 * Pojo Service
 * <p>
 * Created by Atom on 2017/7/11.
 */
public interface PojoService {

    Long save(Pojo pojo);

    void delete(Long id);

}
