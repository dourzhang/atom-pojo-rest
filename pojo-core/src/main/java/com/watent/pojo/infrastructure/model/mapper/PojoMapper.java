package com.watent.pojo.infrastructure.model.mapper;

import com.watent.pojo.model.Pojo;

/**
 * Pojo Mapper
 * <p>
 * Created by Atom on 2017/7/11.
 */
public interface PojoMapper {

    Pojo insert(Pojo pojo);

    void update(Pojo pojo);

    void delete(Long id);

    Pojo selectOne(Long id);
}
