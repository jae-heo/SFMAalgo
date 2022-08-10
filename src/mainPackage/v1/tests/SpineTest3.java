package mainPackage.v1.tests;

import mainPackage.domain.Child;
import mainPackage.domain.Node;


public class SpineTest3 extends Test{
    public static Test instance;
    public SpineTest3() {
        Node node3 = Node.builder()
                .name("수동 누운자세 C1-C2 경추 굴곡-회전 40도")
                .imageFileName("1_6")
                .build()
                .addChild("O", Child.builder().description("수동 누운자세 경추 회전이 (PSCR) DP or DN 이면" +
                        " 하부 경추 회전 JMD &/or TED로 치료한다. 만약 PSCR가 FP 이면 SMCD일 수 있다. - 분절검사를 " +
                        "실행하고 연부조직 평가를 한다.").build())
                .addChild("X", Child.builder().description("C1-C2 JMD &/ or TED &/or 하부 경추 JMD &/or TED.").build())
                .addChild("P", Child.builder().description("화학 통증을 치료한다").build());

        Node node2 = Node.builder()
                .name("수동 누운자세 경추 회전 80도")
                .imageFileName("1_5")
                .build()
                .addChild("O", Child.builder().description("능동 경추 회전 SMCD").build())
                .addChild("X_P", Child.builder().node(node3).build());

        Node node1 = Node.builder()
                .name("능동 누운자세 경추 회전 80도")
                .imageFileName("1_4")
                .build()
                .addChild("O", Child.builder().description("만약 경추 굴곡이 DN이면 - 굴곡을 먼저 치료한다. " +
                        "그렇지 않으면, 자세 and/or SMCD가 경추회전에 영향을 준다. 이것은 경추, 흉추, 그리고 어깨대 자세 " +
                        "기능제한을 포함한다.").build())
                .addChild("X_P", Child.builder().node(node2).build());

        Node node0 = Node.builder()
                .name("능동 경추 회전-측면 굽힘")
                .imageFileName("0_3")
                .build()
                .addChild("O", Child.builder().build())
                .addChild("X_P", Child.builder().node(node1).build());

        this.addNode(node0, node1, node2, node3);
    }

    public static Test getInstance() {
        if (SpineTest3.instance == null) { SpineTest3.instance = new SpineTest3();}
        return instance;
    }
}
