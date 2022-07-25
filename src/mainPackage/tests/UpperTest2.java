package mainPackage.tests;


import mainPackage.domain.Node;

public class UpperTest2 extends Test {
    public UpperTest2() {
        Node node10 = Node.builder()
                .name("능동 요추 잠금 신전-회전 (가슴) 50도")
                .O(new Child("결과가 아직 없다면, 패턴2의 복합 JMD", null, null))
                .X(new Child("흉추신전 JMD, TED, or SMCD. 수동으로 분별", null, null))
                .P(new Child("통증 치료", null, null))
                .imageFileName("2_20")
                .build();

        Node node9 = Node.builder()
                .name("수동 엎드린자세 팔꿈치 굴곡2")
                .O(new Child("팔꿈치 굴곡 SMCD", node10, null))
                .X(new Child("팔꿈치굴곡 JMD or TED", node10, null))
                .P(new Child("통증치료", node10, null))
                .imageFileName("2_19")
                .build();

        Node node8 = Node.builder()
                .name("능동 엎드린자세 팔꿈치 굴곡2")
                .O(new Child("", node10, null))
                .X(new Child("", node9, null))
                .P(new Child("", null, null))
                .imageFileName("2_18")
                .isXPCombined(true)
                .build();

        Node node7 = Node.builder()
                .name("수동 엎드린자세 어깨 외전 170도")
                .O(new Child("어깨 굴곡/ 외전 SMCD", node8, null))
                .X(new Child("어깨 굴곡/외전 JMD or TED", node8, null))
                .P(new Child("화학통증 치료", node8, null))
                .imageFileName("2_17")
                .build();

        Node node6 = Node.builder()
                .name("능동 엎드린자세 어깨 외전 170도")
                .O(new Child("", node8, null))
                .X(new Child("", node7, null))
                .P(new Child("", null, null))
                .imageFileName("2_16")
                .isXPCombined(true)
                .build();

        Node node5 = Node.builder()
                .name("수동 엎드린자세 어깨 90/90 외회전 90도")
                .O(new Child("어깨 외회전 SMCD", node6, null))
                .X(new Child("어깨 외회전 JMD or TED", node6, null))
                .P(new Child("화학 통증을 치료한다", node6, null))
                .imageFileName("2_15")
                .build();

        Node node4 = Node.builder()
                .name("능동 엎드린자세 어깨 90/90 외회전 90도")
                .O(new Child("", node6, null))
                .X(new Child("", node5, null))
                .P(new Child("", null, null))
                .imageFileName("2_14")
                .isXPCombined(true)
                .build();

        Node node3 = Node.builder()
                .name("누운자세 교차 상지 패턴 검사")
                .O(new Child("패턴2을 위한 분리된 자세 &/ or 어깨대 SMCD. 척추신전 하위 검사로 간다.", null, null))
                .X(new Child("패턴2의 기능적 어깨 패턴 SMCD. 척추신전 하위 검사로 간다.", null, null))
                .P(new Child("통증 치료", null, null))
                .imageFileName("2_13")
                .build();

        Node node2 = Node.builder()
                .name("수동 엎드린자세 상지패턴2")
                .O(new Child("", node3, null))
                .X(new Child("", node4, null))
                .P(new Child("", null, null))
                .imageFileName("2_12")
                .isXPCombined(true)
                .build();

        Node node1 = Node.builder()
                .name("능동 엎드린자세 상지패턴2")
                .O(new Child("", node3, null))
                .X(new Child("", node2, null))
                .P(new Child("", null, null))
                .imageFileName("2_11")
                .isXPCombined(true)
                .build();

        Node node0 = Node.builder()
                .name("상지 패턴 2")
                .O(new Child("", null, null))
                .X(new Child("", node1, null))
                .P(new Child("", null, null))
                .imageFileName("0_5")
                .isXPCombined(true)
                .build();

        addNode(node0, node1, node2, node3, node4, node5, node6, node7, node8, node9, node10);
    }
    public static Test instance;
    public static Test getInstance() {
        if (UpperTest2.instance == null) { UpperTest2.instance = new UpperTest2();}
        return instance;
    }
}
