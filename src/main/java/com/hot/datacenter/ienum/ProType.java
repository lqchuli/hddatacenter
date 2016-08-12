package com.hot.datacenter.ienum;

import com.hot.datacenter.common.ICommonEnum;

/**
 * 伙伴商城的产品类型
 * Created by allan on 7/22/16.
 */
public enum ProType implements ICommonEnum {
    HUOBAN_MALL(0, "伙伴商城"),
    SUPPLIER(1, "供应商"),
    AGENT(2, "代理商"),
    AGENT_SHOP(3, "代理商门店");

    private Integer code;
    private String value;

    ProType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
