package ma.sir.nextlevel.zynerator.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.sir.nextlevel.zynerator.security.bean.Permission;

public interface PermissionDao extends JpaRepository<Permission, Long> {
    public Permission findByName(String name);
}
