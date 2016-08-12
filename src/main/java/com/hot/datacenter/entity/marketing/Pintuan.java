package com.hot.datacenter.entity.marketing;

import com.hot.datacenter.entity.order.MallOrder;
import com.hot.datacenter.ienum.ActEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by allan on 5/4/16.
 */
@Entity
@Table(name = "Mall_Pintuan_Promoter")
@Getter
@Setter
@Cacheable(false)
public class Pintuan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PromoterId")
    private Long id;
    @Column(name = "MemberId")
    private int memberId;
    @OneToOne
    @JoinColumn(name = "OrderId")
    private MallOrder order;
    @Column(name = "Status")
    private ActEnum.OrderPintuanStatusOption orderPintuanStatusOption;
    @Column(name = "CustomerId")
    private int customerId;
}
