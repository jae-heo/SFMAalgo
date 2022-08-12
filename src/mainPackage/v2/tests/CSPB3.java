package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.*;
import static mainPackage.v2.domain.Node.SELECTION.*;
public class CSPB3 extends mainPackage.v2.tests.Test {
    public static mainPackage.v2.tests.Test instance;
    public CSPB3() {
        Node node3 = Node.builder()
                .name("수동 누운자세 C1-C2 경추 굴곡-회전 40도")
                .imageFileName("1_6")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("수동 누운자세 경추 회전이 (PSCR) DP or DN 이면" +
                        " 하부 경추 회전 JMD &/or TED로 치료한다. 만약 PSCR가 FP 이면 SMCD일 수 있다. - 분절검사를 " +
                        "실행하고 연부조직 평가를 한다.").build())
                .addChild(DN, Child.builder().color(GREEN).description("C1-C2 JMD &/ or TED &/or 하부 경추 JMD &/or TED.").build())
                .addChild(P, Child.builder().color(RED).description("화학 통증을 치료한다").build());

        Node node2 = Node.builder()
                .name("수동 누운자세 경추 회전 80도")
                .imageFileName("1_5")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("능동 경추 회전 SMCD").build())
                .addChild(DN, Child.builder().color(WHITE).node(node3).build())
                .addChild(P, Child.builder().color(WHITE).node(node3).build());

        Node node1 = Node.builder()
                .name("능동 누운자세 경추 회전 80도")
                .imageFileName("1_4")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("만약 경추 굴곡이 DN이면 - 굴곡을 먼저 치료한다. " +
                        "그렇지 않으면, 자세 and/or SMCD가 경추회전에 영향을 준다. 이것은 경추, 흉추, 그리고 어깨대 자세 " +
                        "기능제한을 포함한다.").build())
                .addChild(DN, Child.builder().color(WHITE).node(node2).build())
                .addChild(P, Child.builder().color(WHITE).node(node2).build());

        Node node0 = Node.builder()
                .name("능동 경추 회전-측면 굽힘")
                .imageFileName("0_3")
                .build()
                .addChild(FN, Child.builder().color(GREEN).build())
                .addChild(DN, Child.builder().color(GREEN).node(node1).build())
                .addChild(P, Child.builder().color(GREEN).node(node1).build());

        this.addNode(node1, node2, node3);
    }

    public static Test getInstance() {
        if (CSPB3.instance == null) { CSPB3.instance = new CSPB3();}
        return instance;
    }
}
