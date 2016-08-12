package com.hot.datacenter.repository.order;

import com.hot.datacenter.entity.order.MallOrder;
import com.hot.datacenter.ienum.OrderEnum;
import com.hot.base.CrudRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by allan on 12/31/15.
 */
@Repository
public interface MallOrderRepository extends CrudRepository<MallOrder, String> {
    @Query("update MallOrder set payStatus=?1 where orderId=?2")
    @Modifying
    void updatePayStatus(OrderEnum.PayStatus payStatus, String orderId);

    @Query("update MallOrder  set shipStatus=?1 where orderId=?2")
    @Modifying
    void updateShipStatus(OrderEnum.ShipStatus shipStatus, String orderId);
}
