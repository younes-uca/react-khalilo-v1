package ma.sir.nextlevel.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.sir.nextlevel.zynerator.repository.AbstractRepository;
import ma.sir.nextlevel.bean.core.commun.Products;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProductsDao extends AbstractRepository<Products,Long>  {

    List<Products> findByCategoriesId(Long id);
    int deleteByCategoriesId(Long id);
    List<Products> findByBrandsId(Long id);
    int deleteByBrandsId(Long id);

    @Query("SELECT NEW Products(item.id,item.name) FROM Products item")
    List<Products> findAllOptimized();

}
