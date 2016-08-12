package com.hot.datacenter.entity.good;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 商品类型
 * Created by allan on 7/18/16.
 */
@Entity
@Table(name = "Mall_Goods_Type")
@Cacheable(value = false)
@Getter
@Setter
public class GoodType {
    /**
     * 类型主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Type_Id")
    private Long typeId;
    /**
     * 类型名称
     */
    private String name;
    /**
     * 是否是实体商品类型
     */
    @Column(name = "Is_Physical")
    private boolean isPhysical;
    /**
     * 标准商品类目ID
     */
    @Column(name = "Standard_Type_Id")
    private String standardTypeId;
    /**
     * 是否有子类目
     */
    @Column(name = "Is_Parent")
    private boolean isParent;
    /**
     * 父类目ID
     * parentStandardTypeId="0" 为顶级标准类目
     */
    @Column(name = "Parent_Standard_Type_Id")
    private String parentStandardTypeId;
    /**
     * 标准类目路径
     */
    private String path;
    /**
     * 是否有效
     */
    private boolean disabled;
    /**
     * 分销商ID
     * customerId=-1 为标准类目；其他为自定义类目
     */
    @Column(name = "Customer_Id")
    private int customerId;

    @Column(name = "T_Order")
    private int tOrder;

    /**
     * 扩展性字段
     */
    @Transient
    private Object extendField;
}