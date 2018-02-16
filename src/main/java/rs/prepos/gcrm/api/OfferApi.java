package rs.prepos.gcrm.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rs.prepos.gcrm.dao.OfferRepository;
import rs.prepos.gcrm.domain.relationships.OfferRelationship;

@RestController
@RequestMapping("/offer")
public class OfferApi {

    @Autowired
    OfferRepository offerRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<OfferRelationship> getAllOpportunities(){
        return offerRepository.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public @ResponseBody
    OfferRelationship getOffer(@PathVariable Long id){
        return offerRepository.findOne(id);
    }

    @RequestMapping(value = "/by-company-{company}", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<OfferRelationship>  getOfferByCompany(@PathVariable String company){
        return offerRepository.findByCompany_Name(company);
    }


    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    OfferRelationship postOffer(@RequestBody OfferRelationship offer){
        return offerRepository.save(offer);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteOffer(@PathVariable Long id){
        offerRepository.delete(id);
    }
}
