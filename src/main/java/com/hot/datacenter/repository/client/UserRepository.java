package com.hot.datacenter.repository.client;

import com.hot.base.CrudRepository;
import com.hot.datacenter.entity.client.User;

/**
 * Created by allan on 7/18/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByLoginNameAndCustomerId(String loginName, Integer customerId);
}
