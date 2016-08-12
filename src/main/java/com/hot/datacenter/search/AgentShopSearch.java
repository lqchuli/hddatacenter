package com.hot.datacenter.search;

import com.hot.datacenter.entity.customer.MallAgent;
import lombok.Data;

/**
 * Created by allan on 7/18/16.
 */
@Data
public class AgentShopSearch {
    /**
     * 平台过滤
     */
    private Integer customerId;

    /**
     * 门店查询条件
     */
    private String name;
    private String provinceCode;
    private String cityCode;
    private String districtCode;
    private int status = -1;
    private MallAgent parentAuthor;

    /**
     * list 平台门店管理列表
     * audit 平台门店审核列表
     */
    private String type;

    /**
     * 上级代理商查询条件
     */
    private String parent_name;
    private String parent_username;
    private int parent_agentLevel = -1;
    private String parent_provinceCode;
    private String parent_cityCode;
    private String parent_districtCode;
}
