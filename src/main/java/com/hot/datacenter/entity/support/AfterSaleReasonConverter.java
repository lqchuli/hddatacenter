package com.hot.datacenter.entity.support;


import com.hot.datacenter.ienum.AfterSaleEnum;
import com.hot.datacenter.common.EnumHelper;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by allan on 12/31/15.
 */
@Converter(autoApply = true)
public class AfterSaleReasonConverter implements AttributeConverter<AfterSaleEnum.AfterSalesReason, Integer> {
    @Override
    public Integer convertToDatabaseColumn(AfterSaleEnum.AfterSalesReason afterSalesReason) {
        return afterSalesReason.getCode();
    }

    @Override
    public AfterSaleEnum.AfterSalesReason convertToEntityAttribute(Integer integer) {
        if (integer == null) {
            return null;
        }
        return EnumHelper.getEnumType(AfterSaleEnum.AfterSalesReason.class, integer);
    }
}
