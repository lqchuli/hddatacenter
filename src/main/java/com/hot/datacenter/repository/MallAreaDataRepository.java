package com.hot.datacenter.repository;

import com.hot.base.CrudRepository;
import com.hot.datacenter.entity.MallAreaData;
import org.springframework.stereotype.Repository;

/**
 * Created by allan on 8/1/16.
 */
@Repository
public interface MallAreaDataRepository extends CrudRepository<MallAreaData, String> {
}
