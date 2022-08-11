package mainPackage.v2.tests;

import mainPackage.v1.domain.Child;
import mainPackage.v1.domain.Node;
import mainPackage.v1.tests.Test;

public class MultiExtension3 extends mainPackage.v1.tests.Test {
    public static mainPackage.v1.tests.Test instance;
    public MultiExtension3() {
        Node node7 = Node.builder()
                .name("수동 요추 잠금 IR 신전-회전 50도")
                .imageFileName("4_17")
                .build()
                .addChild("O", Child.builder().description("흉추 양쪽 신전/회전 SMCD").build())
                .addChild("X1", Child.builder().description("흉추 한쪽 신전/회전 JMD &/or TED").build())
                .addChild("X2", Child.builder().description("흉추 양쪽 신전/회전 JMD &/or TED").build())
                .addChild("P", Child.builder().description("통증 치료").build());

        Node node6 = Node.builder()
                .name("능동 요추 잠금 IR 신전-회전 50도")
                .imageFileName("4_16")
                .build()
                .addChild("O", Child.builder().description("어깨대 JMD or TED").build())
                .addChild("X_P", Child.builder().node(node7).build());

        Node node5 = Node.builder()
                .name("능동 요추 잠금 ER 신전-회전 50도")
                .imageFileName("4_15")
                .build()
                .addChild("O", Child.builder().description("견갑골 &/or 상완관절 SMCD").build())
                .addChild("X_P", Child.builder().node(node6).build());

        Node node4 = Node.builder()
                .name("롤링")
                .imageFileName("4_11")
                .build()
                .addChild("O", Child.builder().description("체중지지 상부흉곽 신전 SMCD").build())
                .addChild("X", Child.builder().description("펀더먼털 신전 SMCD").build())
                .addChild("P", Child.builder().description("통증치료").build());

        Node node3 = Node.builder()
                .name("누운자세-고관절 신전 광배근 검사")
                .imageFileName("4_14")
                .build()
                .addChild("O", Child.builder().description("외측/후방 사슬 TED &/or 고관절 신전 기능제한 가능성 - " +
                        "하체 신전 차트를 진행하도록 한다.").build())
                .addChild("O1", Child.builder().description("어깨굴곡 향상되지만 완전하지 않다. 외측/후방 사슬 " +
                        "TED &/or 고관절 신전 기능제한 가능성 - 하체 신전 차트를 진행하도록 한다.").build())
                .addChild("X_P", Child.builder().node(node5).build());

        Node node2 = Node.builder()
                .name("누운자세-고관절 굴곡 광배근 검사")
                .imageFileName("4_13")
                .build()
                .addChild("O", Child.builder().node(node4).build())
                .addChild("X_P", Child.builder().node(node3).build());

        Node node1 = Node.builder()
                .name("한쪽 어깨 후방 신전")
                .imageFileName("4_12")
                .build()
                .addChild("O", Child.builder().description("흉추 관련 가능성을 보기위해 척추신전의 프레스업을 재확인" +
                        " 하고 경추 관련 문제를 배제하도록 한다.").build())
                .addChild("X_P", Child.builder().node(node2).build());

        addNode(node1, node2, node3, node4, node5, node6, node7);
    }

    public static Test getInstance() {
        if (MultiExtension3.instance == null) { MultiExtension3.instance = new MultiExtension3();}
        return instance;
    }
}
