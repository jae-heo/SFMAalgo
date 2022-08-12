package mainPackage.v2.tests;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Node;

import static mainPackage.v2.domain.Child.COLOR.*;
import static mainPackage.v2.domain.Node.SELECTION.*;
public class CSPB1 extends Test {
    public static Test instance;
    public CSPB1() {
        Node node3 = Node.builder()
                .name("능동 누운자세 후두-환추 경추 굴곡 20도")
                .imageFileName("1_3")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("수동 누운자세 경추 굴곡이 (PSCF) DP or DN 이면 " +
                        "경추굴곡 JMD &/or TED로 치료한다. 만약 PSCF 가 FP 이면 SMCD일 수 있다. - 분절검사를 실행하고 " +
                        "연부조직 평가를 한다.").build())
                .addChild(DN, Child.builder().color(GREEN).description("OA 굴곡 JMD &/or TED &/or 가능한 경추 굴곡 JMD &/or TED").build())
                .addChild(P, Child.builder().color(RED).description("통증 치료").build());

        Node node2 = Node.builder()
                .name("수동 누운자세경추 굴곡")
                .imageFileName("1_2")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("능동 경추 굴곡 SMCD").build())
                .addChild(DN, Child.builder().color(WHITE).node(node3).build())
                .addChild(P, Child.builder().color(WHITE).node(node3).build());

        Node node1 = Node.builder()
                .name("능동 누운자세경추 굴곡")
                .imageFileName("1_1")
                .build()
                .addChild(FN, Child.builder().color(GREEN).description("자세 SMCD 가 척추굴곡에 영향을 준다. 이것은 경추, 흉추 그리고 어깨대 자세 기능제한을 포함한다.").build())
                .addChild(DN, Child.builder().color(WHITE).node(node2).build())
                .addChild(P, Child.builder().color(WHITE).node(node2).build());

        Node node0 = Node.builder()
                .name("능동 경추 굴곡")
                .imageFileName("0_1")
                .build()
                .addChild(FN, Child.builder().color(GREEN).build())
                .addChild(DN, Child.builder().color(GREEN).node(node1).build())
                .addChild(P, Child.builder().color(GREEN).node(node1).build());


        this.addNode(node1, node2, node3);
    }

    public static Test getInstance() {
        if (CSPB1.instance == null) { CSPB1.instance = new CSPB1();}
        return instance;
    }
}
