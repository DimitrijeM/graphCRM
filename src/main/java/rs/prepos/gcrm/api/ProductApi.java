package rs.prepos.gcrm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rs.prepos.gcrm.dao.CompanyRepository;
import rs.prepos.gcrm.dao.ProductRepository;
import rs.prepos.gcrm.domain.nodes.CompanyNode;
import rs.prepos.gcrm.domain.nodes.ProductNode;

@RestController
@RequestMapping("/product")
public class ProductApi {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ProductNode> getAllProducts(){
        return productRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ProductNode getProduct(@PathVariable Long id){
        return productRepository.findOne(id);
    }

    @RequestMapping(value = "/byname-{name}", method = RequestMethod.GET)
    public @ResponseBody Iterable<ProductNode>  findProductByName(@PathVariable String name){
        return productRepository.findByName(name);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ProductNode postProduct(@RequestBody ProductNode productNode){
        return productRepository.save(productNode);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable Long id){
        productRepository.delete(id);
    }
}
