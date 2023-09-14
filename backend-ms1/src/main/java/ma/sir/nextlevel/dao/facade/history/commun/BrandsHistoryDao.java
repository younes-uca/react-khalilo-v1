package ma.sir.nextlevel.dao.facade.history.commun;

import ma.sir.nextlevel.zynerator.repository.AbstractHistoryRepository;
import ma.sir.nextlevel.bean.history.commun.BrandsHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsHistoryDao extends AbstractHistoryRepository<BrandsHistory,Long> {

}
