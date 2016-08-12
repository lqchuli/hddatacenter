package com.hot.datacenter.service;

import com.hot.base.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

/**
 * 已包含了一系列CRUD操作
 * 无个性化仓库的使用
 * 有个性化仓库的无法使用
 * <p>
 * Created by allan on 7/15/16.
 *
 * @param <T>  对应实体类型
 * @param <ID> 主键类型
 * @param <S>  搜索类型
 */
public abstract class AbstractCrudService<T, ID extends Serializable, S> implements CrudService<T, ID, S> {
    @Autowired
    protected CrudRepository<T, ID> repository;

    @Transactional
    public T save(T t) {
        return repository.save(t);
    }

    @Transactional
    public List<T> save(List<T> entities) {
        return repository.save(entities);
    }

    @Transactional
    public void delete(T t) {
        repository.delete(t);
    }

    @Transactional
    public void delete(ID id) {
        repository.delete(id);
    }

    public T findOne(ID id) {
        return repository.findOne(id);
    }

    public boolean exists(ID id) {
        return repository.exists(id);
    }

    public Page<T> findAll(S s, Pageable pageable) throws IllegalArgumentException {
        if (s instanceof Void) {
            throw new IllegalArgumentException("无法识别该搜索类型");
        }
        Specification<T> specification = specification(s);
        return repository.findAll(specification, pageable);
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public abstract Specification<T> specification(S s);
}
