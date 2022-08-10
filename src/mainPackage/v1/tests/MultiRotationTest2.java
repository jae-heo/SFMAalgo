package mainPackage.v1.tests;

import mainPackage.domain.Child;
import mainPackage.domain.Node;

public class MultiRotationTest2 extends Test {
    public static Test instance;
    public MultiRotationTest2() {
        Node node6 = Node.builder()
                .name("롤링")
                .imageFileName("4_11")
                .build()
                .addChild("O", Child.builder().description("체중지지 고관절 내회전 SMCD - 경골회전 플로우차트 및" +
                        " 하체신전 하위 검사로 이동").build())
                .addChild("X", Child.builder().description("펀더먼털 고관절 회전 SMCD - 경골회전 플로우차트 및 " +
                        "하체신전 하위 검사로 이동").build())
                .addChild("P", Child.builder().description("통증을 치료하고-경골회전 으로").build());

        Node node5 = Node.builder()
                .name("수동 엎드린자세 고관절 외회전 40도")
                .imageFileName("5_10")
                .build()
                .addChild("O", Child.builder().description("앉은자세 수동 회전이 DN이면 멈추고 DN을 치료한다. 그렇지" +
                        " 않으면 플로우챠트를 진행").node(node6).build())
                .addChild("X", Child.builder().description("고관절 내회전 + 신전에서 고관절 JMD &/or TED - 경골회전" +
                        " 플로우차트 및 하체신전 하위 검사로 이동").build())
                .addChild("P", Child.builder().description("통증을 치료하고 - 경골회전으로").build());

        Node node4 = Node.builder()
                .name("능동 엎드린자세 고관절 외회전 40도")
                .imageFileName("5_9")
                .build()
                .addChild("O", Child.builder().node(node6).description("앉은자세 수동 회전이 DN이면 멈추고 DN을" +
                        " 치료한다. 그렇지 않으면 플로우차트를 진행").build())
                .addChild("X_P", Child.builder().node(node5).build());

        Node node3 = Node.builder()
                .name("수동 앉은자세 고관절 외회전 40도")
                .imageFileName("5_8")
                .build()
                .addChild("O", Child.builder().node(node4).build())
                .addChild("X", Child.builder().description("고관절 내회전 + 굴곡에서 고관절 JMD &/or TED").node(node4).build())
                .addChild("P", Child.builder().description("통증을 치료하고 - 경골회전으로").build());

        Node node2 = Node.builder()
                .name("능동 앉은자세 고관절 외회전 40도")
                .imageFileName("5_7")
                .build()
                .addChild("O", Child.builder().node(node4).build())
                .addChild("X_P", Child.builder().node(node3).build());
        addNode(node2, node3, node4, node5, node6);
    }

    public static Test getInstance() {
        if (MultiRotationTest2.instance == null) { MultiRotationTest2.instance = new MultiRotationTest2();}
        return instance;
    }
}
