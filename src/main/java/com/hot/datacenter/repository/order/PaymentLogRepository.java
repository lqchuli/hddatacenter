package com.hot.datacenter.repository.order;

import com.hot.base.CrudRepository;
import com.hot.datacenter.entity.order.PaymentLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 7/18/16.
 */
@Repository
public interface PaymentLogRepository extends CrudRepository<PaymentLog, String> {
    List<PaymentLog> findByOrderId(String orderId);
}
