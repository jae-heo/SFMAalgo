package mainPackage.v2;

import mainPackage.v2.domain.Child;
import mainPackage.v2.domain.Child.COLOR;
import mainPackage.v2.domain.Node;
import mainPackage.v2.domain.Node.SELECTION;
import mainPackage.v2.tests.MultiFlexionTest;
import mainPackage.v2.tests.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class AppV2 {
    public static HashMap<String, Node> nodeMap = new HashMap<>();
    ArrayList<String> instructions = new ArrayList<>();
    HashMap<Node, SELECTION> nodeHistory = new HashMap<>();
    ArrayList<Node> nextTests = new ArrayList<>();
    ArrayList<Node> nextSingleTests = new ArrayList<>();
    Test multiFlexionTest = MultiFlexionTest.getInstance();

    public void runMultiFlexionTest() {
        Node currentNode = multiFlexionTest.getHead();
        Set<SELECTION> currentSelections = currentNode.getChildren().keySet();
        ArrayList<String> currentSelectionNames = new ArrayList<>();
        while (true) {
            System.out.println("하나를 선택해주세요");
            for (SELECTION selection : currentSelections) {
                System.out.print(selection + ":" + selection.getName() + "   ");
                currentSelectionNames.add(selection.name());
            }
            System.out.println("\n");

            /**
             * 보기를 보여준 후 선택지를 받는 부분, 옳지 않은 선택지를 입력시 다시 입력받는다.
             */
            Scanner scanner = new Scanner(System.in);
            String selection = scanner.next();
            while (!currentSelectionNames.contains(selection)) {
                System.out.println("다시 입력해주세요");
                selection = scanner.next();
            }
            Child currentChild = currentNode.getChildren().get(SELECTION.valueOf(selection));
            /**
             * 이부분은 노드에 설명이 있을 경우 설명을 넣는 부분이다.
             */
            if (currentChild.getDescription() != null) {
                instructions.add(currentChild.getDescription());
            }

            /**
             * 이부분은 이제 노드 색깔에 따라서 처리하는 부분이다.
             */
            if (currentChild.getColor() == COLOR.WHITE || currentChild.getColor() == COLOR.ORANGE) {
                if (currentChild.getIsConditional()) {
                    if (nodeHistory.get(nodeMap.get(currentChild.getConditionNodeName())) == currentChild.getConditionSelection()) {
                        break;
                    }
                } else {
                    currentNode = currentChild.getNode();
                }
            } else if (currentChild.getColor() == COLOR.GREEN) {
                break;
            } else if (currentChild.getColor() == COLOR.RED) {
                break;
            } else if (currentChild.getColor() == COLOR.BLUE) {
                // 테스트 / 싱글테스트 여부를 확인한다.
            }
        }
        /**
         *  반복문이 끝나고 이제 해당 테스트에 대한 설명과 처방을 출력한다.
         *  instruction 을 같은 것 끼리 폼을 통합하고, SET 을 통해 경우의수를 줄여서 모든 경우에 수에 대해서 전문가의 처방을 받는다.
         *  모든 경우의 수는 set으로 줄이고 sorting해서 경우의수를 최소화시킨다.(string화 시키자)
         *  그리고 비교를 통해서 최종 결과를 제출해주자!
         */


    }
}
