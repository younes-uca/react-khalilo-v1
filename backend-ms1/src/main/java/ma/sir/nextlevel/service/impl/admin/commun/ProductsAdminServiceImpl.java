package ma.sir.nextlevel.service.impl.admin.commun;


import ma.sir.nextlevel.bean.core.commun.Products;
import ma.sir.nextlevel.bean.history.commun.ProductsHistory;
import ma.sir.nextlevel.dao.criteria.core.commun.ProductsCriteria;
import ma.sir.nextlevel.dao.criteria.history.commun.ProductsHistoryCriteria;
import ma.sir.nextlevel.dao.facade.core.commun.ProductsDao;
import ma.sir.nextlevel.dao.facade.history.commun.ProductsHistoryDao;
import ma.sir.nextlevel.dao.specification.core.commun.ProductsSpecification;
import ma.sir.nextlevel.service.facade.admin.commun.ProductsAdminService;
import ma.sir.nextlevel.zynerator.service.AbstractServiceImpl;
import ma.sir.nextlevel.zynerator.service.Attribute;
import ma.sir.nextlevel.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;


import ma.sir.nextlevel.zynerator.util.VelocityPdf;
import ma.sir.nextlevel.ws.dto.commun.ProductsDto;
import org.springframework.http.HttpEntity;

import org.springframework.beans.factory.annotation.Autowired;

import ma.sir.nextlevel.service.facade.admin.commun.BrandsAdminService ;
import ma.sir.nextlevel.bean.core.commun.Brands ;
import ma.sir.nextlevel.service.facade.admin.commun.CategoriesAdminService ;
import ma.sir.nextlevel.bean.core.commun.Categories ;


import java.util.List;
@Service
public class ProductsAdminServiceImpl extends AbstractServiceImpl<Products,ProductsHistory, ProductsCriteria, ProductsHistoryCriteria, ProductsDao,
ProductsHistoryDao> implements ProductsAdminService {
    public static final String TEMPLATE = "template/products.vm";
    public static final String FILE_NAME = "products.pdf";
public static final List<Attribute> ATTRIBUTES = new ArrayList();
    static{


    ATTRIBUTES.add(new Attribute("productId","Integer"));



    ATTRIBUTES.add(new Attribute("prixVente","Integer"));

    ATTRIBUTES.add(new Attribute("name"));

    ATTRIBUTES.add(new Attribute("image"));

    ATTRIBUTES.add(new Attribute("commentaire"));

    ATTRIBUTES.add(new Attribute("code"));

    ATTRIBUTES.add(new Attribute("quantite","BigDecimal"));

    ATTRIBUTES.add(new Attribute("prixPromo","Integer"));

    ATTRIBUTES.add(new Attribute("prixRevendeur","Integer"));

    ATTRIBUTES.add(new Attribute("quantiteMarrakech","BigDecimal"));

    ATTRIBUTES.add(new Attribute("quantiteRabat","BigDecimal"));

    ATTRIBUTES.add(new Attribute("barCode"));
    }

    @Override
    public HttpEntity<byte[]> createPdf(ProductsDto dto) throws Exception{
        return velocityPdf.createPdf(FILE_NAME, TEMPLATE, dto);
    }





    public List<Products> findByCategoriesId(Long id){
        return dao.findByCategoriesId(id);
    }
    public int deleteByCategoriesId(Long id){
        return dao.deleteByCategoriesId(id);
    }
    public List<Products> findByBrandsId(Long id){
        return dao.findByBrandsId(id);
    }
    public int deleteByBrandsId(Long id){
        return dao.deleteByBrandsId(id);
    }



    @Override
    protected List<Attribute> getAttributes() {
        return ATTRIBUTES;
    }



    public void configure() {
        super.configure(Products.class,ProductsHistory.class, ProductsHistoryCriteria.class, ProductsSpecification.class);
    }


    @Autowired
    private BrandsAdminService brandsService ;
    @Autowired
    private CategoriesAdminService categoriesService ;
    @Autowired
    private VelocityPdf velocityPdf;

    public ProductsAdminServiceImpl(ProductsDao dao, ProductsHistoryDao historyDao) {
        super(dao, historyDao);
    }

}