package mainPackage.v1.domain;

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
    @Builder.Default
    private Node nextTest1 = null;
    @Builder.Default
    private Node nextTest2 = null;

    public Child(String description) {
        this.node = null;
        this.description = description;
    }

    public Child (Node node, String description) {
        this.node = node;
        this.description = description;
    }
}
