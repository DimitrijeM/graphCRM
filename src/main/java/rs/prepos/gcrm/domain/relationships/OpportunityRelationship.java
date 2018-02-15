package rs.prepos.gcrm.domain.relationships;

import org.neo4j.ogm.annotation.*;
import rs.prepos.gcrm.domain.nodes.CompanyNode;
import rs.prepos.gcrm.domain.nodes.ProductNode;

@RelationshipEntity(type = "Opportunity")
public class OpportunityRelationship {

    @GraphId
    Long id;

    @StartNode
    CompanyNode company;

    @EndNode
    ProductNode product;

    String name;

    Double opportunityAmount;

    Long expectedCloseDateTimestamp;

    String salesStage;



    public OpportunityRelationship() {
    }

    public OpportunityRelationship(CompanyNode company, ProductNode product, String name,
                                   Double opportunityAmount, Long expectedCloseDateTimestamp, String salesStage) {
        this.company = company;
        this.product = product;
        this.name = name;
        this.opportunityAmount = opportunityAmount;
        this.expectedCloseDateTimestamp = expectedCloseDateTimestamp;
        this.salesStage = salesStage;
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

    public Double getOpportunityAmount() {
        return opportunityAmount;
    }

    public void setOpportunityAmount(Double opportunityAmount) {
        this.opportunityAmount = opportunityAmount;
    }

    public Long getExpectedCloseDateTimestamp() {
        return expectedCloseDateTimestamp;
    }

    public void setExpectedCloseDateTimestamp(Long expectedCloseDateTimestamp) {
        this.expectedCloseDateTimestamp = expectedCloseDateTimestamp;
    }

    public String getSalesStage() {
        return salesStage;
    }

    public void setSalesStage(String salesStage) {
        this.salesStage = salesStage;
    }
}
