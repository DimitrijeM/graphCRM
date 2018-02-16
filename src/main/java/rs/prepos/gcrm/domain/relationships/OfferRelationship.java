package rs.prepos.gcrm.domain.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import rs.prepos.gcrm.domain.nodes.CompanyNode;
import rs.prepos.gcrm.domain.nodes.ProductNode;

@RelationshipEntity(type = "Offer")
public class OfferRelationship {

    @GraphId
    Long id;

    @StartNode
    CompanyNode company;

    @EndNode
    ProductNode product;

    String name;

    Integer quantity;

    Double amount;


    public OfferRelationship() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompanyNode getCompany() {
        return company;
    }

    public void setCompany(CompanyNode company) {
        this.company = company;
    }

    public ProductNode getProduct() {
        return product;
    }

    public void setProduct(ProductNode product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
