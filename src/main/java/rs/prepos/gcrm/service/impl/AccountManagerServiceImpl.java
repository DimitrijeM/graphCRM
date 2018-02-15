package rs.prepos.gcrm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.prepos.gcrm.dao.AccountManagerRepository;
import rs.prepos.gcrm.dao.AmRelateCompanyRepository;
import rs.prepos.gcrm.dao.CompanyRepository;
import rs.prepos.gcrm.domain.nodes.AccountManagerNode;
import rs.prepos.gcrm.domain.nodes.CompanyNode;
import rs.prepos.gcrm.domain.relationships.AmRelateCompanyRelationship;
import rs.prepos.gcrm.service.AccountManagerService;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountManagerServiceImpl implements AccountManagerService {

    @Autowired
    AccountManagerRepository accountManagerRepository;

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    AmRelateCompanyRepository amRelateCompanyRepository;

    public List<AmRelateCompanyRelationship>  connectWithCompanyByCity(String city){
        Iterable<AccountManagerNode> accMens = accountManagerRepository.findByCity(city);
        AccountManagerNode myAccMen = accMens.iterator().next(); // i know that is one manager in each city

        Iterable<CompanyNode> companies = companyRepository.findByCity(city);

        List<AmRelateCompanyRelationship> connections = new ArrayList<>();
        Long since = System.currentTimeMillis();
        for (CompanyNode company:companies) {
            AmRelateCompanyRelationship amRelateCompanyRelationship =
                    new AmRelateCompanyRelationship(myAccMen, company, since);
            connections.add(amRelateCompanyRelationship);
        }
        amRelateCompanyRepository.save(connections);
        return connections;
    }

}
