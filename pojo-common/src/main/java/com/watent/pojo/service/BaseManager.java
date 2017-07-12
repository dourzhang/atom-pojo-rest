package com.watent.pojo.service;

/**
 * Base Manager
 * <p>
 * Created by Atom on 2017/7/12.
 */
public interface BaseManager<V> {

    /**
     * 保存
     *
     * @param v V
     * @return ID
     */
    Long save(V v);

    /**
     * 删除
     *
     * @param id ID
     */
    void delete(Long id);

    /**
     * 主键查找
     *
     * @param id ID
     * @return Pojo
     */
    V findOne(Long id);

}
