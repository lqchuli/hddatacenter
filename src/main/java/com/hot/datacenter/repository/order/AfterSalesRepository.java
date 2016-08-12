package com.hot.datacenter.repository.order;

import com.hot.datacenter.entity.order.AfterSales;
import com.hot.datacenter.ienum.AfterSaleEnum;
import com.hot.base.CrudRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allan on 12/30/15.
 */
@Repository
public interface AfterSalesRepository extends CrudRepository<AfterSales, String> {

    @Query("update AfterSales afterSales set afterSales.afterSaleStatus=?1 where afterSales.afterId=?2")
    @Modifying
    void updateStatus(AfterSaleEnum.AfterSaleStatus afterSaleStatus, String afterId);

    AfterSales findByProductId(int productId);

    List<AfterSales> findByOrderId(String orderId);

    int countByOrderIdAndAfterSaleStatusNot(String orderId, AfterSaleEnum.AfterSaleStatus afterSaleStatus);

    int countByOrderIdAndAfterSaleStatus(String orderId, AfterSaleEnum.AfterSaleStatus afterSaleStatus);

    @Query("select count(afterSale) from AfterSales afterSale where afterSale.supplierId=?1 and afterSale.afterSaleStatus not in ?2")
    int countBySupplierIdAndAfterSaleStatusNotIn(int supplierId, List<AfterSaleEnum.AfterSaleStatus> afterSaleStatuses);
}
