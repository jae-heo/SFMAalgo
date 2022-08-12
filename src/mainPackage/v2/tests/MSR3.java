package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.*;
import static mainPackage.v2.domain.Node.SELECTION.*;
public class MSR3 extends mainPackage.v2.tests.Test {
    public static mainPackage.v2.tests.Test instance;
    public MSR3() {
        Node node6 = Node.builder()
                .name("롤링")
                .imageFileName("4_11")
                .build()
                .addChild(FN, Child.builder().color(BLUE).description("체중지지 고관절 내회전 SMCD")
                        .nextTest(new Node[]{MSR4.getInstance().getHead(), MSR5.getInstance().getHead()}).build())
                .addChild(DN, Child.builder().color(BLUE).description("펀더먼털 고관절 회전 SMCD")
                        .nextTest(new Node[]{MSR4.getInstance().getHead(), MSR5.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).description("통증 치료")
                        .nextTest(new Node[]{MSR4.getInstance().getHead(), MSR5.getInstance().getHead()}).build());

        Node node5 = Node.builder()
                .name("수동 엎드린자세 고관절 내회전 30도")
                .imageFileName("5_14")
                .build()
                .addChild(FN, Child.builder().color(WHITE).description("앉은자세 수동 회전 DN을 치료").isConditional(true)
                        .conditionSelection(DN).conditionNodeName("수동 앉은자세 고관절 내회전 30도").node(node6).build())
                .addChild(DN, Child.builder().color(BLUE).description("고관절 내회전 + 신전에서 고관절 JMD &/or TED")
                        .nextTest(new Node[]{MSR4.getInstance().getHead(), MSR5.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).description("통증 치료")
                        .nextTest(new Node[]{MSR4.getInstance().getHead(), MSR5.getInstance().getHead()}).build());

        Node node4 = Node.builder()
                .name("능동 엎드린자세 고관절 내회전 30도")
                .imageFileName("5_13")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node6).description("앉은자세 수동 회전 DN을 치료").isConditional(true)
                        .conditionSelection(DN).conditionNodeName("수동 앉은자세 고관절 내회전 30도").build())
                .addChild(DN, Child.builder().color(WHITE).node(node5).build())
                .addChild(P, Child.builder().color(WHITE).node(node5).build());

        Node node3 = Node.builder()
                .name("수동 앉은자세 고관절 내회전 30도")
                .imageFileName("5_12")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node4).build())
                .addChild(DN, Child.builder().color(ORANGE).description("고관절 내회전 + 굴곡에서 고관절 JMD &/or TED").node(node4).build())
                .addChild(P, Child.builder().color(BLUE).description("통증 치료")
                        .nextTest(new Node[]{MSR4.getInstance().getHead(), MSR5.getInstance().getHead()}).build());

        Node node2 = Node.builder()
                .name("능동 앉은자세 고관절 내회전 30도")
                .imageFileName("5_11")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node4).build())
                .addChild(DN, Child.builder().color(WHITE).node(node3).build())
                .addChild(P, Child.builder().color(WHITE).node(node3).build());
        addNode(node2, node3, node4, node5, node6);
    }

    public static Test getInstance() {
        if (MSR3.instance == null) { MSR3.instance = new MSR3();}
        return instance;
    }
}
