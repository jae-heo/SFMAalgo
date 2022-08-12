package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.*;
import static mainPackage.v2.domain.Node.SELECTION.*;
public class MSR1 extends Test {
    public static Test instance;
    public MSR1() {
        Node node8 = Node.builder()
                .name("롤링")
                .imageFileName("4_11")
                .build()
                .addChild(FN, Child.builder().color(BLUE).description("흉추 신전 SMCD가 있으면 요추는 정상이고. 없으면 체중지지 척추 회전 SMCD")
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build())
                .addChild(DN, Child.builder().color(BLUE).description("펀더먼털 척추 신전 SMCD")
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).description("통증 치료")
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build());

        Node node7 = Node.builder()
                .name("수동 엎드린자세 팔꿈치지지 IR 신전-회전 30도")
                .imageFileName("5_6")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node8).build())
                .addChild(OSDN, Child.builder().color(BLUE).description("요추 한쪽 신전/ 회전 JMD &/ or TED")
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build())
                .addChild(BSDN, Child.builder().color(BLUE).description("요추 양쪽 신전/ 회전 JMD &/ or TED")
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).description("통증 치료")
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build());

        Node node6 = Node.builder()
                .name("능동 엎드린자세 팔꿈치지지 IR 신전-회전 30도")
                .imageFileName("5_5")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node8).build())
                .addChild(DN, Child.builder().color(WHITE).node(node7).build())
                .addChild(P, Child.builder().color(WHITE).node(node7).build());

        Node node5 = Node.builder()
                .name("수동 요추 잠금 IR 신전-회전 50도")
                .imageFileName("5_4")
                .build()
                .addChild(FN, Child.builder().color(ORANGE).description("흉추 회전 SMCD").node(node6).build())
                .addChild(OSDN, Child.builder().color(BLUE).description("흉추 한쪽 신전/회전 JMD &/or TED")
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build())
                .addChild(BSDN, Child.builder().color(BLUE).description("흉추 양쪽 신전/회전 JMD &/or TED")
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).description("통증치료")
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build());

        Node node4 = Node.builder()
                .name("능동 요추 잠금 IR 신전-회전 50도")
                .imageFileName("5_3")
                .build()
                .addChild(FN, Child.builder().color(ORANGE).description("어깨대 TED &/or JMD").node(node6).build())
                .addChild(DN, Child.builder().color(WHITE).node(node5).build())
                .addChild(P, Child.builder().color(WHITE).node(node5).build());

        Node node3 = Node.builder()
                .name("능동 요추 잠금 ER 신전-회전 50도")
                .imageFileName("5_2")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node6).build())
                .addChild(DN, Child.builder().color(WHITE).node(node4).build())
                .addChild(P, Child.builder().color(WHITE).node(node4).build());

        Node node2 = Node.builder()
                .name("앉은 자세 회전 50도")
                .imageFileName("5_1")
                .build()
                .addChild(FN, Child.builder().color(BLUE)
                        .nextTest(new Node[]{MSR2.getInstance().getHead(), MSE3.getInstance().getHead()}).build())
                .addChild(DN, Child.builder().color(WHITE).node(node3).build())
                .addChild(P, Child.builder().color(WHITE).node(node3).build());

        Node node1 = Node.builder()
                .name("상지 배제 후방 신전")
                .imageFileName("0_8")
                .build()
                .addChild(FN, Child.builder().color(BLUE).build())
                .addChild(DN, Child.builder().color(BLUE).node(node2).build())
                .addChild(P, Child.builder().color(BLUE).node(node2).build());

        addNode(node2, node3, node4, node5, node6, node7, node8);
    }

    public static Test getInstance() {
        if (MSR1.instance == null) { MSR1.instance = new MSR1();}
        return instance;
    }
}
