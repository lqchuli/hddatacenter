package com.hot.datacenter.repository.customer;

import com.hot.base.CrudRepository;
import com.hot.datacenter.entity.customer.MallCustomer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by allan on 7/18/16.
 */
@Repository
public interface MallCustomerRepository extends CrudRepository<MallCustomer, Integer> {
    MallCustomer findByUsername(String username);

    @Modifying(clearAutomatically = true)
    @Query("update MallCustomer a set a.password = ?2 where a.customerId = ?1")
    int resetPassword(int customerId, String password);
}
