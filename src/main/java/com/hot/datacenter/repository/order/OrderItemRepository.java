package com.hot.datacenter.repository.order;

import com.hot.datacenter.entity.order.OrderItem;
import com.hot.datacenter.ienum.OrderEnum;
import com.hot.base.CrudRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 1/8/16.
 */
@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {

    @Query("update OrderItem set shipStatus=?2 where itemId=?1")
    @Modifying
    void updateShipStatus(long itemId, OrderEnum.ShipStatus shipStatus);

    List<OrderItem> findByOrder_OrderId(String orderId);
}
