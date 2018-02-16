package rs.prepos.gcrm.domain.relationships;


import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import rs.prepos.gcrm.domain.nodes.CompanyNode;
import rs.prepos.gcrm.domain.nodes.ProductNode;

@RelationshipEntity(type = "Contract")
public class ContractRelationship {

    @GraphId
    Long id;

    @StartNode
    CompanyNode company;

    @EndNode
    ProductNode product;

    Long startTimestamp;

    Long endTimestamp;

    String type;

    Double amount;

    public ContractRelationship() {
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

    public Long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public Long getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
