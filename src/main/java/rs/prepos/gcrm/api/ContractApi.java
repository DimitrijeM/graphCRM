package rs.prepos.gcrm.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rs.prepos.gcrm.dao.ContractRepository;
import rs.prepos.gcrm.domain.relationships.ContractRelationship;

@RestController
@RequestMapping("/contract")
public class ContractApi {

    @Autowired
    ContractRepository contractRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ContractRelationship> getAllContracts(){
        return contractRepository.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ContractRelationship getContract(@PathVariable Long id){
        return contractRepository.findOne(id);
    }

    @RequestMapping(value = "/by-company-{company}", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ContractRelationship>  getContractByCompany(@PathVariable String company){
        return contractRepository.findByCompany_Name(company);
    }


    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ContractRelationship postContract(@RequestBody ContractRelationship contract){
        return contractRepository.save(contract);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteContract(@PathVariable Long id){
        contractRepository.delete(id);
    }
}
