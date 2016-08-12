/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼在地图中查看
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 *
 */

package com.hot.datacenter.entity.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.hot.datacenter.ienum.OrderEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 发货表,退货表
 * Created by helloztt on 2016/3/25.
 */
@Entity
@Table(name = "Mall_Delivery")
@Setter
@Getter
@Cacheable(value = false)
public class Delivery {
    @Id
    @Column(name = "Delivery_Id")
    private String deliveryId;
    @ManyToOne
    @JoinColumn(name = "Order_Id")
    @JSONField(deserialize = false)
    private MallOrder order;
    /**
     * 单据类型
     * "Delivery" or "Return"
     */
    @Column(name = "Type")
    private String type;
    /**
     * 快递公司名称
     */
    @Column(name = "Logi_Name")
    private String logisticsName;
    /**
     * 物流单号
     */
    @Column(name = "Logi_No")
    private String logisticsNo;
    /**
     * 物流费用
     */
    @Column(name = "Money")
    private double freight;
    /**
     * 创建时间
     */
    @Column(name = "T_Begin")
    private Date createTime;
    /**
     * 收货地址
     */
    @Column(name = "Ship_Addr")
    private String shipAddr;
    /**
     * 收货人姓名
     */
    @Column(name = "Ship_Name")
    private String shipName;
    /**
     * 收货人联系方式
     */
    @Column(name = "Ship_Mobile")
    private String shipMobile;
    /**
     * 邮政编码
     */
    @Column(name = "Ship_Zip")
    private String shipZip;
    /**
     * 电话
     */
    @Column(name = "Ship_Tel")
    private String shipTel;

    /**
     * 所属供应商id
     */
    private int supplierId;

    /**
     * 所属商家id
     */
    private int customerId;
    /**
     * 备注
     */
    @Column(name = "Memo")
    private String memo;

    @Column(name = "Agent_Shop_Id")
    private Integer shopId;
    /**
     * 代理商发货类型，默认为0或者空，
     */
    @Column(name = "Agent_Shop_Type")
    private OrderEnum.ShipMode agentShopType;

    @OneToMany(mappedBy = "delivery")
    private List<DeliveryItem> deliveryItems;
}
