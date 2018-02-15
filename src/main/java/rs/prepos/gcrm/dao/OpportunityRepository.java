package rs.prepos.gcrm.dao;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.relationships.OpportunityRelationship;

public interface OpportunityRepository extends GraphRepository<OpportunityRelationship> {

    Iterable<OpportunityRelationship> findByCompany_Name(String name);


}
