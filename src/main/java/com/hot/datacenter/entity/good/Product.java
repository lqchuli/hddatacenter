/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼在地图中查看
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.hot.datacenter.entity.good;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Map;

/**
 * 商城货品表
 * Created by allan on 5/15/16.
 *
 */
@Entity
@Table(name = "Mall_Products")
@Setter
@Getter
@Cacheable(false)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_Id")
    private Long productId;
    @ManyToOne
    @JoinColumn(name = "Goods_Id")
    private Good good;

    @Column(name = "Bn")
    private String productBn;

    /**
     * 规格
     */
    @Column(name = "Pdt_Desc")
    private String standard;

    /**
     * 成本价
     */
    @Column(name = "Cost")
    private double cost;
    /**
     * 销售价
     */
    @Column(name = "Price")
    private double price;
    /**
     * 市场价
     */
    @Column(name = "Mktprice")
    private double marketPrice;
    /**
     * 货品名称
     */
    @Column(name = "Name")
    private String name;
    /**
     * 单位
     */
    @Column(name = "Unit")
    private String unit;
    /**
     * 库存
     */
    @Column(name = "Store")
    private int store;
    /**
     * 预占库存
     */
    @Column(name = "Freez")
    private int campOnStore;
    /**
     * 代理商进货价
     */
//    @Column(name = "AgentPriceInfo")
//    private String agentPriceInfo;
    /**
     * 用户会员价信息
     */
    @Column(name = "UserPriceInfo")
    private String userPriceInfo;
    /**
     * 用户返利信息
     */
    @Column(name = "UserIntegralInfo")
    private String userIntegralInfo;

    @ElementCollection
    @CollectionTable(
            name = "Mall_Goods_Lv_Price",
            joinColumns = @JoinColumn(name = "Product_Id")
    )
    @MapKey(name = "levelId")
    private Map<Long, GoodLvPrice> goodLvPriceMap;
    @Column(name = "DisRebateMode")
    private int disRebateMode;
    @Column(name = "DisUnifiedRebate")
    private double disUnifiedRebate;
    /**
     * 是否上架
     */
    @Column(name = "Marketable", nullable = false)
    private boolean marketable;

    /**
     * 不详
     */
    @Column(name = "Is_Local_Stock", nullable = false)
    private boolean isLocalStock;

    /**
     * 扩展性字段
     */
    @Transient
    private Object extendField;
}
