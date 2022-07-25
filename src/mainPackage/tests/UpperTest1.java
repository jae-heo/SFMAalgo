package mainPackage.tests;


import mainPackage.domain.Node;

import java.util.List;


public class UpperTest1 extends Test {
    public UpperTest1() {
        Node node10 = Node.builder()
                .name("능동 요추 잠금 신전-회전 (가슴) 50도")
                .children(List.of(new Child("결과가 아직 없다면, 패턴1의 복합 JMD", null, null),
                                new Child("흉추신전 JMD, TED, or SMCD. 수동으로 분별", null, null),
                                new Child("통증 치료", null, null)))
                .imageFileName("2_10")
                .build();

        Node node9 = Node.builder()
                .name("수동 엎드린자세 팔꿈치 굴곡")
                .children(List.of(new Child("팔꿈치 굴곡 SMCD", node10, null),
                        new Child("팔꿈치굴곡 JMD or TED", node10, null),
                        new Child("통증치료", node10, null)))
                .imageFileName("2_9")
                .build();

        Node node8 = Node.builder()
                .name("능동 엎드린자세 팔꿈치 굴곡")
                .children(List.of(new Child("", node10, null),
                        new Child("", node9, null),
                        new Child("", null, null)))
                .imageFileName("2_8")
                .isXPCombined(true)
                .build();

        Node node7 = Node.builder()
                .name("수동 엎드린자세 어깨 신전 50도")
                .children(List.of(new Child("어깨신전 SMCD", node8, null),
                        new Child("어깨 신전 JMD or TED", node8, null),
                        new Child("화학통증 치료", node8, null)))
                .imageFileName("2_7")
                .build();

        Node node6 = Node.builder()
                .name("능동 엎드린자세 어깨 신전 50도")
                .children(List.of(new Child("", node8, null),
                        new Child("", node7, null),
                        new Child("", null, null)))
                .imageFileName("2_6")
                .isXPCombined(true)
                .build();

        Node node5 = Node.builder()
                .name("수동 엎드린자세 어깨 90/90 내회전 60도")
                .children(List.of(new Child("어깨 내회전 SMCD", node6, null),
                        new Child("어깨 내회전 JMD or TED", node6, null),
                        new Child("화학 통증을 치료한다", node6, null)))
                .imageFileName("2_5")
                .build();

        Node node4 = Node.builder()
                .name("능동 엎드린자세 어깨 90/90 내회전 60도")
                .children(List.of(new Child("", node6, null),
                        new Child("", node5, null),
                        new Child("", null, null)))
                .imageFileName("2_4")
                .isXPCombined(true)
                .build();

        Node node3 = Node.builder()
                .name("누운자세 교차 상지 패턴 검사")
                .children(List.of(new Child("패턴1을 위한 분리된 자세 &/ or 어깨대 SMCD. 척추신전 하위 검사로 간다.", null, null),
                        new Child("패턴1의 기능적 어깨 패턴 SMCD. 척추신전 하위 검사로 간다.", null, null),
                        new Child("통증 치료", null, null)))
                .imageFileName("2_3")
                .build();

        Node node2 = Node.builder()
                .name("수동 엎드린자세 상지패턴1")
                .children(List.of(new Child("", node3, null),
                        new Child("", node4, null),
                        new Child("", null, null)))
                .imageFileName("2_2")
                .isXPCombined(true)
                .build();

        Node node1 = Node.builder()
                .name("능동 엎드린자세 상지패턴1")
                .children(List.of(new Child("", node3, null),
                        new Child("", node2, null),
                        new Child("", null, null)))
                .imageFileName("2_1")
                .isXPCombined(true)
                .build();

        Node node0 = Node.builder()
                .name("상지 패턴 1")
                .children(List.of(new Child("", null, null),
                        new Child("", node1, null),
                        new Child("", null, null)))
                .imageFileName("0_4")
                .isXPCombined(true)
                .build();

        addNode(node0, node1, node2, node3, node4, node5, node6, node7, node8, node9, node10);
    }
    public static Test instance;
    public static Test getInstance() {
        if (UpperTest1.instance == null) { UpperTest1.instance = new UpperTest1();}
        return instance;
    }
}
