package rs.prepos.gcrm.dao;

import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.nodes.CategoryNode;

public interface CategoryRepository extends CrudRepository<CategoryNode, Long> {

}
