package mainPackage.v1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class NodePrint {
    Node node;
    String selection;
    String description;
}
