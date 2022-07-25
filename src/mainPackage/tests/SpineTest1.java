package mainPackage.tests;

import mainPackage.domain.Child;
import mainPackage.domain.Node;

public class SpineTest1 extends Test{
    public static Test instance;
    public SpineTest1() {
        Node node3 = Node.builder()
                .name("능동 누운자세 후두-환추 경추 굴곡 20도")
                .imageFileName("1_3")
                .build()
                .addChild("O", Child.builder().description("수동 누운자세 경추 굴곡이 (PSCF) DP or DN 이면 " +
                        "경추굴곡 JMD &/or TED로 치료한다. 만약 PSCF 가 FP 이면 SMCD일 수 있다. - 분절검사를 실행하고 " +
                        "연부조직 평가를 한다.").build())
                .addChild("X", Child.builder().description("OA 굴곡 JMD &/or TED &/or 가능한 경추 굴곡 JMD &/or TED").build())
                .addChild("P", Child.builder().description("통증 치료").build());

        Node node2 = Node.builder()
                .name("능동 누운자세경추 굴곡")
                .imageFileName("1_2")
                .build()
                .addChild("O", Child.builder().description("능동 경추 굴곡 SMCD").build())
                .addChild("X_P", Child.builder().node(node3).build());

        Node node1 = Node.builder()
                .name("능동 누운자세경추 굴곡")
                .imageFileName("1_1")
                .build()
                .addChild("O", Child.builder().description("자세 SMCD 가 척추굴곡에 영향을 준다. 이것은 경추, 흉추 그리고 어깨대 자세 기능제한을 포함한다.").build())
                .addChild("X_P", Child.builder().node(node2).build());

        Node node0 = Node.builder()
                .name("능동 경추 굴곡")
                .imageFileName("0_1")
                .build()
                .addChild("O", Child.builder().build())
                .addChild("X_P", Child.builder().node(node1).build());


        this.addNode(node0, node1, node2, node3);
    }

    public static Test getInstance() {
        if (SpineTest1.instance == null) { SpineTest1.instance = new SpineTest1();}
        return instance;
    }
}
