package mainPackage.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

import static mainPackage.App.nodeMap;

@Setter
@Getter
@AllArgsConstructor
public class Node {
    private String name;
    @Builder.Default
    private HashMap<String, Child> children = new HashMap<>();
    private String imageFileName;
    private Boolean isCollectSense = false;
    @Builder
    public Node(String name, String imageFileName, Boolean isCollectSense) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.isCollectSense = isCollectSense;
        nodeMap.put(name, this);
    }

    public Node addChild(String selection, Child child) {
        this.children.put(selection, child);
        return this;
    }
}

