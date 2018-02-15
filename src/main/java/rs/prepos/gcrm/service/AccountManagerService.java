package rs.prepos.gcrm.service;

import rs.prepos.gcrm.domain.relationships.AmRelateCompanyRelationship;

import java.util.List;

public interface AccountManagerService {

    public List<AmRelateCompanyRelationship> connectWithCompanyByCity(String city);
}
