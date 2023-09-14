package ma.sir.nextlevel.zynerator.process;

import ma.sir.nextlevel.zynerator.audit.AuditBusinessObject;

public interface AbstractProcess<I extends AbstractProcessInput, K extends AbstractProcessOutput, T extends AuditBusinessObject> {
    Result<I, K, T> execute(I input);
}
