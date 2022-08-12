
package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.*;
import static mainPackage.v2.domain.Node.SELECTION.*;
public class ODSPB extends mainPackage.v2.tests.Test {

    public static mainPackage.v2.tests.Test instance;
    public ODSPB() {
        Node node6 = Node.builder()
                .name("누워서 허벅지 잡고 무릎 가슴 당기기")
                .imageFileName("7_5")
                .build()
                .addChild(FN, Child.builder().color(BLUE).description("무릎 JMD (굴곡) 그리고/또는 하부 전방 체인 TED")
                        .nextTest(new Node[]{MSE1.getInstance().getHead()}).build())
                .addChild(DN, Child.builder().color(BLUE).description("고관절 JMD 그리고/또는 후방 체인 TED")
                        .nextTest(new Node[]{MSF.getInstance().getHead(), MSE1.getInstance().getHead()}).build())
                .addChild(P, Child.builder().color(RED).description("통증을 치료한다.").build());

        Node node5 = Node.builder()
                .name("누워서 정강이 잡고 무릎 가슴 당기기")
                .imageFileName("7_4")
                .build()
                .addChild(FN, Child.builder().color(BLUE).description("만약 배측굴곡이 FN이면 = 체중 지지 코어, 무릎 그리고/또는 " +
                        "고관절 굴곡 SMCD. 만약 배측굴곡이 DN이면, 무릎, 고관절 코어는 정상으로 생각한다. 만약 배측굴곡이 DP또는 " +
                        "FP이면 이것을 빨간상자라고 생각하고 배측굴곡을 치료한다.")
                        .nextTest(new Node[]{MSE1.getInstance().getHead()}).build())
                .addChild(DN, Child.builder().color(WHITE).node(node6).build())
                .addChild(P, Child.builder().color(WHITE).node(node6).build());

        Node node4 = Node.builder()
                .name("반무릎자세 배측 굴곡 (무릎이 발끝보다 10센치 이상)")
                .imageFileName("7_3")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node5).build())
                .addChild(P, Child.builder().color(WHITE).node(node5).build())
                .addChild(DN, Child.builder().color(ORANGE).node(node5).description("하부 후방 체인 TED 그리고/또는 발목 JMD")
                        .nextTest(new Node[]{MSE1.getInstance().getHead(), SLS1.getInstance().getHead()}).build());

        Node node3 = Node.builder()
                .name("보조 딥 스쿼트")
                .imageFileName("7_2")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("코어 SMCD (롤링을 사용하여 점수를 평가한다)")
                        .nextTest(new Node[]{MSE1.getInstance().getHead()}).build())
                .addChild(DN, Child.builder().color(WHITE).node(node4).build())
                .addChild(P, Child.builder().color(WHITE).node(node4).build());

        Node node2 = Node.builder()
                .name("목 깍지 딥 스쿼트")
                .imageFileName("7_1")
                .build()
                .addChild(FN, Child.builder().color(BLUE).node(node3).nextTest(new Node[]{MSE1.getInstance().getHead()}).build())
                .addChild(DN, Child.builder().color(WHITE).node(node3).build())
                .addChild(P, Child.builder().color(WHITE).node(node3).build());

        Node node1 = Node.builder()
                .name("오버헤드 딥 스쿼트")
                .imageFileName("0_10")
                .build()
                .addChild(DN, Child.builder().color(WHITE).node(node2).build())
                .addChild(P, Child.builder().color(WHITE).node(node2).build())
                .addChild(FN, Child.builder().color(WHITE).build());

        addNode(node2, node3, node4, node5, node6);
    }

    public static Test getInstance() {
        if (ODSPB.instance == null) { ODSPB.instance = new ODSPB();}
        return instance;
    }
}

