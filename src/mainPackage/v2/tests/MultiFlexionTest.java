package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.*;
import static mainPackage.v2.domain.Node.SELECTION.*;

public class MultiFlexionTest extends mainPackage.v2.tests.Test {
    public static mainPackage.v2.tests.Test instance;

    public MultiFlexionTest() {
        Node node8 = Node.builder()
                .name("누운자세 허벅지 잡고 가슴 당기기")
                .imageFileName("3_7")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("후방 사슬 TED &/or 능동 고관절 굴곡 SMCD").build())
                .addChild(DN, Child.builder().color(GREEN).description("고관절 JMD &/or 후방 사슬 TED").build())
                .addChild(P, Child.builder().color(RED).description("통증을 치료한다.").build());

        Node node6 = Node.builder()
                .name("롤링2")
                .imageFileName("3_5")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("이전에 주황색 상자가 없었으면, 체중 부하 척추 SMCD 이다 - 그렇지 않으면 척추 굴곡을 정상으로 가정한다.").build())
                .addChild(DN, Child.builder().color(GREEN).description("펀더맨털 굴곡 패턴 SMCD").build())
                .addChild(P, Child.builder().color(RED).description("통증을 치료한다.").build());

        Node node7 = Node.builder()
                .name("Prone rocking")
                .imageFileName("3_6")
                .build()
                .addChild(FN, Child.builder().color(GREEN).node(node6).build())
                .addChild(DN, Child.builder().color(GREEN).description("척추 굴곡 JMD &/or TED").build())
                .addChild(P, Child.builder().color(RED).description("통증을 치료한다.").build());

        Node node5 = Node.builder()
                .name("PSLR 80도")
                .imageFileName("3_4")
                .build()
                .addChild(FN, Child.builder().color(ORANGE).node(node7).description("코어 SMCD &/or 능동 고관절 굴곡 SMCD").build())
                .addChild(DN, Child.builder().color(WHITE).node(node8).build())
                .addChild(P, Child.builder().color(WHITE).node(node8).build());

        Node node4 = Node.builder()
                .name("ASLR 70도")
                .imageFileName("3_3")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node7).node(node7).build())
                .addChild(DN, Child.builder().color(WHITE).node(node5).build())
                .addChild(P, Child.builder().color(WHITE).node(node5).build());

        Node node3 = Node.builder()
                .name("롤링1")
                .imageFileName("3_5")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("체중 부하 고관절 굴곡 패턴 SMCD").build())
                .addChild(DN, Child.builder().color(RED).description("펀더맨털 굴곡 패턴 SMCD").build())
                .addChild(P, Child.builder().color(GREEN).description("통증을 치료한다.").build());

        Node node2 = Node.builder()
                .name("다리펴고 앉아 손끝닿기 천추각 80도")
                .imageFileName("3_2")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node3).build())
                .addChild(DN, Child.builder().color(WHITE).node(node4).build())
                .addChild(P, Child.builder().color(WHITE).node(node4).build());

        Node node1 = Node.builder()
                .name("한발 전방 굽힘")
                .imageFileName("3_1")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node2).build())
                .addChild(DN, Child.builder().color(WHITE).node(node2).build())
                .addChild(P, Child.builder().color(WHITE).node(node2).build());

        addNode(node1, node2, node3, node4, node5, node7, node6, node8);
    }

    public static Test getInstance() {
        if (MultiFlexionTest.instance == null) { MultiFlexionTest.instance = new MultiFlexionTest();}
        return instance;
    }
}
