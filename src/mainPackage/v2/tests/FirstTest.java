package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.BLUE;
import static mainPackage.v2.domain.Child.COLOR.WHITE;
import static mainPackage.v2.domain.Node.SELECTION.*;

public class FirstTest extends Test {
    public static Test instance;
    public FirstTest() {
        Node node9 = Node.builder()
                .name("오버헤드 딥 스쿼트")
                .imageFileName("0_10")
                .build()
                .addChild(FN, Child.builder().color(WHITE).build())
                .addChild(DN, Child.builder().nextTest(new Node[]{ODSPB.getInstance().getHead()}).color(BLUE).build())
                .addChild(P, Child.builder().nextTest(new Node[]{ODSPB.getInstance().getHead()}).color(BLUE).build());
        Node node8 = Node.builder()
                .name("한발 서기")
                .imageFileName("0_9")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node9).build())
                .addChild(DN, Child.builder().color(BLUE).nextTest(new Node[]{SLS1.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).nextTest(new Node[]{SLS1.getInstance().getHead()}).build());
        Node node7 = Node.builder()
                .name("다중 분절 회전")
                .imageFileName("0_8")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node8).build())
                .addChild(DN, Child.builder().color(BLUE).nextTest(new Node[]{MSR1.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).nextTest(new Node[]{MSR1.getInstance().getHead()}).build());
        Node node6 = Node.builder()
                .name("다중 분절 신전")
                .imageFileName("0_7")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node7).build())
                .addChild(DN, Child.builder().color(BLUE).nextTest(new Node[]{MSE1.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).nextTest(new Node[]{MSE1.getInstance().getHead()}).build());
        Node node5 = Node.builder()
                .name("다중 분절 굴곡")
                .imageFileName("0_6")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node6).build())
                .addChild(DN, Child.builder().color(BLUE).nextTest(new Node[]{MSF.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).nextTest(new Node[]{MSF.getInstance().getHead()}).build());
        Node node4 = Node.builder()
                .name("상지 패턴 2 (굴곡, 외전, 외회전)")
                .imageFileName("0_5")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node5).build())
                .addChild(DN, Child.builder().color(BLUE).nextTest(new Node[]{UEPB2.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).nextTest(new Node[]{UEPB2.getInstance().getHead()}).build());
        Node node3 = Node.builder()
                .name("상지 패턴 1 (신전, 내전, 내회전)")
                .imageFileName("0_4")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node4).build())
                .addChild(DN, Child.builder().color(BLUE).nextTest(new Node[]{UEPB1.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).nextTest(new Node[]{UEPB1.getInstance().getHead()}).build());
        Node node2 = Node.builder()
                .name("능동 경추 회전-측면 굽힘")
                .imageFileName("0_3")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node3).build())
                .addChild(DN, Child.builder().color(BLUE).nextTest(new Node[]{CSPB3.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).nextTest(new Node[]{CSPB3.getInstance().getHead()}).build());

        Node node1 = Node.builder()
                .name("능동 경추 신전")
                .imageFileName("0_2")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node2).build())
                .addChild(DN, Child.builder().color(BLUE).nextTest(new Node[]{CSPB2.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).nextTest(new Node[]{CSPB2.getInstance().getHead()}).build());

        Node node0 = Node.builder()
                .name("능동 경추 굴곡")
                .imageFileName("0_1")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node1).build())
                .addChild(DN, Child.builder().color(BLUE).nextTest(new Node[]{CSPB1.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(BLUE).nextTest(new Node[]{CSPB1.getInstance().getHead()}).build());

        addNode();
    }

    public static Test getInstance() {
        if (FirstTest.instance == null) { FirstTest.instance = new FirstTest();}
        return instance;
    }
}
