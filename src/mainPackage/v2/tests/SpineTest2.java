package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.GREEN;
import static mainPackage.v2.domain.Child.COLOR.RED;
import static mainPackage.v2.domain.Node.SELECTION.*;

public class SpineTest2 extends mainPackage.v2.tests.Test {
    public static mainPackage.v2.tests.Test instance;
    public SpineTest2() {
        Node node1 = Node.builder()
                .name("수동 누운자세 경추 신전")
                .imageFileName("1_7")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("There is Postural &/ or SMCD affecting Cervical Extension").build())
                .addChild(DN, Child.builder().color(GREEN).description("경추 신전 JMD 그리고/또는 TED").build())
                .addChild(P, Child.builder().color(RED).description("통증 치료").build());

        Node node0 = Node.builder()
                .name("능동 경추 신전")
                .imageFileName("0_2")
                .build()
                .addChild(FN, Child.builder().color(GREEN).build())
                .addChild(DN, Child.builder().color(GREEN).node(node1).build())
                .addChild(P, Child.builder().color(GREEN).node(node1).build());

        this.addNode(node1);
    }

    public static Test getInstance() {
        if (SpineTest2.instance == null) { SpineTest2.instance = new SpineTest2();}
        return instance;
    }
}
