package rs.prepos.gcrm.service;

import rs.prepos.gcrm.domain.nodes.AccountManagerNode;
import rs.prepos.gcrm.domain.relationships.RelateRelationship;

import java.util.List;

public interface AccountManagerService {

    public List<RelateRelationship> connectWithCompanyByCity(String city);

    public AccountManagerNode makeDecisionForProduct(String productName);

}
