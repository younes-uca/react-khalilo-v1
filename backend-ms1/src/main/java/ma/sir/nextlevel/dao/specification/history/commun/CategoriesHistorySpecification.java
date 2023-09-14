package  ma.sir.nextlevel.dao.specification.history.commun;

import ma.sir.nextlevel.zynerator.specification.AbstractHistorySpecification;
import ma.sir.nextlevel.dao.criteria.history.commun.CategoriesHistoryCriteria;
import ma.sir.nextlevel.bean.history.commun.CategoriesHistory;


public class CategoriesHistorySpecification extends AbstractHistorySpecification<CategoriesHistoryCriteria, CategoriesHistory> {

    public CategoriesHistorySpecification(CategoriesHistoryCriteria criteria) {
        super(criteria);
    }

    public CategoriesHistorySpecification(CategoriesHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
