package rs.prepos.gcrm.dto;

public class OpportunityDto {

    Long id;

    Long companyId;

    Long productId;

    String name;

    Double opportunityAmount;

    Long expectedCloseDateTimestamp;

    String salesStage;

    public OpportunityDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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
