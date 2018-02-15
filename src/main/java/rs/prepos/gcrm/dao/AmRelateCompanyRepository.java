package rs.prepos.gcrm.dao;

import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.relationships.AmRelateCompanyRelationship;

public interface AmRelateCompanyRepository extends CrudRepository<AmRelateCompanyRelationship, Long> {
}
