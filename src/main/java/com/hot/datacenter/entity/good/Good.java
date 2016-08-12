/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼在地图中查看
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.hot.datacenter.entity.good;

import com.hot.datacenter.entity.config.FreightTemplate;
import com.hot.datacenter.model.good.DisRebateDesc;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * 商品表
 * <p>
 * Created by allan on 5/15/16.
 */
@Entity
@Table(name = "Mall_Goods")
@Setter
@Getter
@Cacheable(false)
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Goods_Id")
    private Long goodId;
    /**
     * 商品编号
     */
    @Column(name = "Bn")
    private String barcode;
    /**
     * 商品名称
     */
    @Column(name = "Name")
    private String name;
    /**
     * 商品分类
     */
    @ManyToOne
    @JoinColumn(name = "Cat_Id", referencedColumnName = "Cat_Id")
    private GoodCat goodCat;
    /**
     * 商品品牌
     */
    @ManyToOne
    @JoinColumn(name = "Brand_Id",referencedColumnName = "Brand_Id")
    private GoodBrand goodBrand;
    /**
     * 商品类型
     */
    @Column(name = "Type_Id")
    private Long typeId;
    /**
     * 标准类目id
     */
    @Column(name = "StdType_Id")
    private String standardTypeId;
    /**
     * 标准类目路径
     */
    @Column(name = "StdType_Path")
    private String standardTypePath;
    /**
     * 商品简介
     */
    @Column(name = "Brief")
    private String brief;
    @OneToMany(mappedBy = "good")
    private List<Product> products;
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
     * 商家id
     */
    @Column(name = "Customer_Id")
    private Integer customerId;
    /**
     * 供应商id
     */
    @Column(name = "Supplier_Id")
    private Integer supplierId;

    /**
     * 运费模板
     */
    @ManyToOne
    @JoinColumn(name = "Freight_Template_Id", referencedColumnName = "Id")
    private FreightTemplate freightTemplate;

    @Column(name = "Disabled")
    private boolean disabled;
    /**
     * 价格等级描述
     */
    @Column(name = "Price_LevelDesc")
    private String priceLevelDesc;

    /**
     * 上架场景
     */
    @Column(name = "Goods_Scenes")
    private int goodScenes;

    /**
     * 8级返利描述
     */
    @Column(name = "DisRebate_Desc")
    private List<DisRebateDesc> disRebateDescList;

    /**
     * 返利配额
     */
    @Column(name = "RebateQuatoRatio")
    private double rebateQuatoRatio;

    /**
     * 代理商ID，值为0表示平台方1代理商品
     */
//    @Column(name = "Is_Agent")
//    private boolean isAgent;

    /**
     * 缩略图
     */
    @Column(name = "Thumbnail_Pic")
    private String thumbnailPic;

    /**
     * 库存数量
     */
    @Column(name = "Store")
    private int store;
    /**
     * 单位
     */
    @Column(name = "Unit")
    private String unit;
    /**
     * 销量
     */
    @Column(name = "SalesCount")
    private Integer salesCount;

    @Transient
    private Object extendField;
}
