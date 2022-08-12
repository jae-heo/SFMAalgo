package mainPackage.v1.tests;


import mainPackage.v1.domain.Child;
import mainPackage.v1.domain.Node;
public class UpperTest2 extends Test {
    public static Test instance;
    public UpperTest2() {
        Node node10 = Node.builder()
                .name("능동 요추 잠금 신전-회전 (가슴) 50도")
                .imageFileName("2_20")
                .build()
                .addChild("O", Child.builder().description("결과가 아직 없다면, 패턴2의 복합 JMD").build())
                .addChild("X", Child.builder().description("흉추신전 JMD, TED, or SMCD. 수동으로 분별").build())
                .addChild("P", Child.builder().description("통증 치료").build());


        Node node9 = Node.builder()
                .name("수동 엎드린자세 팔꿈치 굴곡2")
                .imageFileName("2_19")
                .build()
                .addChild("O", Child.builder().description("팔꿈치 굴곡 SMCD").node(node10).build())
                .addChild("X", Child.builder().description("팔꿈치굴곡 JMD or TED").node(node10).build())
                .addChild("P", Child.builder().description("통증 치료").node(node10).build());

        Node node8 = Node.builder()
                .name("능동 엎드린자세 팔꿈치 굴곡2")
                .imageFileName("2_18")
                .build()
                .addChild("O", Child.builder().node(node10).build())
                .addChild("X_P", Child.builder().node(node9).build());

        Node node7 = Node.builder()
                .name("수동 엎드린자세 어깨 외전 170도")
                .imageFileName("2_17")
                .build()
                .addChild("O", Child.builder().description("어깨 굴곡/ 외전 SMCD").node(node8).build())
                .addChild("X", Child.builder().description("어깨 굴곡/외전 JMD or TED").node(node8).build())
                .addChild("P", Child.builder().description("화학통증 치료").node(node8).build());

        Node node6 = Node.builder()
                .name("능동 엎드린자세 어깨 외전 170도")
                .imageFileName("2_16")
                .build()
                .addChild("O", Child.builder().node(node8).build())
                .addChild("X_P", Child.builder().node(node7).build());

        Node node5 = Node.builder()
                .name("수동 엎드린자세 어깨 90/90 외회전 90도")
                .imageFileName("2_15")
                .build()
                .addChild("O", Child.builder().description("어깨 외회전 SMCD").node(node6).build())
                .addChild("X", Child.builder().description("어깨 외회전 JMD or TED").node(node6).build())
                .addChild("P", Child.builder().description("화학 통증을 치료한다").node(node6).build());

        Node node4 = Node.builder()
                .name("능동 엎드린자세 어깨 90/90 외회전 90도")
                .imageFileName("2_14")
                .build()
                .addChild("O", Child.builder().node(node6).build())
                .addChild("X_P", Child.builder().node(node5).build());

        Node node3 = Node.builder()
                .name("누운자세 교차 상지 패턴 검사")
                .imageFileName("2_13")
                .build()
                .addChild("O", Child.builder().description("패턴2을 위한 분리된 자세 &/ or 어깨대 SMCD.").nextTest1(MultiExtension1.getInstance().getHead()).build())
                .addChild("X", Child.builder().description("패턴2의 기능적 어깨 패턴 SMCD.").nextTest1(MultiExtension1.getInstance().getHead()).build())
                .addChild("P", Child.builder().description("통증 치료").build());

        Node node2 = Node.builder()
                .name("수동 엎드린자세 상지패턴2")
                .imageFileName("2_12")
                .build()
                .addChild("O", Child.builder().node(node3).build())
                .addChild("X_P", Child.builder().node(node4).build());

        Node node1 = Node.builder()
                .name("능동 엎드린자세 상지패턴2")
                .imageFileName("2_11")
                .build()
                .addChild("O", Child.builder().node(node3).build())
                .addChild("X_P", Child.builder().node(node2).build());

        Node node0 = Node.builder()
                .name("상지 패턴 2")
                .imageFileName("0_5")
                .build()
                .addChild("O", Child.builder().build())
                .addChild("X_P", Child.builder().node(node1).build());

        addNode(node0, node1, node2, node3, node4, node5, node6, node7, node8, node9, node10);
    }

    public static Test getInstance() {
        if (UpperTest2.instance == null) { UpperTest2.instance = new UpperTest2();}
        return instance;
    }
}
