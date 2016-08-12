package com.hot.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * 默认支持 {@link JpaSpecificationExecutor}
 * Created by allan on 7/15/16.
 */
@NoRepositoryBean
public interface CrudRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
}
