package com.watent.pojo.protocol;

import com.watent.pojo.model.Pojo;
import feign.Param;
import feign.RequestLine;

/**
 * Base Client
 * <p>
 * Created by Atom on 2017/7/12.
 */
//@FeignClient(name = "pojo-server", configuration = FeignClientConfiguration.class)
interface BaseClient<V> {

    /**
     * 保存/更新
     *
     * @param pojo Pojo
     * @return ID
     */
    @RequestLine("POST /save")
    Long save(Pojo pojo);

    /**
     * 删除
     *
     * @param id ID
     */
    @RequestLine("DELETE /{id}")
    void delete(@Param("id") Long id);

    /**
     * 主键查找
     *
     * @param id ID
     * @return Pojo
     */
    @RequestLine("GET /{id}")
    V findOne(@Param("id") Long id);
}
