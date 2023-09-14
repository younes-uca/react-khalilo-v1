package  ma.sir.nextlevel.dao.specification.history.commun;

import ma.sir.nextlevel.zynerator.specification.AbstractHistorySpecification;
import ma.sir.nextlevel.dao.criteria.history.commun.ProductsHistoryCriteria;
import ma.sir.nextlevel.bean.history.commun.ProductsHistory;


public class ProductsHistorySpecification extends AbstractHistorySpecification<ProductsHistoryCriteria, ProductsHistory> {

    public ProductsHistorySpecification(ProductsHistoryCriteria criteria) {
        super(criteria);
    }

    public ProductsHistorySpecification(ProductsHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
