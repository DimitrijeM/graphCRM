package rs.prepos.gcrm.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.prepos.gcrm.dao.SalesDirectorRepository;
import rs.prepos.gcrm.domain.nodes.SalesDirectorNode;

@RestController
@RequestMapping("/salesdirector")
public class SalesDirectorApi {

    @Autowired
    SalesDirectorRepository salesDirectorRepository;

    @RequestMapping("/")
    public Iterable<SalesDirectorNode> getAllSalesDirectors(){
        return salesDirectorRepository.findAll();
    }

}
