package rs.prepos.gcrm.dao;

import org.springframework.data.repository.CrudRepository;
import rs.prepos.gcrm.domain.nodes.CompanyNode;

public interface CompanyRepository extends CrudRepository<CompanyNode, Long> {

    public Iterable<CompanyNode> findByName(String name);

    public Iterable<CompanyNode> findByCity(String city);

}
