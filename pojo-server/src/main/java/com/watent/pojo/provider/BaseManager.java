package com.watent.pojo.provider;

import com.watent.pojo.model.Pojo;
import com.watent.pojo.model.PojoRepository;
import com.watent.pojo.service.PojoManager;
import com.watent.pojo.service.PojoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Pojo Manager Impl
 * <p>
 * Created by Atom on 2017/7/12.
 */
@RestController
@RequestMapping("/pojo")
public class BaseManager implements PojoManager {

    @Resource
    private PojoRepository pojoRepository;

    @Resource
    private PojoService pojoService;

    @PostMapping("/save")
    @Override
    public Long save(@RequestParam Pojo pojo) {
        return pojoService.save(pojo);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable("id") Long id) {
        pojoService.delete(id);
    }

    @GetMapping("/{id}")
    @Override
    public Pojo findOne(@PathVariable("id") Long id) {
        return pojoRepository.findOne(id);
    }

    @GetMapping("/name/{name}")
    @Override
    public List<Pojo> findByName(@PathVariable("name") String name) {
        return pojoRepository.findByName(name);
    }
}
