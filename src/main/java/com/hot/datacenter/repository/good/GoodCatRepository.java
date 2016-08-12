package com.hot.datacenter.repository.good;

import com.hot.datacenter.entity.good.GoodCat;
import com.hot.base.CrudRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by allan on 5/16/16.
 */
@Repository
public interface GoodCatRepository extends CrudRepository<GoodCat, Long> {
    List<GoodCat> findByCustomerId(int customerId);
}
