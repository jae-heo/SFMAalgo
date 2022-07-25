package mainPackage.util;

import mainPackage.domain.Child;
import mainPackage.domain.Node;
import mainPackage.domain.NodePrint;
import mainPackage.tests.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

public class NodeTracker {
    public static ArrayList<ArrayList<NodePrint>> printLists;

    public static void printList(Test test) {
        printLists = new ArrayList<>();
        ArrayList<NodePrint> printList = new ArrayList<>();
        iterNode(test.getHead(), printList);

        for (ArrayList<NodePrint> list : printLists) {
            System.out.println("\n\n");
            System.out.print("step "+ printLists.indexOf(list) +": ");

            for (NodePrint nodePrint : list) {
                System.out.print(list.indexOf(nodePrint) + 1 + "번 테스트(" + nodePrint.getNode().getName() + "): " + nodePrint.getSelection()+ " ");
            }
        }
    }

    public static void saveCSVWithPosition(Test test, String fileName) {
        printLists = new ArrayList<>();
        ArrayList<String> nodeNameOrders = test.getNameList();
        ArrayList<NodePrint> printList = new ArrayList<>();
        int pos;

        iterNode(test.getHead(), printList);

        try (PrintWriter writer = new PrintWriter(new File(fileName + ".csv"))) {
            StringBuilder sb = new StringBuilder();

            //각 프린트 해야하는 줄마다...
            for (ArrayList<NodePrint> list : printLists) {
                pos = 0;
                // 각 노드마다...
                for (NodePrint nodePrintFormat : list) {
                    //만약 노드의 이름이 지금 포지션에 맞는경우
                    if (nodePrintFormat.getNode().getName().equals(nodeNameOrders.get(list.indexOf(nodePrintFormat) + pos))) {
                        //바로 써준다.
                        sb.append(nodePrintFormat.getNode().getName() + ": " + nodePrintFormat.getSelection());

                    //만약 노드의 이름이 지금 포지션에 맞지 않는 경우
                    } else {
                        //맞을때까지 컴마를 써준다.
                        while (!nodePrintFormat.getNode().getName().equals(nodeNameOrders.get(list.indexOf(nodePrintFormat) + pos))) {
                            sb.append(",");
                            pos++;
                        }
                        //컴마를 다 써주고 포지션에 맞는 이름이 나온다면, 해당 노드에 대한 정보와 Selection 을 써준다.
                        sb.append(nodePrintFormat.getNode().getName() + ": " + nodePrintFormat.getSelection());
                    }
                    //하나의 노드에 대해서 끝났다면 컴마를 써준다.
                    sb.append(",");
                }
                sb.append("\n");
            }
            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void saveCSVWithoutPosition(Test test, String fileName) {
        printLists = new ArrayList<>();
        ArrayList<NodePrint> printList = new ArrayList<>();
        iterNode(test.getHead(), printList);

        try (PrintWriter writer = new PrintWriter(new File(fileName + ".csv"))) {
            StringBuilder sb = new StringBuilder();
            for (ArrayList<NodePrint> list : printLists) {
                for (NodePrint nodePrintFormat : list) {
                    sb.append(nodePrintFormat.getNode().getName() + ": " + nodePrintFormat.getSelection());
                    sb.append(",");
                }
                sb.append("\n");
            }
            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void iterNode(Node node, ArrayList<NodePrint> printList) {
        for (Map.Entry<String, Child> entry : node.getChildren().entrySet()) {
            if (entry.getValue().getNode() != null) {
                ArrayList<NodePrint> newPrintList = (ArrayList<NodePrint>) printList.clone();
                newPrintList.add(new NodePrint(node, entry.getKey()));
                iterNode(entry.getValue().getNode(), newPrintList);
            } else {
                ArrayList<NodePrint> newPrintList = (ArrayList<NodePrint>) printList.clone();
                newPrintList.add(new NodePrint(node, entry.getKey()));
                printLists.add(newPrintList);
            }
        }
    }
}
