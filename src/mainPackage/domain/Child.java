package mainPackage.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Child {
    private Node node;
    private String description;
    private Node nextTest;

    public Child(String description) {
        this.node = null;
        this.description = description;
        nextTest = null;
    }

    public Child (Node node, String description) {
        this.node = node;
        this.description = description;
    }
}
