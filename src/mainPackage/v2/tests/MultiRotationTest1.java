package mainPackage.v2.tests;

import mainPackage.v1.domain.Child;
import mainPackage.v1.domain.Node;
import mainPackage.v1.tests.Test;

public class MultiRotationTest1 extends mainPackage.v1.tests.Test {
    public static mainPackage.v1.tests.Test instance;
    public MultiRotationTest1() {
        Node node8 = Node.builder()
                .name("롤링")
                .imageFileName("4_11")
                .build()
                .addChild("O", Child.builder().description("흉추 신전 SMCD가 있으면 요추는 정상이고. 없으면 -" +
                        "체중지지 척추 회전 SMCD - 고관절 회전 플로우차트로").build())
                .addChild("X", Child.builder().description("펀더먼털 척추 신전 SMCD - 고관절 회전으로").build())
                .addChild("P", Child.builder().description("통증 치료 - 고관절 회전으로").build());

        Node node7 = Node.builder()
                .name("수동 엎드린자세 팔꿈치지지 IR 신전-회전 30도")
                .imageFileName("5_6")
                .build()
                .addChild("O", Child.builder().node(node8).build())
                .addChild("X1", Child.builder().description("요추 한쪽 신전/ 회전 JMD &/ or TED - 고관절 회전 플로우차트로 ").build())
                .addChild("X2", Child.builder().description("요추 양쪽 신전/ 회전 JMD &/ or TED - 고관절 회전 플로우차트로 ").build())
                .addChild("P", Child.builder().description("통증 치료 - 고관절 회전 플로우차트로").build());

        Node node6 = Node.builder()
                .name("능동 엎드린자세 팔꿈치지지 IR 신전-회전 30도")
                .imageFileName("5_5")
                .build()
                .addChild("O", Child.builder().node(node8).build())
                .addChild("X_P", Child.builder().node(node7).build());

        Node node5 = Node.builder()
                .name("수동 요추 잠금 IR 신전-회전 50도")
                .imageFileName("5_4")
                .build()
                .addChild("O", Child.builder().description("흉추 회전 SMCD").node(node6).build())
                .addChild("X1", Child.builder().description("흉추 한쪽 신전/회전 JMD &/or TED - 고관절 회전 플로우차트로").build())
                .addChild("X2", Child.builder().description("흉추 양쪽 신전/회전 JMD &/or TED - 고관절 회전 플로우차트로").build())
                .addChild("P", Child.builder().description("통증치료 - 고관절 회전 플로우차트로").build());

        Node node4 = Node.builder()
                .name("능동 요추 잠금 IR 신전-회전 50도")
                .imageFileName("5_3")
                .build()
                .addChild("O", Child.builder().description("어깨대 TED &/or JMD").node(node6).build())
                .addChild("X_P", Child.builder().node(node5).build());

        Node node3 = Node.builder()
                .name("능동 요추 잠금 ER 신전-회전 50도")
                .imageFileName("5_2")
                .build()
                .addChild("O", Child.builder().node(node6).build())
                .addChild("X_P", Child.builder().node(node4).build())
                .addChild("X_P&SS", Child.builder().node(node6).build());

        Node node2 = Node.builder()
                .name("앉은 자세 회전 50도")
                .imageFileName("5_1")
                .build()
                .addChild("O", Child.builder().description("고관절 회전 플로우차트로").build())
                .addChild("X_P", Child.builder().node(node3).build());

        Node node1 = Node.builder()
                .name("상지 배제 후방 신전")
                .imageFileName("0_8")
                .build()
                .addChild("O", Child.builder().build())
                .addChild("X_P", Child.builder().node(node2).build());

        addNode(node1, node2, node3, node4, node5, node6, node7, node8);
    }

    public static Test getInstance() {
        if (MultiRotationTest1.instance == null) { MultiRotationTest1.instance = new MultiRotationTest1();}
        return instance;
    }
}
