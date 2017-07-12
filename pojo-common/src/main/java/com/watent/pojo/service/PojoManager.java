package com.watent.pojo.service;


import com.watent.pojo.model.Pojo;

import java.util.List;

/**
 * Pojo Manager
 * <p>
 * Created by Atom on 2017/7/11.
 */
public interface PojoManager extends BaseManager<Pojo> {

    /**
     * 通过名字查找
     *
     * @return Pojo
     */
    List<Pojo> findByName(String name);

}
