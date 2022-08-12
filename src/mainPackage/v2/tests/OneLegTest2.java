
package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.*;
import static mainPackage.v2.domain.Node.SELECTION.*;
public class OneLegTest2 extends mainPackage.v2.tests.Test {

    public static mainPackage.v2.tests.Test instance;
    public OneLegTest2() {
        Node node6 = Node.builder()
                .name("수동 앉아서 발목 내반/외반")
                .imageFileName("6_11")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("발목 내반/외반 SMCD - 국부 발/발목 검사를 실행한다.").build())
                .addChild(DN, Child.builder().color(GREEN).description("발목 내반/외반 JMD, TED - 국부 발/발목 검사를 실행한다.").build())
                .addChild(P, Child.builder().color(RED).description("통증을 치료한다.").build());

        Node node5 = Node.builder()
                .name("능동 앉아서 발목 내반/외반")
                .imageFileName("6_10")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("현재까지 빨강, 주황, 파란상자가 없으면 = 고유수용성감각 장애").build())
                .addChild(DN, Child.builder().color(WHITE).node(node6).build())
                .addChild(P, Child.builder().color(WHITE).node(node6).build());

        Node node4 = Node.builder()
                .name("수동 저측굴곡 30~40도")
                .imageFileName("6_9")
                .build()
                .addChild(FN, Child.builder().color(ORANGE).node(node5).description("저측굴곡 SMCD").build())
                .addChild(DN, Child.builder().color(ORANGE).node(node5).description("하부 전방 사슬 TED &/or JMD").build())
                .addChild(P, Child.builder().color(ORANGE).node(node5).description("통증치료").build());

        Node node3 = Node.builder()
                .name("발끝걷기 10걸음")
                .imageFileName("6_8")
                .build()
                .addChild(FN, Child.builder().color(WHITE).node(node5).build())
                .addChild(DN, Child.builder().color(WHITE).node(node4).build())
                .addChild(P, Child.builder().color(WHITE).node(node4).build());

        Node node2 = Node.builder()
                .name("수동 배층굴곡 20~30도")
                .imageFileName("6_7")
                .build()
                .addChild(FN, Child.builder().color(ORANGE).node(node3).description("배측굴곡 SMCD").build())
                .addChild(DN, Child.builder().color(ORANGE).node(node3).description("하부 후방 사슬 TED &/or JMD").build())
                .addChild(P, Child.builder().color(ORANGE).node(node3).description("통증치료").build());

        Node node1 = Node.builder()
                .name("뒤꿈치걷기 10걸음")
                .imageFileName("6_6")
                .build()
                .addChild(DN, Child.builder().color(WHITE).node(node2).build())
                .addChild(P, Child.builder().color(WHITE).node(node2).build())
                .addChild(FN, Child.builder().color(WHITE).node(node3).build());

        addNode(node1, node2, node3, node4, node5, node6);
    }

    public static Test getInstance() {
        if (OneLegTest2.instance == null) { OneLegTest2.instance = new OneLegTest2();}
        return instance;
    }
}

