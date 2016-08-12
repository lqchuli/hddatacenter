package com.hot.datacenter.repository.good;

import com.hot.datacenter.entity.good.Product;
import com.hot.base.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 5/16/16.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByGood_GoodId(Long goodsId);
}
