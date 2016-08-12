/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼在地图中查看
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.hot.datacenter.repository.config;

import com.hot.datacenter.entity.config.MallBaseConfig;
import com.hot.base.CrudRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * Created by allan on 6/22/16.
 */
@Repository
public interface MallBaseConfigRepository extends CrudRepository<MallBaseConfig, Integer> {
    MallBaseConfig findByCustomerId(int customerId);
}
