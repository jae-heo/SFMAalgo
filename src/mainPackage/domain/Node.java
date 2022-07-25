package mainPackage.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Node {
    private String name;
    @Builder.Default
    private HashMap<String, Child> children = new HashMap<>();
    private String imageFileName;
    private Boolean isCollectSense = false;

    public Node addChild(String selection, Child child) {
        this.children.put(selection, child);
        return this;
    }
}

