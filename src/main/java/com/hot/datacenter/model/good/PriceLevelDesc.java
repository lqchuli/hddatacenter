package com.hot.datacenter.model.good;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * Created by allan on 5/16/16.
 */
@Data
public class PriceLevelDesc {
    @JSONField(name = "LevelId")
    private long levelId;
    @JSONField(name = "MinPrice")
    private double minPrice;
    @JSONField(name = "MaxPrice")
    private double maxPrice;
    @JSONField(name = "MinIntegral")
    private int minIntegral;
    @JSONField(name = "MaxIntegral")
    private int maxIntegral;
}
