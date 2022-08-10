package mainPackage.v1.tests;

import mainPackage.v1.domain.Child;
import mainPackage.v1.domain.Node;



public class SpineTest2 extends Test{
    public static Test instance;
    public SpineTest2() {
        Node node1 = Node.builder()
                .name("수동 누운자세 경추 신전")
                .imageFileName("1_7")
                .build()
                .addChild("O", Child.builder().description("There is Postural &/ or SMCD affecting Cervical Extension").build())
                .addChild("X", Child.builder().description("경추 신전 JMD 그리고/또는 TED").build())
                .addChild("P", Child.builder().description("통증 치료").build());

        Node node0 = Node.builder()
                .name("능동 경추 신전")
                .imageFileName("0_2")
                .build()
                .addChild("O", Child.builder().build())
                .addChild("X_P", Child.builder().node(node1).build());

        this.addNode(node0, node1);
    }

    public static Test getInstance() {
        if (SpineTest2.instance == null) { SpineTest2.instance = new SpineTest2();}
        return instance;
    }
}
