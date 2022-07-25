
package mainPackage.tests;

import mainPackage.domain.Node;

public class OneLegTest extends Test{

    public OneLegTest() {
        Node node5 = Node.builder()
                .name("네발기기자세 상-하체 교차 뻗기")
                .O(new Child("체중지지 척추 &/or 고관절/코어 SMCD - (만약 고관절 신전이 DN이면 이것을 먼저 치료한다). SLS 발목 플로우챠트로 간다.", null, null))
                .X(new Child("체중지지고관절 &/or 코어 SMCD (만약 고관절 신전 &/or 어깨 굴곡이 DN이면 이것을 먼저 치료한다.) SLS 발목 플로우챠트로 간다.", null, null))
                .P(new Child("통증을 치료한다. - SLS 발목 플로우챠트로 간다.", null, null))
                .imageFileName("6_5")
                .build();

        Node node4 = Node.builder()
                .name("롤링")
                .O(new Child("", node5, null))
                .X(new Child("펀더먼털 고관절 &/ or 코어 SMCD - SLS 발목 플로우챠트로 간다.", null, null))
                .P(new Child("통증을 치료 - SLS 박목 플로우챠트로 간다", null, null))
                .imageFileName("6_4")
                .build();

        Node node3 = Node.builder()
                .name("반무릎자세")
                .O(new Child("SLS 발목 플로우챠트로 간다.", null, null))
                .X(new Child("", node4, null))
                .P(new Child("", null, null))
                .imageFileName("6_3")
                .isXPCombined(true)
                .build();

        Node node2 = Node.builder()
                .name("동적 CTSIB")
                .O(new Child("", node3, null))
                .X(new Child("동적 전정기능 제한", node3, null))
                .P(new Child("", null, null))
                .imageFileName("6_2")
                .isXPCombined(true)
                .build();

        Node node1 = Node.builder()
                .name("정적 CTSIB")
                .O(new Child("", node2, null))
                .X(new Child("정적 전정기능 제한 가능성", node3, null))
                .P(new Child("", null, null))
                .imageFileName("6_1")
                .isXPCombined(true)
                .build();

        Node node0 = Node.builder()
                .name("한발 서기")
                .O(new Child("", null, null))
                .X(new Child("", node1, null))
                .P(new Child("", null, null))
                .imageFileName("0_9")
                .isXPCombined(true)
                .build();

        addNode(node0, node1, node2, node3, node4, node5);
    }
    public static Test instance;
    public static Test getInstance() {
        if (OneLegTest.instance == null) { OneLegTest.instance = new OneLegTest();}
        return instance;
    }
}

