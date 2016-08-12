package com.hot.datacenter.service;

import com.hot.datacenter.config.DataCenterTestBase;
import com.hot.datacenter.entity.good.Good;
import com.hot.datacenter.search.GoodSearch;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * Created by allan on 7/16/16.
 */
public class TestServiceTest extends DataCenterTestBase {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void crudServiceTest() throws Exception {
        System.out.println(111);
    }
}