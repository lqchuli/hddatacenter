package com.hot.datacenter.search;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by allan on 12/30/15.
 */
@Setter
@Getter
public class AfterSaleSearch {
    /**
     * 起始时间
     */
    private String beginTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 用户手机
     */
    private String mobile;
    /**
     * 售后id
     */
    private String afterId;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 售后状态
     */
    private Integer afterSaleStatus = -1;
}
