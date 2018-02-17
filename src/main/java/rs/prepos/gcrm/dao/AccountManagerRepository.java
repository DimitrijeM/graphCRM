package rs.prepos.gcrm.dao;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.nodes.AccountManagerNode;

public interface AccountManagerRepository extends CrudRepository<AccountManagerNode, Long> {


//    findAll, findById, remove, save
    public Iterable<AccountManagerNode> findByCity(String city);

    @Query("MATCH sp = (am:AccountManager { name: {0} })-[*]->(p:Product { name: {1} })" +
            " RETURN count(sp)")
    public Integer countSalesProcessesForProduct(String amName, String productName);

}
