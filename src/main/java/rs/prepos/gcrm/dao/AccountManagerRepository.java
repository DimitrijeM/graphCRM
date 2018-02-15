package rs.prepos.gcrm.dao;

import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.nodes.AccountManagerNode;

public interface AccountManagerRepository extends CrudRepository<AccountManagerNode, Long> {

    public Iterable<AccountManagerNode> findByCity(String city);

}
