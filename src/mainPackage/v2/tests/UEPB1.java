package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.*;
import static mainPackage.v2.domain.Node.SELECTION.*;
public class UEPB1 extends mainPackage.v2.tests.Test {
    public static mainPackage.v2.tests.Test instance;
    public UEPB1() {
        Node node10 = Node.builder()
                .name("능동 요추 잠금 신전-회전 (가슴) 50도")
                .imageFileName("2_10")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("결과가 아직 없다면, 패턴1의 복합 JMD").build())
                .addChild(DN, Child.builder().color(GREEN).description("흉추신전 JMD, TED, or SMCD. 수동으로 분별").build())
                .addChild(P, Child.builder().color(RED).description("통증 치료").build());

        Node node9 = Node.builder()
                .name("수동 엎드린자세 팔꿈치 굴곡")
                .imageFileName("2_9")
                .build()
                .addChild(FN, Child.builder().color(ORANGE).description("팔꿈치 굴곡 SMCD").node(node10).build())
                .addChild(DN, Child.builder().color(ORANGE).description("팔꿈치굴곡 JMD or TED").node(node10).build())
                .addChild(P, Child.builder().color(ORANGE).description("통증 치료").node(node10).build());

        Node node8 = Node.builder()
                .name("능동 엎드린자세 팔꿈치 굴곡")
                .imageFileName("2_8")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node10).build())
                .addChild(DN, Child.builder().color(WHITE).node(node9).build())
                .addChild(P, Child.builder().color(WHITE).node(node9).build());

        Node node7 = Node.builder()
                .name("수동 엎드린자세 어깨 신전 50도")
                .imageFileName("2_7")
                .build()
                .addChild(FN, Child.builder().color(ORANGE).description("어깨신전 SMCD").node(node8).build())
                .addChild(DN, Child.builder().color(ORANGE).description("어깨 신전 JMD or TED").node(node8).build())
                .addChild(P, Child.builder().color(ORANGE).description("화학통증 치료").node(node8).build());

        Node node6 = Node.builder()
                .name("능동 엎드린자세 어깨 신전 50도")
                .imageFileName("2_6")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node8).build())
                .addChild(DN, Child.builder().color(WHITE).node(node7).build())
                .addChild(P, Child.builder().color(WHITE).node(node7).build());

        Node node5 = Node.builder()
                .name("수동 엎드린자세 어깨 90/90 내회전 60도")
                .imageFileName("2_5")
                .build()
                .addChild(FN, Child.builder().color(ORANGE).description("어깨 내회전 SMCD").node(node6).build())
                .addChild(DN, Child.builder().color(ORANGE).description("어깨 내회전 JMD or TED").node(node6).build())
                .addChild(P, Child.builder().color(ORANGE).description("화학 통증을 치료한다").node(node6).build());

        Node node4 = Node.builder()
                .name("능동 엎드린자세 어깨 90/90 내회전 60도")
                .imageFileName("2_4")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node6).build())
                .addChild(DN, Child.builder().color(WHITE).node(node5).build())
                .addChild(P, Child.builder().color(WHITE).node(node5).build());

        Node node3 = Node.builder()
                .name("누운자세 교차 상지 패턴 검사")
                .imageFileName("2_3")
                .build()
                .addChild(FN, Child.builder().color(BLUE).description("패턴1을 위한 분리된 자세 &/ or 어깨대 SMCD")
                        .nextTest(new Node[]{MSE1.getInstance().getHead()}).build())
                .addChild(DN, Child.builder().color(BLUE).description("패턴1의 기능적 어깨 패턴 SMCD")
                        .nextTest(new Node[]{MSE1.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(RED).description("통증 치료").build());

        Node node2 = Node.builder()
                .name("수동 엎드린자세 상지패턴1")
                .imageFileName("2_2")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node3).build())
                .addChild(DN, Child.builder().color(WHITE).node(node4).build())
                .addChild(P, Child.builder().color(WHITE).node(node4).build());

        Node node1 = Node.builder()
                .name("능동 엎드린자세 상지패턴1")
                .imageFileName("2_1")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node3).build())
                .addChild(DN, Child.builder().color(WHITE).node(node2).build())
                .addChild(P, Child.builder().color(WHITE).node(node2).build());

        Node node0 = Node.builder()
                .name("상지 패턴 1")
                .imageFileName("0_4")
                .build()
                .addChild(FN, Child.builder().color(ORANGE).build())
                .addChild(DN, Child.builder().color(ORANGE).node(node1).build())
                .addChild(P, Child.builder().color(ORANGE).node(node1).build());

        addNode(node1, node2, node3, node4, node5, node6, node7, node8, node9, node10);
    }

    public static Test getInstance() {
        if (UEPB1.instance == null) { UEPB1.instance = new UEPB1();}
        return instance;
    }
}
