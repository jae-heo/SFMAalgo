package mainPackage.tests;

import mainPackage.domain.Node;


public class SpineTest3 extends Test{
    public SpineTest3() {
        Node node3 = new Node("수동 누운자세 C1-C2 경추 굴곡-회전 40도",
                new Child("수동 누운자세 경추 회전이 (PSCR) DP or DN 이면 하부 경추 회전 JMD &/or TED로 치료한다. " +
                        "만약 PSCR가 FP 이면 SMCD일 수 있다. - 분절검사를 실행하고 연부조직 평가를 한다.", null, null),
                new Child("C1-C2 JMD &/ or TED &/or 하부 경추 JMD &/or TED.", null, null),
                new Child("화학 통증을 치료한다", null, null),
                false, "1_6", null);

        Node node2 = new Node("수동 누운자세 경추 회전 80도",
                new Child("능동 경추 회전 SMCD", null, null),
                new Child("", node3, null),
                new Child("", null, null),
                true, "1_5", null);

        Node node1 = new Node("능동 누운자세 경추 회전 80도",
                new Child("만약 경추 굴곡이 DN이면 - 굴곡을 먼저 치료한다. 그렇지 않으면, 자세 and/or SMCD가 경추회전에 영향을 준다. " +
                        "이것은 경추, 흉추, 그리고 어깨대 자세 기능제한을 포함한다.", null, null),
                new Child("", node2, null),
                new Child("", null, null),
                true, "1_4", null);

        Node node0 = new Node("능동 경추 회전-측면 굽힘",
                new Child("", null, null),
                new Child("", node1, null),
                new Child("", null, null),
                true, "0_3", null);
        this.addNode(node0, node1, node2, node3);
    }
    public static Test instance;
    public static Test getInstance() {
        if (SpineTest3.instance == null) { SpineTest3.instance = new SpineTest3();}
        return instance;
    }
}
