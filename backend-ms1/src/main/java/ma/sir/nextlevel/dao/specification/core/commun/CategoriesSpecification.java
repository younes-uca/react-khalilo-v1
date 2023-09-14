package  ma.sir.nextlevel.dao.specification.core.commun;

import ma.sir.nextlevel.zynerator.specification.AbstractSpecification;
import ma.sir.nextlevel.dao.criteria.core.commun.CategoriesCriteria;
import ma.sir.nextlevel.bean.core.commun.Categories;


public class CategoriesSpecification extends  AbstractSpecification<CategoriesCriteria, Categories>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("name", criteria.getName(),criteria.getNameLike());
        addPredicateInt("sortby", criteria.getSortby(), criteria.getSortbyMin(), criteria.getSortbyMax());
        addPredicateInt("categorieId", criteria.getCategorieId(), criteria.getCategorieIdMin(), criteria.getCategorieIdMax());
    }

    public CategoriesSpecification(CategoriesCriteria criteria) {
        super(criteria);
    }

    public CategoriesSpecification(CategoriesCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
