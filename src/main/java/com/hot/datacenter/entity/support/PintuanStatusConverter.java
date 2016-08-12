package com.hot.datacenter.entity.support;


import com.hot.datacenter.ienum.ActEnum;
import com.hot.datacenter.common.EnumHelper;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by allan on 5/4/16.
 */
@Converter(autoApply = true)
public class PintuanStatusConverter implements AttributeConverter<ActEnum.OrderPintuanStatusOption, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ActEnum.OrderPintuanStatusOption attribute) {
        return attribute.getCode();
    }

    @Override
    public ActEnum.OrderPintuanStatusOption convertToEntityAttribute(Integer dbData) {
        return EnumHelper.getEnumType(ActEnum.OrderPintuanStatusOption.class, dbData);
    }
}
