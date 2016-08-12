/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼在地图中查看
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 *
 */

package com.hot.datacenter.repository.order;

import com.hot.datacenter.entity.order.Delivery;
import com.hot.base.CrudRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by helloztt on 2016/3/25.
 */
@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, String> {
    List<Delivery> findByOrder_OrderId(String orderId);

    List<Delivery> findByOrder_OrderIdAndTypeIgnoreCase(String orderId, String type);

    List<Delivery> findByShopId(Integer shop);
}
