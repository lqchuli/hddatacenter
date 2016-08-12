package com.hot.datacenter.entity.order;

import com.hot.datacenter.entity.client.User;
import com.hot.datacenter.entity.marketing.Pintuan;
import com.hot.datacenter.ienum.OrderEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 订单主体表
 * Created by allan on 12/31/15.
 */
@Entity
@Table(name = "Mall_Orders")
@Setter
@Getter
@Cacheable(value = false)
public class MallOrder {
    /**
     * 订单id
     */
    @Id
    @Column(name = "Order_Id")
    private String orderId;
    /**
     * 下单用户
     */
    @ManyToOne
    @JoinColumn(name = "Member_Id")
    private User user;
    @Column(name = "Confirm")
    private int confirm;
    @Column(name = "Status")
    private OrderEnum.OrderStatus orderStatus;
    @Column(name = "Pay_Status")
    private OrderEnum.PayStatus payStatus;
    @Column(name = "Ship_Status")
    private OrderEnum.ShipStatus shipStatus;
    @Column(name = "Createtime")
    private Date createTime;
    @Column(name = "Weight")
    private float weight;
    @Column(name = "Tostr")
    private String orderName;
    @Column(name = "Itemnum")
    private int itemNum;
    @Column(name = "Acttime")
    private Date lastUpdateTime;
    @Column(name = "Ship_Name")
    private String shipName;
    @Column(name = "Ship_Area")
    private String shipArea;
    @Column(name = "Ship_Addr")
    private String shipAddr;
    @Column(name = "Ship_Zip")
    private String shipZip;
    @Column(name = "Ship_Tel")
    private String shipTel;
    @Column(name = "Ship_Email")
    private String shipEmail;
    @Column(name = "Ship_Mobile")
    private String shipMobile;
    @Column(name = "Cost_Item")
    private double costItem;
    @Column(name = "Online_Amount")
    private double onlineAmount;
    /**
     * 运费
     */
    @Column(name = "Cost_Freight")
    private double costFreight;
    /**
     * 货币
     */
    @Column(name = "Currency")
    private String currency;
    /**
     * 订单金额
     */
    @Column(name = "Final_Amount")
    private double finalAmount;
    /**
     * 订单优惠金额
     */
    @Column(name = "Pmt_Amount")
    private double pmtAmount;
    /**
     * 订单附言（用户留言）
     */
    @Column(name = "Memo")
    private String memo;
    /**
     * 订单备注（商家留言）
     */
    @Column(name = "Mark_Text")
    private String remark;
    @Column(name = "Print_Status")
    private int printStatus;

    /**
     * 是否需要开票
     */
    @Column(name = "Is_Tax")
    private int isTax;
    /**
     * 开票公司抬头
     */
    @Column(name = "Tax_Company")
    private String taxCompany;

    /**
     * 支付方式名称
     */
    @Column(name = "Online_PayType")
    private OrderEnum.PaymentOptions paymentType;
    /**
     * 分销商id
     */
    @Column(name = "Customer_Id")
    private Integer customerId;
    /**
     * 供应商id
     */
    @Column(name = "Supplier_Id")
    private Integer supplierId;
    /**
     * 代理商id
     */
    @Column(name = "Agent_Id")
    private Integer agentId;
    /**
     * 代理商门店id
     */
    @Column(name = "Agent_Shop_Id")
    private Integer shopId;
    /**
     * 支付时间
     */
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "Paytime")
    private Date payTime;
    /**
     * 主订单号
     */
    @Column(name = "Union_Order_Id")
    private String unionOrderId;
    /**
     * 签收状态
     */
    @Column(name = "Rel_receiveStatus")
    private int receiveStatus;
    @Column(name = "BNList")
    private String bnList;
    /**
     * 供应商备注等级
     *
     * @return
     */
    @Column(name = "Supplier_Mark_Type")
    private String supplierMarkType;

    /**
     * 供应商备注
     */
    @Column(name = "Supplier_Mark_Text")
    private String supplierMarkText;

    /**
     * 结算状态
     */
    @Column(name = "SettleStatus")
    private int settleStatus;
    /**
     * 预计结算时间
     */
    @Column(name = "PreSettleDate")
    private Date preSettleDate;
    /**
     * 实际结算时间
     */
    @Column(name = "ActualSettleDate")
    private Date actualSettleDate;

    @Column(name = "SourceType")
    private OrderEnum.OrderSourceType orderSourceType;

    /**
     * 拼团活动
     */
    @OneToOne(mappedBy = "order")
    private Pintuan pintuan;

    /**
     * 代理商发货类型，默认为0或者空，
     */
    @Column(name = "Agent_Ship_Mode")
    private OrderEnum.ShipMode shipMode;

    /**
     * 门店备注等级
     *
     * @return
     */
    @Column(name = "Agent_Mark_Type")
    private String agentMarkType;

    /**
     * 门店备注
     *
     * @return
     */
    @Column(name = "Agent_Mark_Text")
    private String agentMarkText;

    @Column(name = "Is_Protect")
    private int isProtect;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;


    //发货状态为 未发货，部分发货，部分退货
    //支付状态为 已支付，部分退款
    //为可发货
    public boolean deliveryable() {
        return (shipStatus == OrderEnum.ShipStatus.NOT_DELIVER || shipStatus == OrderEnum.ShipStatus.PARTY_DELIVER || shipStatus == OrderEnum.ShipStatus.PARTY_RETURN) &&
                (payStatus == OrderEnum.PayStatus.PAYED || payStatus == OrderEnum.PayStatus.PARTY_REFUND);
    }

    //发货状态为 已发货，部分发货，部分退货
    //支付状态为 售后退款中
    //为可退货
    public boolean returnable() {
        return (shipStatus == OrderEnum.ShipStatus.DELIVERED || shipStatus == OrderEnum.ShipStatus.PARTY_DELIVER || shipStatus == OrderEnum.ShipStatus.PARTY_RETURN) &&
                (payStatus == OrderEnum.PayStatus.REFUNDING);
    }
}
