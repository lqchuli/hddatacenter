package com.hot.datacenter.repository.client;

import com.hot.datacenter.entity.client.UserLevel;
import com.hot.base.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by allan on 5/16/16.
 */
@Repository
public interface UserLevelRepository extends CrudRepository<UserLevel, Long> {
    /**
     * 得到商户的所有等级
     *
     * @param customerId
     * @return
     */
    List<UserLevel> findByCustomerId(int customerId);
}
