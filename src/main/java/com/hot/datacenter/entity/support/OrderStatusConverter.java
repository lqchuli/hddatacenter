package com.hot.datacenter.entity.support;


import com.hot.datacenter.common.EnumHelper;
import com.hot.datacenter.ienum.OrderEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by allan on 3/24/16.
 */
@Converter(autoApply = true)
public class OrderStatusConverter implements AttributeConverter<OrderEnum.OrderStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(OrderEnum.OrderStatus attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getCode();
    }

    @Override
    public OrderEnum.OrderStatus convertToEntityAttribute(Integer dbData) {
        if (dbData == null) {
            return null;
        }
        return EnumHelper.getEnumType(OrderEnum.OrderStatus.class, dbData);
    }
}
