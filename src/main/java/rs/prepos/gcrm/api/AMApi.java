package rs.prepos.gcrm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rs.prepos.gcrm.dao.AccountManagerRepository;
import rs.prepos.gcrm.domain.nodes.AccountManagerNode;
import rs.prepos.gcrm.domain.relationships.RelateRelationship;
import rs.prepos.gcrm.service.AccountManagerService;

import java.util.List;


@RestController
@RequestMapping("/accmanagers")
public class AMApi {

    @Autowired
    AccountManagerService accountManagerService;

    @Autowired
    AccountManagerRepository accountManagerRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<AccountManagerNode> getAllAMs(){
        return accountManagerRepository.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public AccountManagerNode getAllAMs(@PathVariable Long id){
        return accountManagerRepository.findOne(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public AccountManagerNode saveAM(@RequestBody AccountManagerNode accountManager){
        return accountManagerRepository.save(accountManager);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteAM(@PathVariable Long id){
        accountManagerRepository.delete(id);
    }


    @RequestMapping(value = "/connect-by-city-{city}", method = RequestMethod.GET)
    public List<RelateRelationship> connectWithCompanies(@PathVariable String city) {
        return accountManagerService.connectWithCompanyByCity(city);
    }
}
