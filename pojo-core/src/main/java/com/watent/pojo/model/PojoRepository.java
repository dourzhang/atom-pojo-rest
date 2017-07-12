package com.watent.pojo.model;

import java.util.List;

/**
 * Pojo Repository
 * <p>
 * Created by Atom on 2017/7/11.
 */
public interface PojoRepository {

    Pojo save(Pojo pojo);

    void update(Pojo pojo);

    void delete(Long id);

    Pojo findOne(Long id);

    List<Pojo> findByName(String name);
}
