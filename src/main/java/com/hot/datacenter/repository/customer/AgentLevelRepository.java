package com.hot.datacenter.repository.customer;

import com.hot.base.CrudRepository;
import com.hot.datacenter.entity.customer.AgentLevel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 7/18/16.
 */
@Repository
public interface AgentLevelRepository extends CrudRepository<AgentLevel, Long> {
    List<AgentLevel> findByCustomerIdOrderByLevel(int customerId);

    @Query("select max(a.level) from AgentLevel a where a.customerId = ?1")
    Integer findLastLevel(int customerId);

    AgentLevel findByLevelIdAndCustomerId(long levelId,int customerId);
}
