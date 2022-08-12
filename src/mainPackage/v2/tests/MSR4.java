package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.*;
import static mainPackage.v2.domain.Node.SELECTION.*;
public class MSR4 extends mainPackage.v2.tests.Test {
    public static mainPackage.v2.tests.Test instance;
    public MSR4() {
        Node node1 = Node.builder()
                .name("수동 앉은자세 경골 내회전 20도")
                .imageFileName("5_18")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("경골회전 SMCD").build())
                .addChild(DN, Child.builder().color(GREEN).description("경골 내회전 TED &/or JMD").build())
                .addChild(P, Child.builder().color(RED).description("통증 치료").build());

        Node node0 = Node.builder()
                .name("능동 앉은자세 경골 내회전 20도")
                .imageFileName("5_17")
                .build()
                .addChild(FN, Child.builder().color(BLUE).description("경골 내회전 가동성 정상")
                        .nextTest(new Node[]{MSE2.getInstance().getHead()}).build())
                .addChild(DN, Child.builder().color(WHITE).node(node1).build())
                .addChild(P, Child.builder().color(WHITE).node(node1).build());

        this.addNode(node0, node1);
    }

    public static Test getInstance() {
        if (MSR4.instance == null) { MSR4.instance = new MSR4();}
        return instance;
    }
}
