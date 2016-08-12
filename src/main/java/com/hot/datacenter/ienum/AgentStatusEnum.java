package com.hot.datacenter.ienum;


import com.hot.datacenter.common.ICommonEnum;

/**
 * Created by helloztt on 2016/5/9.
 */
public enum AgentStatusEnum implements ICommonEnum {
    NOT_CHECK(0,"未提交"),
    CHECKING(1,"待审核"),
    CHECKED(2,"审核通过"),
    RETURNED(3,"审核不通过");

    private Integer code;
    private String value;

    AgentStatusEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
