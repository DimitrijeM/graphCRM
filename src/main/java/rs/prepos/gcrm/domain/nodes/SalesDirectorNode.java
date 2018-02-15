package rs.prepos.gcrm.domain.nodes;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity(label = "SalesDirector")
public class SalesDirectorNode {

    @GraphId
    Long id;

    String name;

    @Relationship(type = "MANAGES", direction = Relationship.OUTGOING)
    private List<AccountManagerNode> accountManagerNodes;

    public SalesDirectorNode() {
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

    public List<AccountManagerNode> getAccountManagerNodes() {
        return accountManagerNodes;
    }

    public void setAccountManagerNodes(List<AccountManagerNode> accountManagerNodes) {
        this.accountManagerNodes = accountManagerNodes;
    }
}
