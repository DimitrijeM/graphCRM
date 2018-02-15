package rs.prepos.gcrm.dao;

import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.nodes.SalesDirectorNode;

public interface SalesDirectorRepository extends CrudRepository<SalesDirectorNode, Long> {
}
