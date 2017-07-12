package com.watent.pojo.pojo;

import com.watent.pojo.model.Pojo;
import com.watent.pojo.protocol.PojoManagerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Pojo Controller
 * <p>
 * Created by Atom on 2017/7/12.
 */
@RestController
@RequestMapping("/pojo")
public class PojoController {

    @Resource
    private PojoManagerClient pojoManagerClient;

    @GetMapping("/{id}")
    public Pojo findOne(@PathVariable("id") Long id) {
        return pojoManagerClient.findOne(id);
    }

    @GetMapping("/name/{name}")
    public List<Pojo> findByName(@PathVariable("name") String name) {
        return pojoManagerClient.findByName(name);
    }

}
