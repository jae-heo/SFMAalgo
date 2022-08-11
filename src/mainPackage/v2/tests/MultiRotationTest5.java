package mainPackage.v2.tests;


import mainPackage.v1.domain.Child;
import mainPackage.v1.domain.Node;
import mainPackage.v1.tests.Test;


public class MultiRotationTest5 extends mainPackage.v1.tests.Test {
    public static mainPackage.v1.tests.Test instance;
    public MultiRotationTest5() {
        Node node1 = Node.builder()
                .name("수동 앉은자세 경골 외회전 20도")
                .imageFileName("5_16")
                .build()
                .addChild("O", Child.builder().description("경골회전 SMCD").build())
                .addChild("X", Child.builder().description("경골 외회전 TED &/or JMD").build())
                .addChild("P", Child.builder().description("통증 치료").build());

        Node node0 = Node.builder()
                .name("능동 앉은자세 경골 외회전 20도")
                .imageFileName("5_15")
                .build()
                .addChild("O", Child.builder().description("경골 외회전 가동성이 정상이다 - 하체 신전 " +
                        "플로우차트를 재확인한다.").build())
                .addChild("X_P", Child.builder().node(node1).build());

        this.addNode(node0, node1);
    }

    public static Test getInstance() {
        if (MultiRotationTest5.instance == null) { MultiRotationTest5.instance = new MultiRotationTest5();}
        return instance;
    }
}
