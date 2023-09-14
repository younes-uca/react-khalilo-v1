package ma.sir.nextlevel.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.sir.nextlevel.zynerator.repository.AbstractRepository;
import ma.sir.nextlevel.bean.core.commun.Brands;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface BrandsDao extends AbstractRepository<Brands,Long>  {


    @Query("SELECT NEW Brands(item.id,item.name) FROM Brands item")
    List<Brands> findAllOptimized();

}
