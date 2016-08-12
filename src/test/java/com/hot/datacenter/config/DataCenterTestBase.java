package com.hot.datacenter.config;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by allan on 7/15/16.
 */
@ActiveProfiles("test")
@ContextConfiguration(classes = {DataCenterConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class DataCenterTestBase {
}
