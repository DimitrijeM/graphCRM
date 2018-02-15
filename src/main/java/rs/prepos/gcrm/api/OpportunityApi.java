package rs.prepos.gcrm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rs.prepos.gcrm.dao.OpportunityRepository;
import rs.prepos.gcrm.domain.relationships.OpportunityRelationship;
import rs.prepos.gcrm.dto.OpportunityDto;


@RestController
@RequestMapping("/opportunity")
public class OpportunityApi {

    @Autowired
    OpportunityRepository opportunityRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<OpportunityRelationship> getAllOpportunities(){
        return opportunityRepository.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public @ResponseBody
    OpportunityRelationship getOpportunity(@PathVariable Long id){
        return opportunityRepository.findOne(id);
    }

    @RequestMapping(value = "/by-company-{company}", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<OpportunityRelationship>  getOpportunityByCompany(@PathVariable String company){
        return opportunityRepository.findByCompany_Name(company);
    }


    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    OpportunityRelationship postOpportunity(@RequestBody OpportunityRelationship opportunity){
        return opportunityRepository.save(opportunity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteOpportunity(@PathVariable Long id){
        opportunityRepository.delete(id);
    }
}
