package com.hot.datacenter.repository.order;

import com.hot.base.CrudRepository;
import com.hot.datacenter.entity.order.RefundLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 7/18/16.
 */
@Repository
public interface RefundLogRepository extends CrudRepository<RefundLog,String>{
    List<RefundLog> findByOrderId(String orderId);
}
