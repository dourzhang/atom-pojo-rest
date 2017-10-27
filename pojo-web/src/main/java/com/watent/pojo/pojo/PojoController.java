package com.watent.pojo.pojo;

import com.watent.pojo.model.Pojo;
import com.watent.pojo.protocol.PojoManagerClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Pojo Controller
 * <p>
 *
 * @author Atom
 * @date 2017/7/12
 */
@RestController
@RequestMapping("/pojo")
public class PojoController {

    private static final Logger logger = LoggerFactory.getLogger(PojoController.class);

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

    /**
     * ref http://www.tianshouzhi.com/api/tutorials/springboot/89
     */
    @ResponseBody
    @GetMapping("/test")
    public Map<String, Object> test() {
        logger.info("visit test");
        Map<String, Object> map = new HashMap<>();
        map.put("response", true);
        map.put("data", "test ok");
        return map;
    }
}
