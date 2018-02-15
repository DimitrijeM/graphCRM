package rs.prepos.gcrm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rs.prepos.gcrm.dao.CompanyRepository;
import rs.prepos.gcrm.domain.nodes.CompanyNode;


@RestController
@RequestMapping("/company")
public class CompanyApi {

    @Autowired
    CompanyRepository companyRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody Iterable<CompanyNode> getAllCompanies(){
        return companyRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    CompanyNode getCompany(@PathVariable Long id){
        return companyRepository.findOne(id);
    }

    @RequestMapping(value = "/byname-{name}", method = RequestMethod.GET)
    public @ResponseBody Iterable<CompanyNode>  findCompanyByName(@PathVariable String name){
        return companyRepository.findByName(name);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    CompanyNode postCompany(@RequestBody CompanyNode company){
        return companyRepository.save(company);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCompany(@PathVariable Long id){
        companyRepository.delete(id);
    }
}
