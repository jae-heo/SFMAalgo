package mainPackage.tests;

import mainPackage.domain.Child;
import mainPackage.domain.Node;

public class MultiExtension1 extends Test {
    public static Test instance;
    public MultiExtension1() {
        Node node8 = Node.builder()
                .name("롤링")
                .imageFileName("4_11")
                .build()
                .addChild("O", Child.builder().description("흉추 신전 SMCD가 있으면 요추는 정상이고. 없으면 -" +
                        "체중지지 척추 회전 SMCD - 상체 & 하체 신전 차트로").build())
                .addChild("X", Child.builder().description("펀더먼털 척추 신전 SMCD - 상체 & 하체 신전").build())
                .addChild("P", Child.builder().description("통증 치료 - 상체 & 하체 신전 차트로").build());

        Node node7 = Node.builder()
                .name("수동 엎드린자세 팔꿈치지지 신전-회전 30도")
                .imageFileName("4_6")
                .build()
                .addChild("O", Child.builder().node(node8).build())
                .addChild("X1", Child.builder().description("요추 한쪽 신전/ 회전 JMD &/ or TED - 상체 & 하체 " +
                        "신전 차트로 ").build())
                .addChild("X2", Child.builder().description("요추 양쪽 신전/ 회전 JMD &/ or TED - 상체 & 하체 " +
                        "신전 차트로 ").build())
                .addChild("P", Child.builder().description("통증 치료 - 상체 & 하체 신전 차트로").build());

        Node node6 = Node.builder()
                .name("능동 엎드린자세 팔꿈치지지 신전-회전 30도")
                .imageFileName("4_5")

                .build()
                .addChild("O", Child.builder().node(node8).build())
                .addChild("X_P", Child.builder().node(node7).build());

        Node node5 = Node.builder()
                .name("수동 요추 잠금 IR 신전-회전 50도")
                .imageFileName("4_4")
                .build()
                .addChild("O", Child.builder().description("흉추 신전 SMCD").node(node6).build())
                .addChild("X1", Child.builder().description("흉추 한쪽 신전 JMD &/or TED - 상체 & 하체 신전 차트로").build())
                .addChild("X2", Child.builder().description("흉추 양쪽 신전 JMD &/or TED - 상체 & 하체 신전 차트로").build())
                .addChild("P", Child.builder().description("통증치료 - 상체 & 하체 신전 차트로").build());

        Node node4 = Node.builder()
                .name("능동 요추 잠금 IR 신전-회전 50도")
                .imageFileName("4_3")
                .build()
                .addChild("O", Child.builder().node(node6).build())
                .addChild("X_P", Child.builder().node(node5).build());

        Node node3 = Node.builder()
                .name("프레스업")
                .imageFileName("4_2")
                .build()
                .addChild("O", Child.builder().description("신전이 기능적이고 통증이 없다면 - 체중 지지 척추 신전 SMCD이다," +
                        " 하지만 계속 상체 & 하체 신전 차트로 이동한다.").build())
                .addChild("X_P", Child.builder().node(node4).build());

        Node node2 = Node.builder()
                .name("한발 후방 신전")
                .imageFileName("4_18")
                .build()
                .addChild("O", Child.builder().description("양쪽 기능적이고 통증이 없다. 대칭 스텐스코어 SMCD or" +
                        " 전방 흉곽 TED. - 상체 신전 차트로").build())
                .addChild("X_P", Child.builder().node(node3).build());

        Node node1 = Node.builder()
                .name("상지 배제 후방 신전")
                .imageFileName("4_1")
                .build()
                .addChild("O", Child.builder().description("상체 신전 차트로 이동한다.").build())
                .addChild("X_P", Child.builder().node(node2).build());

        addNode(node1, node2, node3, node4, node5, node6, node7, node8);
    }

    public static Test getInstance() {
        if (MultiExtension1.instance == null) { MultiExtension1.instance = new MultiExtension1();}
        return instance;
    }
}
