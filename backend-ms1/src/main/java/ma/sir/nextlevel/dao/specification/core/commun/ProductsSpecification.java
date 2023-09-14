package  ma.sir.nextlevel.dao.specification.core.commun;

import ma.sir.nextlevel.zynerator.specification.AbstractSpecification;
import ma.sir.nextlevel.dao.criteria.core.commun.ProductsCriteria;
import ma.sir.nextlevel.bean.core.commun.Products;


public class ProductsSpecification extends  AbstractSpecification<ProductsCriteria, Products>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("productId", criteria.getProductId(), criteria.getProductIdMin(), criteria.getProductIdMax());
        addPredicateInt("prixVente", criteria.getPrixVente(), criteria.getPrixVenteMin(), criteria.getPrixVenteMax());
        addPredicate("name", criteria.getName(),criteria.getNameLike());
        addPredicate("image", criteria.getImage(),criteria.getImageLike());
        addPredicate("commentaire", criteria.getCommentaire(),criteria.getCommentaireLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateBigDecimal("quantite", criteria.getQuantite(), criteria.getQuantiteMin(), criteria.getQuantiteMax());
        addPredicateInt("prixPromo", criteria.getPrixPromo(), criteria.getPrixPromoMin(), criteria.getPrixPromoMax());
        addPredicateInt("prixRevendeur", criteria.getPrixRevendeur(), criteria.getPrixRevendeurMin(), criteria.getPrixRevendeurMax());
        addPredicateBigDecimal("quantiteMarrakech", criteria.getQuantiteMarrakech(), criteria.getQuantiteMarrakechMin(), criteria.getQuantiteMarrakechMax());
        addPredicateBigDecimal("quantiteRabat", criteria.getQuantiteRabat(), criteria.getQuantiteRabatMin(), criteria.getQuantiteRabatMax());
        addPredicate("barCode", criteria.getBarCode(),criteria.getBarCodeLike());
        addPredicateFk("categories","id", criteria.getCategories()==null?null:criteria.getCategories().getId());
        addPredicateFk("categories","id", criteria.getCategoriess());
        addPredicateFk("brands","id", criteria.getBrands()==null?null:criteria.getBrands().getId());
        addPredicateFk("brands","id", criteria.getBrandss());
    }

    public ProductsSpecification(ProductsCriteria criteria) {
        super(criteria);
    }

    public ProductsSpecification(ProductsCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
