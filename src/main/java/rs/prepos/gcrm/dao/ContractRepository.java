package rs.prepos.gcrm.dao;

import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.relationships.ContractRelationship;
import rs.prepos.gcrm.domain.relationships.OfferRelationship;

public interface ContractRepository extends CrudRepository<ContractRelationship, Long>{

    Iterable<ContractRelationship> findByCompany_Name(String name);

}
