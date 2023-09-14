package ma.sir.nextlevel.zynerator.service;

import ma.sir.nextlevel.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.nextlevel.zynerator.criteria.BaseCriteria;
import ma.sir.nextlevel.zynerator.history.HistBusinessObject;
import ma.sir.nextlevel.zynerator.history.HistCriteria;
import ma.sir.nextlevel.zynerator.repository.AbstractHistoryRepository;
import ma.sir.nextlevel.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}