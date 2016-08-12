/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼在地图中查看
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.hot.datacenter.search;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by allan on 5/21/16.
 */
@Setter
@Getter
public class GoodSearch {
    private String goodName;
    private long catId;
    private String goodBn;
    private long brand;
    private String brandName;
    private int customerId;
    private int goodTypeId;
    /**
     * 选择的标准类目路径
     */
    private String standardTypePath;
}
