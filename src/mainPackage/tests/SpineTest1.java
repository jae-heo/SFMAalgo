package mainPackage.tests;

import mainPackage.domain.Node;

public class SpineTest1 extends Test{
    public SpineTest1() {
        Node node3 = new Node("능동 누운자세 후두-환추 경추 굴곡 20도",
                new Child("수동 누운자세 경추 굴곡이 (PSCF) DP or DN 이면 경추굴곡 JMD &/or TED로 치료한다." +
                        "만약 PSCF 가 FP 이면 SMCD일 수 있다. - 분절검사를 실행하고 연부조직 평가를 한다.", null, null),
                new Child("OA 굴곡 JMD &/or TED &/or 가능한 경추 굴곡 JMD &/or TED", null, null),
                new Child("통증 치료", null, null),
                false, "1_3", null);

        Node node2 = new Node("수동 누운자세경추 굴곡",
                new Child("능동 경추 굴곡 SMCD", null, null),
                new Child("", node3, null),
                new Child("", null, null),
                true, "1_2", null);

        Node node1 = new Node("능동 누운자세경추 굴곡",
                new Child("자세 SMCD 가 척추굴곡에 영향을 준다. 이것은 경추, 흉추 그리고 어깨대 자세 기능제한을 포함한다.", null, null),
                new Child("", node2, null),
                new Child("", null, null),
                true, "1_1", null);

        Node node0 = new Node("능동 경추 굴곡",
                new Child("", null, null),
                new Child("", node1, null),
                new Child("", null, null),
                true, "0_1", null);
        this.addNode(node0, node1, node2, node3);
    }
    public static Test instance;
    public static Test getInstance() {
        if (SpineTest1.instance == null) { SpineTest1.instance = new SpineTest1();}
        return instance;
    }
}
