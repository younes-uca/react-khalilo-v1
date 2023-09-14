package ma.sir.nextlevel.dao.facade.history.commun;

import ma.sir.nextlevel.zynerator.repository.AbstractHistoryRepository;
import ma.sir.nextlevel.bean.history.commun.CategoriesHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesHistoryDao extends AbstractHistoryRepository<CategoriesHistory,Long> {

}
