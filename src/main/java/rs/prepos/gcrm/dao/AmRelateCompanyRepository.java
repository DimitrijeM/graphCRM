package rs.prepos.gcrm.dao;

import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.relationships.RelateRelationship;

public interface AmRelateCompanyRepository extends CrudRepository<RelateRelationship, Long> {

}
