package mainPackage.v2.tests;

import mainPackage.v1.domain.Child;
import mainPackage.v1.domain.Node;
import mainPackage.v1.tests.MultiExtension1;
import mainPackage.v1.tests.Test;

public class UpperTest1 extends mainPackage.v1.tests.Test {
    public static mainPackage.v1.tests.Test instance;
    public UpperTest1() {
        Node node10 = Node.builder()
                .name("능동 요추 잠금 신전-회전 (가슴) 50도")
                .imageFileName("2_10")
                .build()
                .addChild("O", Child.builder().description("결과가 아직 없다면, 패턴1의 복합 JMD").build())
                .addChild("X", Child.builder().description("흉추신전 JMD, TED, or SMCD. 수동으로 분별").build())
                .addChild("P", Child.builder().description("통증 치료").build());

        Node node9 = Node.builder()
                .name("수동 엎드린자세 팔꿈치 굴곡")
                .imageFileName("2_9")
                .build()
                .addChild("O", Child.builder().description("팔꿈치 굴곡 SMCD").node(node10).build())
                .addChild("X", Child.builder().description("팔꿈치굴곡 JMD or TED").node(node10).build())
                .addChild("P", Child.builder().description("통증 치료").node(node10).build());

        Node node8 = Node.builder()
                .name("능동 엎드린자세 팔꿈치 굴곡")
                .imageFileName("2_8")
                .build()
                .addChild("O", Child.builder().node(node10).build())
                .addChild("X_P", Child.builder().node(node9).build());

        Node node7 = Node.builder()
                .name("수동 엎드린자세 어깨 신전 50도")
                .imageFileName("2_7")
                .build()
                .addChild("O", Child.builder().description("어깨신전 SMCD").node(node8).build())
                .addChild("X", Child.builder().description("어깨 신전 JMD or TED").node(node8).build())
                .addChild("P", Child.builder().description("화학통증 치료").node(node8).build());

        Node node6 = Node.builder()
                .name("능동 엎드린자세 어깨 신전 50도")
                .imageFileName("2_6")
                .build()
                .addChild("O", Child.builder().node(node8).build())
                .addChild("X_P", Child.builder().node(node7).build());

        Node node5 = Node.builder()
                .name("수동 엎드린자세 어깨 90/90 내회전 60도")
                .imageFileName("2_5")
                .build()
                .addChild("O", Child.builder().description("어깨 내회전 SMCD").node(node6).build())
                .addChild("X", Child.builder().description("어깨 내회전 JMD or TED").node(node6).build())
                .addChild("P", Child.builder().description("화학 통증을 치료한다").node(node6).build());

        Node node4 = Node.builder()
                .name("능동 엎드린자세 어깨 90/90 내회전 60도")
                .imageFileName("2_4")
                .build()
                .addChild("O", Child.builder().node(node6).build())
                .addChild("X_P", Child.builder().node(node5).build());

        Node node3 = Node.builder()
                .name("누운자세 교차 상지 패턴 검사")
                .imageFileName("2_3")
                .build()
                .addChild("O", Child.builder().description("패턴1을 위한 분리된 자세 &/ or 어깨대 SMCD. 척추신전 하위 검사로 간다.").nextTest1(mainPackage.v1.tests.MultiExtension1.getInstance().getHead()).build())
                .addChild("X", Child.builder().description("패턴1의 기능적 어깨 패턴 SMCD. 척추신전 하위 검사로 간다.").nextTest1(MultiExtension1.getInstance().getHead()).build())
                .addChild("P", Child.builder().description("통증 치료").build());

        Node node2 = Node.builder()
                .name("수동 엎드린자세 상지패턴1")
                .imageFileName("2_2")
                .build()
                .addChild("O", Child.builder().node(node3).build())
                .addChild("X_P", Child.builder().node(node4).build());

        Node node1 = Node.builder()
                .name("능동 엎드린자세 상지패턴1")
                .imageFileName("2_1")
                .build()
                .addChild("O", Child.builder().node(node3).build())
                .addChild("X_P", Child.builder().node(node2).build());

        Node node0 = Node.builder()
                .name("상지 패턴 1")
                .imageFileName("0_4")
                .build()
                .addChild("O", Child.builder().build())
                .addChild("X_P", Child.builder().node(node1).build());

        addNode(node0, node1, node2, node3, node4, node5, node6, node7, node8, node9, node10);
    }

    public static Test getInstance() {
        if (UpperTest1.instance == null) { UpperTest1.instance = new UpperTest1();}
        return instance;
    }
}
