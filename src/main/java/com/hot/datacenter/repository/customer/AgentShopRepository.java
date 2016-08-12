package com.hot.datacenter.repository.customer;

import com.hot.base.CrudRepository;
import com.hot.datacenter.entity.customer.AgentShop;
import com.hot.datacenter.entity.customer.MallAgent;
import com.hot.datacenter.entity.customer.MallCustomer;
import com.hot.datacenter.ienum.AgentStatusEnum;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 7/18/16.
 */
@Repository
public interface AgentShopRepository extends CrudRepository<AgentShop, Integer> {
    AgentShop findByUsername(String userName);

    AgentShop findByUser_userId(long userId);

    List<AgentShop> findByAgent_Id(int agentId);

    List<AgentShop> findByIsDeletedFalseAndIsDisabledFalseAndStatus(AgentStatusEnum status);

    List<AgentShop> findByIsDeletedFalseAndIsDisabledFalseAndStatusAndCustomerId(AgentStatusEnum status,int customerId);
}
