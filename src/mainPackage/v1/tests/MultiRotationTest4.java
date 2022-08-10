package mainPackage.v1.tests;

import mainPackage.domain.Child;
import mainPackage.domain.Node;


public class MultiRotationTest4 extends Test{
    public static Test instance;
    public MultiRotationTest4() {
        Node node1 = Node.builder()
                .name("수동 앉은자세 경골 내회전 20도")
                .imageFileName("5_18")
                .build()
                .addChild("O", Child.builder().description("경골회전 SMCD").build())
                .addChild("X", Child.builder().description("경골 내회전 TED &/or JMD").build())
                .addChild("P", Child.builder().description("통증 치료").build());

        Node node0 = Node.builder()
                .name("능동 앉은자세 경골 내회전 20도")
                .imageFileName("5_17")
                .build()
                .addChild("O", Child.builder().description("경골 내회전 가동성이 정상이다 - 하체 신전 " +
                        "플로우차트를 재확인한다.").build())
                .addChild("X_P", Child.builder().node(node1).build());

        this.addNode(node0, node1);
    }

    public static Test getInstance() {
        if (MultiRotationTest4.instance == null) { MultiRotationTest4.instance = new MultiRotationTest4();}
        return instance;
    }
}
