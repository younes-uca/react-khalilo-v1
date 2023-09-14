package ma.sir.nextlevel.service.impl.admin.commun;


import ma.sir.nextlevel.bean.core.commun.Brands;
import ma.sir.nextlevel.bean.history.commun.BrandsHistory;
import ma.sir.nextlevel.dao.criteria.core.commun.BrandsCriteria;
import ma.sir.nextlevel.dao.criteria.history.commun.BrandsHistoryCriteria;
import ma.sir.nextlevel.dao.facade.core.commun.BrandsDao;
import ma.sir.nextlevel.dao.facade.history.commun.BrandsHistoryDao;
import ma.sir.nextlevel.dao.specification.core.commun.BrandsSpecification;
import ma.sir.nextlevel.service.facade.admin.commun.BrandsAdminService;
import ma.sir.nextlevel.zynerator.service.AbstractServiceImpl;
import ma.sir.nextlevel.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;
@Service
public class BrandsAdminServiceImpl extends AbstractServiceImpl<Brands,BrandsHistory, BrandsCriteria, BrandsHistoryCriteria, BrandsDao,
BrandsHistoryDao> implements BrandsAdminService {












    public void configure() {
        super.configure(Brands.class,BrandsHistory.class, BrandsHistoryCriteria.class, BrandsSpecification.class);
    }



    public BrandsAdminServiceImpl(BrandsDao dao, BrandsHistoryDao historyDao) {
        super(dao, historyDao);
    }

}