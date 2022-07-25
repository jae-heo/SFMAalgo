package mainPackage.tests;

import mainPackage.domain.Node;



public class SpineTest2 extends Test{
    public SpineTest2() {
        Node node1 = new Node("수동 누운자세 경추 신전",
                new Child("There is Postural &/ or SMCD affecting Cervical Extension", null, null),
                new Child("경추 신전 JMD 그리고/또는 TED", null, null),
                new Child("화학통증 치료", null, null),
                false, "1_7", null);

        Node node0 = new Node("능동 경추 신전",
                new Child("", null, null),
                new Child("", node1, null),
                new Child("", null, null),
                true, "0_2", null);
        this.addNode(node0, node1);
    }
    public static Test instance;
    public static Test getInstance() {
        if (SpineTest2.instance == null) { SpineTest2.instance = new SpineTest2();}
        return instance;
    }
}
