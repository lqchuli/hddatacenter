package com.hot.datacenter.repository.good;

import com.hot.base.CrudRepository;
import com.hot.datacenter.entity.good.GoodType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 7/18/16.
 */
@Repository
public interface GoodTypeRepository extends CrudRepository<GoodType, Long> {
    GoodType findByStandardTypeIdAndDisabledFalseAndCustomerId(String standardTypeId, int customerId);

    List<GoodType> findByParentStandardTypeIdAndDisabledFalseAndCustomerIdOrderByTOrderAsc(String parentStandardTypeId, int customerId);

    List<GoodType> findByCustomerIdOrderByTOrderAsc(int customerId);
}
