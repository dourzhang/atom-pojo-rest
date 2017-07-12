package com.watent.pojo.protocol;


import com.watent.pojo.model.Pojo;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

import java.util.List;

/**
 * Pojo Manager
 *
 * @see com.watent.pojo.service.PojoManager
 * <p>
 * Created by Atom on 2017/7/11.
 */
//@FeignClient(name = "ribbon-server", configuration = FeignClientConfiguration.class)
@FeignClient(name = "pojo-server/pojo")
public interface PojoManagerClient extends BaseClient<Pojo> {

    /**
     * 通过名字查找
     *
     * @return Pojo
     */
    @RequestLine("GET /name/{name}")
    List<Pojo> findByName(@Param("name") String name);

}
