/*
 * 版权所有:杭州火图科技有限公司
 * 地址:浙江省杭州市滨江区西兴街道阡陌路智慧E谷B幢4楼在地图中查看
 *
 * (c) Copyright Hangzhou Hot Technology Co., Ltd.
 * Floor 4,Block B,Wisdom E Valley,Qianmo Road,Binjiang District
 * 2013-2016. All rights reserved.
 */

package com.hot.datacenter.repository.good;

import com.hot.datacenter.entity.good.Good;
import com.hot.base.CrudRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 5/16/16.
 */
@Repository
public interface GoodRepository extends CrudRepository<Good, Long> {
    /**
     * 得到某个分类未被删除的商品
     *
     * @param catId
     * @return
     */
    @Query("select good from Good good where good.disabled=false and good.goodCat.catPath like %?1%")
    List<Good> findByGoodCat(String catId);

    @Query("select good from Good good where good.goodId in ?1")
    List<Good> findByGoodIdIn(List<Long> goodIdList);

    @Query("select good from Good good where good.disabled=false and good.goodBrand.brandId=?1")
    List<Good> findByBrand(long brandId);
}
