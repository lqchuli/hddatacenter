package com.hot.datacenter.entity.order;

import com.hot.datacenter.ienum.AfterSaleEnum;
import com.hot.datacenter.model.order.LogiModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 售后详细信息
 * Created by allan on 12/30/15.
 */
@Entity
@Table(name = "Mall_AfterSale_Items")
@Setter
@Getter
@Cacheable(value = false)
public class AfterSalesItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AfterItemsId")
    private Integer itemId;
    @ManyToOne
    @JoinColumn(name = "After_Id")
    private AfterSales afterSales;
    @Column(name = "After_Way")
    private AfterSaleEnum.AfterSaleType afterSaleType;
    @Column(name = "After_Reason")
    private AfterSaleEnum.AfterSalesReason afterSalesReason;
    @Column(name = "After_Money")
    private double afterMoney;
    @Column(name = "After_Mobile")
    private String afterMobile;
    @Column(name = "After_Context")
    private String afterContext;
    @Column(name = "Image_File")
    private String imgFiles;
    @Column(name = "ApplyTime")
    private Date applyTime;
    @Column(name = "Reply")
    private String reply;
    @Column(name = "ReplyTime")
    private Date replyTime;
    @Column(name = "AfterItems_Status")
    private AfterSaleEnum.AfterItemsStatus afterItemsStatus;
    @Column(name = "IsLogic")
    private int isLogic;

    @Transient
    private List<String> imgFileList;
    @Transient
    private LogiModel logiModel;
    @Transient
    private List<String> refundInfos;
}

