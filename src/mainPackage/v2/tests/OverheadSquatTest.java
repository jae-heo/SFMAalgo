
package mainPackage.v2.tests;

import mainPackage.v1.domain.Child;
import mainPackage.v1.domain.Node;
import mainPackage.v1.tests.Test;

public class OverheadSquatTest extends mainPackage.v1.tests.Test {

    public static mainPackage.v1.tests.Test instance;
    public OverheadSquatTest() {
        Node node6 = Node.builder()
                .name("누워서 허벅지 잡고 무릎 가슴 당기기")
                .imageFileName("7_5")
                .build()
                .addChild("O", Child.builder().description("무릎 JMD (굴곡) 그리고/또는 하부 전방 체인 TED, " +
                        "복수-분절 신전 하위검사로 이동한다.").build())
                .addChild("X", Child.builder().description("고관절 JMD 그리고/또는 후방 체인 TED - 고관절을 위한 " +
                        "복수분절 굴곡으로 이동한다. 무릎 JMD 가능성이 있으므로 - 복수-분절 신전 하위검사로 이동한다.").build())
                .addChild("P", Child.builder().description("통증을 치료한다.").build());

        Node node5 = Node.builder()
                .name("누워서 정강이 잡고 무릎 가슴 당기기")
                .imageFileName("7_4")
                .build()
                .addChild("O", Child.builder().description("만약 배측굴곡이 FN이면 = 체중 지지 코어, 무릎 그리고/또는 " +
                        "고관절 굴곡 SMCD. 만약 배측굴곡이 DN이면, 무릎, 고관절 코어는 정상으로 생각한다. 만약 배측굴곡이 DP또는 " +
                        "FP이면 이것을 빨간상자라고 생각하고 배측굴곡을 치료한다. 복수-분절 신전 하위검사로 이동한다.").build())
                .addChild("X_P", Child.builder().node(node6).build());

        Node node4 = Node.builder()
                .name("반무릎자세 배측 굴곡 (무릎이 발끝보다 10센치 이상)")
                .imageFileName("7_3")
                .build()
                .addChild("O_P", Child.builder().node(node5).build())
                .addChild("X", Child.builder().node(node5).description("하부 후방 체인 TED 그리고/또는 발목 " +
                        "JMD, MSE 및 SLS 하위검사에 문제가 없다는 것을 확인").build());

        Node node3 = Node.builder()
                .name("보조 딥 스쿼트")
                .imageFileName("7_2")
                .build()
                .addChild("O", Child.builder().description("코어 SMCD (롤링을 사용하여 점수를 평가한다), 또한 " +
                        "복수분절 신전 하위검사에 문제가 없다는 것을 확인한다.").build())
                .addChild("X_P", Child.builder().node(node4).build());

        Node node2 = Node.builder()
                .name("목 깍지 딥 스쿼트")
                .imageFileName("7_1")
                .build()
                .addChild("O", Child.builder().node(node3).description("스쿼트가 기능적이고 통증이없다면 - " +
                        "모든 신전 하위검사 플로우차트를 재검사 한다.").build())
                .addChild("X_P", Child.builder().node(node3).build());

        Node node1 = Node.builder()
                .name("오버헤드 딥 스쿼트")
                .imageFileName("0_10")
                .build()
                .addChild("X_P", Child.builder().node(node2).build())
                .addChild("O", Child.builder().build());

        addNode(node1, node2, node3, node4, node5, node6);
    }

    public static Test getInstance() {
        if (OverheadSquatTest.instance == null) { OverheadSquatTest.instance = new OverheadSquatTest();}
        return instance;
    }
}

