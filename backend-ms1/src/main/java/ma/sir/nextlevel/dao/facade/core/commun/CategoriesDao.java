package ma.sir.nextlevel.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.sir.nextlevel.zynerator.repository.AbstractRepository;
import ma.sir.nextlevel.bean.core.commun.Categories;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CategoriesDao extends AbstractRepository<Categories,Long>  {


    @Query("SELECT NEW Categories(item.id,item.name) FROM Categories item")
    List<Categories> findAllOptimized();

}
