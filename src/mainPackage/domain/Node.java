package mainPackage.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Node {
    private String name;
    private HashMap<String, Child> children;
    private String imageFileName;
    private Boolean isCollectSense = false;
}

@Builder
@AllArgsConstructor
@Getter
class Child {
    private final Node node;
    private final String description;
    private Node nextTest;
}
