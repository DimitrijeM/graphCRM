package rs.prepos.gcrm.dao;

import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.nodes.ProductNode;

public interface ProductRepository extends CrudRepository<ProductNode, Long>{

    public Iterable<ProductNode> findByName(String name);

}
