package com.hot.datacenter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by allan on 7/15/16.
 */
@Configuration
@ComponentScan(basePackages = "com.hot.datacenter")
@EnableJpaRepositories(
        basePackages = "com.hot.datacenter.repository"
)
@EnableTransactionManagement
@ImportResource({"classpath:datasource_prod.xml", "classpath:datasource_test.xml"})
public class DataCenterConfig {
    
}
