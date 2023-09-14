package ma.sir.nextlevel.service.facade.admin.commun;

import java.util.List;
import ma.sir.nextlevel.bean.core.commun.Products;
import ma.sir.nextlevel.dao.criteria.core.commun.ProductsCriteria;
import ma.sir.nextlevel.dao.criteria.history.commun.ProductsHistoryCriteria;
import ma.sir.nextlevel.zynerator.service.IService;

import ma.sir.nextlevel.ws.dto.commun.ProductsDto;
import org.springframework.http.HttpEntity;

public interface ProductsAdminService extends  IService<Products,ProductsCriteria, ProductsHistoryCriteria>  {

    List<Products> findByCategoriesId(Long id);
    int deleteByCategoriesId(Long id);
    List<Products> findByBrandsId(Long id);
    int deleteByBrandsId(Long id);


    HttpEntity<byte[]> createPdf(ProductsDto dto) throws Exception;

}
