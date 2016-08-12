package com.hot.datacenter.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * 一个标准的CRUD接口
 * <p>
 * <p>
 * Created by allan on 7/15/16.
 *
 * @param <T>  对应实体类型
 * @param <ID> 主键类型
 * @param <S>  搜索类型
 */
public interface CrudService<T, ID extends Serializable, S> {
    /**
     * 保存一个实体
     *
     * @param t 待保存的实体
     * @return 持久化的实体
     */
    @Transactional
    T save(T t);

    /**
     * 批量保存实体
     *
     * @param entities 实体列表
     * @return 持久化的实体列表
     */
    @Transactional
    List<T> save(List<T> entities);

    /**
     * 删除一个实体
     *
     * @param t 待删除的实体
     */
    @Transactional
    void delete(T t);

    /**
     * 通过主键删除一个实体
     *
     * @param id 带删除的实体主键id
     */
    @Transactional
    void delete(ID id);

    /**
     * 通过主键id得到相应的实体
     *
     * @param id 实体主键id
     * @return 实体
     */
    T findOne(ID id);

    /**
     * 某个实体是否存在
     *
     * @param id 实体主键
     * @return 存在返回true, 不存在返回flase
     */
    boolean exists(ID id);

    /**
     * 得到一个实体的分组列表
     *
     * @param s        搜索类型
     * @param pageable 分页信息
     * @return
     */
    Page<T> findAll(S s, Pageable pageable) throws IllegalArgumentException;

    /**
     * 得到所有实体
     *
     * @return
     */
    List<T> findAll();

    /**
     * 得到一个Specification
     *
     * @return
     */
    Specification<T> specification(S s);
}
