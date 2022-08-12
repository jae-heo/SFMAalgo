package mainPackage.v2.domain;

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
    private COLOR color;
    @Builder.Default
    private String nextSingleTestName = null;
    @Builder.Default
    private Node[] nextTest = null;
    @Builder.Default
    private Boolean isConditional = false;
    @Builder.Default
    private Node.SELECTION conditionSelection = null;
    @Builder.Default
    private String conditionNodeName = null;
    public enum COLOR {
        GREEN, RED, BLUE, ORANGE, WHITE
    }
}