package rs.prepos.gcrm.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.prepos.gcrm.dao.AccountManagerRepository;
import rs.prepos.gcrm.dao.SalesDirectorRepository;
import rs.prepos.gcrm.domain.nodes.AccountManagerNode;
import rs.prepos.gcrm.domain.nodes.SalesDirectorNode;
import rs.prepos.gcrm.service.AccountManagerService;

@RestController
@RequestMapping("/salesdirector")
public class SalesDirectorApi {

    @Autowired
    SalesDirectorRepository salesDirectorRepository;

    @Autowired
    AccountManagerService accountManagerService;


    @RequestMapping("/")
    public Iterable<SalesDirectorNode> getAllSalesDirectors(){
        return salesDirectorRepository.findAll();
    }

    @RequestMapping("/decision/{productName}")
    public AccountManagerNode getRecommendation(@PathVariable String productName){
        return accountManagerService.makeDecisionForProduct(productName);
    }

}
