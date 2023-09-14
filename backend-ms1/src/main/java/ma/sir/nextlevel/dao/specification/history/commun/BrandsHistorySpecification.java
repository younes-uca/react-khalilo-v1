package  ma.sir.nextlevel.dao.specification.history.commun;

import ma.sir.nextlevel.zynerator.specification.AbstractHistorySpecification;
import ma.sir.nextlevel.dao.criteria.history.commun.BrandsHistoryCriteria;
import ma.sir.nextlevel.bean.history.commun.BrandsHistory;


public class BrandsHistorySpecification extends AbstractHistorySpecification<BrandsHistoryCriteria, BrandsHistory> {

    public BrandsHistorySpecification(BrandsHistoryCriteria criteria) {
        super(criteria);
    }

    public BrandsHistorySpecification(BrandsHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
