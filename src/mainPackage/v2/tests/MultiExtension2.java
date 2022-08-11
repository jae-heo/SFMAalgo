package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Node.SELECTION.*;

public class MultiExtension2 extends Test {
    public static Test instance;
    public MultiExtension2() {
        Node node6 = Node.builder()
                .name("롤링2")
                .imageFileName("4_11")
                .build()
                .addChild(FN, Child.builder().description("코어 SMCD &/or 능동 고관절 신전 SMCD").build())
                .addChild(DN, Child.builder().description("펀더먼털 신전패턴 SMCD").build())
                .addChild(P, Child.builder().description("통증 치료").build());

        Node node5 = Node.builder()
                .name("롤링1")
                .imageFileName("4_11")
                .build()
                .addChild(FN, Child.builder().description("고관절 신전 기능제한의 표시가 있으면 체중지지 고관절 &/or" +
                        " 척추 하부 흉부 신전 SMCD &/or 발목 배측굴곡 제한이 있다. 없다면 고관절 신전은 정상이다 (ODS & SLS을 검사" +
                        "한다)").node(node6).build())
                .addChild(DN, Child.builder().description("펀더먼털 신전패턴 SMCD").build())
                .addChild(P, Child.builder().description("통증치료").build());

        Node node4 = Node.builder()
                .name("수동 엎드린자세 고관절 신전 10도")
                .imageFileName("4_10")
                .build()
                .addChild(FN, Child.builder().node(node6).build())
                .addChild(DN, Child.builder().description("고관절 신전 JMD &/or TED").build())
                .addChild(P, Child.builder().description("통증치료").build());


        Node node3 = Node.builder()
                .name("능동 엎드린자세 고관절 신전 10도")
                .imageFileName("4_9")
                .build()
                .addChild(FN, Child.builder().node(node5).build())
                .addChild(DN, Child.builder().node(node4).build())
                .addChild(P, Child.builder().node(node4).build());

        Node node2 = Node.builder()
                .name("토마스 검사")
                .imageFileName("4_8")
                .build()
                .addChild(FN, Child.builder().node(node3).build())
                .addChild(TOMASFN1, Child.builder().description("하부 전방 사슬 TED").build())
                .addChild(TOMASFN2, Child.builder().description("하부 외측 사슬 TED").build())
                .addChild(TOMASFN3, Child.builder().description("하부 전방 및 외측 사슬 TED").build())
                .addChild(DN, Child.builder().description("고관절 신전 JMD &/or TED and/or 코어 SMCD").build())
                .addChild(P, Child.builder().description("통증치료").build());

        Node node1 = Node.builder()
                .name("FABER test")
                .imageFileName("4_7")
                .build()
                .addChild(FN, Child.builder().node(node2).build())
                .addChild(DN, Child.builder().node(node2).description("고관절/SI JMD &/or TED &/or 코어 SMCD" +
                        " * (고정된 FABER로 분별한다) 고관절과 SI의 국소부위 생역학검사를 실시한다.").build())
                .addChild(P, Child.builder().node(node2).description("고관절/SI JMD &/or TED &/or 코어 SMCD" +
                        " * (고정된 FABER로 분별한다) 고관절과 SI의 국소부위 생역학검사를 실시한다.").build());

        addNode(node1, node2, node3, node4, node5, node6);
    }

    public static Test getInstance() {
        if (MultiExtension2.instance == null) { MultiExtension2.instance = new MultiExtension2();}
        return instance;
    }
}
