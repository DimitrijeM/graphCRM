package rs.prepos.gcrm.domain.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import rs.prepos.gcrm.domain.nodes.AccountManagerNode;
import rs.prepos.gcrm.domain.nodes.CompanyNode;

@RelationshipEntity(type = "RELATE")
public class RelateRelationship {

    @GraphId
    Long id;

    @StartNode
    AccountManagerNode accountManagerNode;

    @EndNode
    CompanyNode companyNode;

    Long since;

    public RelateRelationship() {
    }

    public RelateRelationship(AccountManagerNode accountManagerNode, CompanyNode companyNode, Long since) {
        this.accountManagerNode = accountManagerNode;
        this.companyNode = companyNode;
        this.since = since;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccountManagerNode getAccountManagerNode() {
        return accountManagerNode;
    }

    public void setAccountManagerNode(AccountManagerNode accountManagerNode) {
        this.accountManagerNode = accountManagerNode;
    }

    public CompanyNode getCompanyNode() {
        return companyNode;
    }

    public void setCompanyNode(CompanyNode companyNode) {
        this.companyNode = companyNode;
    }

    public Long getSince() {
        return since;
    }

    public void setSince(Long since) {
        this.since = since;
    }
}
