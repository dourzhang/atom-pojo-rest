package com.watent.pojo.infrastructure.model;

import com.watent.pojo.model.Pojo;
import com.watent.pojo.model.PojoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Pojo Repository Impl
 * <p>
 * Created by Atom on 2017/7/11.
 */
@Repository
public class PojoRepositoryImpl implements PojoRepository {

    @Override
    public Pojo save(Pojo pojo) {
        return null;
    }

    @Override
    public void update(Pojo pojo) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Pojo findOne(Long id) {

        Pojo pojo = new Pojo();
        pojo.setId(id);
        pojo.setName("pojo");
        pojo.setStatus(1);
        pojo.setCreatedAt(LocalDateTime.now());
        pojo.setUpdatedAt(LocalDateTime.now());
        return pojo;
    }

    @Override
    public List<Pojo> findByName(String name) {

        Pojo pojo = new Pojo();
        pojo.setId(new Random().nextLong());
        pojo.setName(name);
        pojo.setStatus(1);
        pojo.setCreatedAt(LocalDateTime.now());
        pojo.setUpdatedAt(LocalDateTime.now());

        return Collections.singletonList(pojo);
    }
}
