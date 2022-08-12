package mainPackage.v2.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter
@Getter
@AllArgsConstructor
public class Node {
    private String name;
    @Builder.Default
    private HashMap<SELECTION, Child> children = new HashMap<>();
    private String imageFileName;
    private Boolean isCollectSense = false;
    @Builder
    public Node(String name, String imageFileName, Boolean isCollectSense) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.isCollectSense = isCollectSense;
    }

    public Node addChild(SELECTION selection, Child child) {
        this.children.put(selection, child);
        return this;
    }
    public enum SELECTION {
        FN("기능적, 통증없음"),
        DN("기능제한, 통증없음"),
        P("통증있음"),
        OSDN("한쪽 기능제한, 통증없음"),
        BSDN("양쪽 기능제한, 통증없음"),
        FNBNC("완전하지 않은 FN"),
        TOMASFN1("무릎 곧게 펴고, 기능적"),
        TOMASFN2("고관절 외전, 기능적"),
        TOMASFN3("무릎 곧게 펴고, 고관절 외전, 기능적");

        private final String name;

        private SELECTION(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}

