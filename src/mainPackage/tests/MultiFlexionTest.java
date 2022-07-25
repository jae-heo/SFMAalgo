package mainPackage.tests;

import mainPackage.domain.Node;

public class MultiFlexionTest extends Test{
    public MultiFlexionTest() {
        Node node8 = Node.builder()
                        .name("누운자세 허벅지 잡고 가슴 당기기")
                        .O(new Child("후방 사슬 TED &/or 능동 고관절 굴곡 SMCD", null, null))
                        .X(new Child("고관절 JMD &/or 후방 사슬 TED", null, null))
                        .P(new Child("통증을 치료한다.", null, null))
                        .imageFileName("3_7")
                        .build();

        Node node6 = Node.builder()
                .name("롤링2")
                .O(new Child("이전에 주황색 상자가 없었으면, 체중 부하 척추 SMCD 이다 - 그렇지 않으면 척추 굴곡을 정상으로 가정한다.", null, null))
                .X(new Child("펀더맨털 굴곡 패턴 SMCD", null, null))
                .P(new Child("통증을 치료한다.", null, null))
                .imageFileName("3_5")
                .build();

        Node node7 = Node.builder()
                .name("Prone rocking")
                .O(new Child("", node6, null))
                .X(new Child("척추 굴곡 JMD &/or TED", null, null))
                .P(new Child("통증을 치료한다.", null, null))
                .imageFileName("3_6")
                .build();

        Node node5 = Node.builder()
                .name("PSLR 80도")
                .O(new Child("코어 SMCD &/or 능동 고관절 굴곡 SMCD", node7, null))
                .X(new Child("", node8, null))
                .P(new Child("", null, null))
                .isXPCombined(true)
                .imageFileName("3_4")
                .build();

        Node node4 = Node.builder()
                .name("ASLR 70도")
                .O(new Child("", node7, null))
                .X(new Child("", node5, null))
                .P(new Child("", null, null))
                .isXPCombined(true)
                .imageFileName("3_3")
                .build();

        Node node3 = Node.builder()
                .name("롤링1")
                .O(new Child("체중 부하 고관절 굴곡 패턴 SMCD", null, null))
                .X(new Child("펀더맨털 굴곡 패턴 SMCD", null, null))
                .P(new Child("통증을 치료한다.", null, null))
                .imageFileName("3_5")
                .build();

        Node node2 = Node.builder()
                .name("다리펴고 앉아 손끝닿기 천추각 80도")
                .O(new Child("", node3, null))
                .X(new Child("", node4, null))
                .P(new Child("", null, null))
                .imageFileName("3_2")
                .isXPCombined(true)
                .build();

        Node node1 = Node.builder()
                .name("한발 전방 굽힘")
                .O(new Child("", node2, null))
                .X(new Child("", node2, null))
                .P(new Child("", null, null))
                .imageFileName("3_1")
                .isXPCombined(true)
                .build();

        Node node0 = Node.builder()
                .name("다중 분절 굴곡")
                .O(new Child("", null, null))
                .X(new Child("", node1, null))
                .P(new Child("", null, null))
                .imageFileName("0_6")
                .isXPCombined(true)
                .build();

        addNode(node0, node1, node2, node3, node4, node5, node7, node6, node8);
    }

    public static Test instance;
    public static Test getInstance() {
        if (MultiFlexionTest.instance == null) { MultiFlexionTest.instance = new MultiFlexionTest();}
        return instance;
    }
}
