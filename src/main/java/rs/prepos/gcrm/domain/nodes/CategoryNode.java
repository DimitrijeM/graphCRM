package rs.prepos.gcrm.domain.nodes;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity(label = "Category")
public class CategoryNode {

    @GraphId
    Long id;

    String name;

    @Relationship(type = "PART_OF", direction = Relationship.INCOMING)
    private List<ProductNode> productNodes;

    public CategoryNode() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductNode> getProductNodes() {
        return productNodes;
    }

    public void setProductNodes(List<ProductNode> productNodes) {
        this.productNodes = productNodes;
    }
}
