package ma.sir.nextlevel.dao.facade.history.commun;

import ma.sir.nextlevel.zynerator.repository.AbstractHistoryRepository;
import ma.sir.nextlevel.bean.history.commun.ProductsHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsHistoryDao extends AbstractHistoryRepository<ProductsHistory,Long> {

}
