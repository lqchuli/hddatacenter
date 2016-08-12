package com.hot.datacenter.repository.customer;

import com.hot.base.CrudRepository;
import com.hot.datacenter.entity.customer.MallAgent;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 7/18/16.
 */
@Repository
public interface MallAgentRepository extends CrudRepository<MallAgent, Integer> {
    List<MallAgent> findByAgentLevel_levelIdAndIsDeletedFalse(long levelId);

    @Modifying(clearAutomatically = true)
    @Query("update MallAgent a set a.isDeleted = true where a.id = ?1")
    int deleteAgent(long agentId);

    @Modifying(clearAutomatically = true)
    @Query("update MallAgent a set a.isDisabled = ?2 where a.id = ?1")
    int updateDisabledStatus(long agentId, boolean status);

    List<MallAgent> findByParentAgent_Id(int agentId);

    MallAgent findByUser_userId(long userId);
}
