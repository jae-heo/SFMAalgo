
package mainPackage.v1.tests;

import mainPackage.v1.domain.Child;
import mainPackage.v1.domain.Node;
public class OneLegTest1 extends Test{

    public static Test instance;
    public OneLegTest1() {
        Node node5 = Node.builder()
                .name("네발기기자세 상-하체 교차 뻗기")
                .imageFileName("6_5")
                .build()
                .addChild("O", Child.builder().description("체중지지 척추 &/or 고관절/코어 SMCD - 만약 고관절 신전이 DN이면 이것을 먼저 치료한다.").build())
                .addChild("X", Child.builder().description("체중지지고관절 &/or 코어 SMCD 만약 고관절 신전 &/or 어깨 굴곡이 DN이면 이것을 먼저 치료한다.").build())
                .addChild("P", Child.builder().description("통증을 치료한다.").build());

        Node node4 = Node.builder()
                .name("롤링")
                .imageFileName("6_4")
                .build()
                .addChild("O", Child.builder().node(node5).build())
                .addChild("X", Child.builder().description("펀더먼털 고관절 &/ or 코어 SMCD.").build())
                .addChild("P", Child.builder().description("통증을 치료").build());

        Node node3 = Node.builder()
                .name("반무릎자세")
                .imageFileName("6_3")
                .build()
                .addChild("O", Child.builder().build())
                .addChild("X_P", Child.builder().node(node4).build());

        Node node2 = Node.builder()
                .name("동적 CTSIB")
                .imageFileName("6_2")
                .build()
                .addChild("X_P", Child.builder().description("동적 전정기능 제한").node(node3).build())
                .addChild("O", Child.builder().node(node3).build());

        Node node1 = Node.builder()
                .name("정적 CTSIB")
                .imageFileName("6_1")
                .build()
                .addChild("X_P", Child.builder().description("정적 전정기능 제한 가능성").node(node3).build())
                .addChild("O", Child.builder().node(node2).build());

        Node node0 = Node.builder()
                .name("한발 서기")
                .imageFileName("0_9")
                .build()
                .addChild("X_P", Child.builder().node(node1).build())
                .addChild("O", Child.builder().build());

        addNode(node0, node1, node2, node3, node4, node5);
    }

    public static Test getInstance() {
        if (OneLegTest1.instance == null) { OneLegTest1.instance = new OneLegTest1();}
        return instance;
    }
}

