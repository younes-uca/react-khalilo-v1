package ma.sir.nextlevel.service.impl.admin.commun;


import ma.sir.nextlevel.bean.core.commun.Categories;
import ma.sir.nextlevel.bean.history.commun.CategoriesHistory;
import ma.sir.nextlevel.dao.criteria.core.commun.CategoriesCriteria;
import ma.sir.nextlevel.dao.criteria.history.commun.CategoriesHistoryCriteria;
import ma.sir.nextlevel.dao.facade.core.commun.CategoriesDao;
import ma.sir.nextlevel.dao.facade.history.commun.CategoriesHistoryDao;
import ma.sir.nextlevel.dao.specification.core.commun.CategoriesSpecification;
import ma.sir.nextlevel.service.facade.admin.commun.CategoriesAdminService;
import ma.sir.nextlevel.zynerator.service.AbstractServiceImpl;
import ma.sir.nextlevel.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;
@Service
public class CategoriesAdminServiceImpl extends AbstractServiceImpl<Categories,CategoriesHistory, CategoriesCriteria, CategoriesHistoryCriteria, CategoriesDao,
CategoriesHistoryDao> implements CategoriesAdminService {












    public void configure() {
        super.configure(Categories.class,CategoriesHistory.class, CategoriesHistoryCriteria.class, CategoriesSpecification.class);
    }



    public CategoriesAdminServiceImpl(CategoriesDao dao, CategoriesHistoryDao historyDao) {
        super(dao, historyDao);
    }

}