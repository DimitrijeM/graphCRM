package rs.prepos.gcrm.dao;

import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.relationships.OfferRelationship;
import rs.prepos.gcrm.domain.relationships.OpportunityRelationship;

public interface OfferRepository extends CrudRepository<OfferRelationship, Long>{

    Iterable<OfferRelationship> findByCompany_Name(String name);

}
