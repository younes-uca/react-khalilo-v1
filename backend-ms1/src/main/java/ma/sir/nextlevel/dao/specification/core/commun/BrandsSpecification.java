package  ma.sir.nextlevel.dao.specification.core.commun;

import ma.sir.nextlevel.zynerator.specification.AbstractSpecification;
import ma.sir.nextlevel.dao.criteria.core.commun.BrandsCriteria;
import ma.sir.nextlevel.bean.core.commun.Brands;


public class BrandsSpecification extends  AbstractSpecification<BrandsCriteria, Brands>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("name", criteria.getName(),criteria.getNameLike());
    }

    public BrandsSpecification(BrandsCriteria criteria) {
        super(criteria);
    }

    public BrandsSpecification(BrandsCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
