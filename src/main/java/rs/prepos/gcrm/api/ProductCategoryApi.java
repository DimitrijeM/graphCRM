package rs.prepos.gcrm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.prepos.gcrm.dao.CategoryRepository;
import rs.prepos.gcrm.domain.nodes.CategoryNode;
import rs.prepos.gcrm.domain.nodes.SalesDirectorNode;

@RestController
@RequestMapping("product-category")
public class ProductCategoryApi {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/")
    public Iterable<CategoryNode> getAllProductCategories(){
        return categoryRepository.findAll();
    }
}
