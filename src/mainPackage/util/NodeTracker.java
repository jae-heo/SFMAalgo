package mainPackage.util;

import mainPackage.domain.Node;
import mainPackage.tests.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class NodeTracker {
    public static ArrayList<ArrayList<NodePrintFormat>> printLists;

    public static void printList(Test test) {
        printLists = new ArrayList<>();
        ArrayList<NodePrintFormat> printList = new ArrayList<>();
        iterNode(test.getHead(), printList);

        for (ArrayList<NodePrintFormat> list : printLists) {
            System.out.println("\n\n");
            System.out.print("step "+ printLists.indexOf(list) +": ");

            for (NodePrintFormat nodePrintFormat : list) {
                System.out.print(list.indexOf(nodePrintFormat) + 1 + "번 테스트(" + nodePrintFormat.getNode().getName() + "): " + nodePrintFormat.getSelection()+ " ");
            }
        }
    }

    public static void saveCSVWithPosition(Test test, String fileName) {
        printLists = new ArrayList<>();
        ArrayList<String> nodeNameOrders = test.getNameList();
        ArrayList<NodePrintFormat> printList = new ArrayList<>();
        int pos;

        iterNode(test.getHead(), printList);

        try (PrintWriter writer = new PrintWriter(new File(fileName + ".csv"))) {
            StringBuilder sb = new StringBuilder();

            //각 프린트 해야하는 줄마다...
            for (ArrayList<NodePrintFormat> list : printLists) {
                pos = 0;
                // 각 노드마다...
                for (NodePrintFormat nodePrintFormat : list) {
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
        ArrayList<NodePrintFormat> printList = new ArrayList<>();
        iterNode(test.getHead(), printList);

        try (PrintWriter writer = new PrintWriter(new File(fileName + ".csv"))) {
            StringBuilder sb = new StringBuilder();
            for (ArrayList<NodePrintFormat> list : printLists) {
                for (NodePrintFormat nodePrintFormat : list) {
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

    private static void iterNode(Node node, ArrayList<NodePrintFormat> printList) {
        if (node.getO().getNode() != null) {
            ArrayList<NodePrintFormat> printListO = (ArrayList<NodePrintFormat>) printList.clone();
            printListO.add(new NodePrintFormat(node, "O", null));
            iterNode(node.getO().getNode(), printListO);
        }

        if (node.getX().getNode() != null) {
            ArrayList<NodePrintFormat> printListX = (ArrayList<NodePrintFormat>) printList.clone();
            printListX.add(new NodePrintFormat(node, "X", null));
            iterNode(node.getX().getNode(), printListX);
        }

        if (node.getP().getNode() != null && !node.getIsXPCombined()) {
            ArrayList<NodePrintFormat> printListP = (ArrayList<NodePrintFormat>) printList.clone();
            printListP.add(new NodePrintFormat(node, "P", null));
            iterNode(node.getP().getNode(), printListP);
        }

        if (node.getO().getNode() == null) {
            ArrayList<NodePrintFormat> printListO = (ArrayList<NodePrintFormat>) printList.clone();
            printListO.add(new NodePrintFormat(node, "O", node.getO().getNextTest()));
            printLists.add(printListO);
        }

        if (node.getX().getNode() == null) {
            ArrayList<NodePrintFormat> printListX = (ArrayList<NodePrintFormat>) printList.clone();
            printListX.add(new NodePrintFormat(node, "X", node.getX().getNextTest()));
            printLists.add(printListX);
        }

        if (node.getP().getNode() == null && !node.getIsXPCombined()) {
            ArrayList<NodePrintFormat> printListP = (ArrayList<NodePrintFormat>) printList.clone();
            printListP.add(new NodePrintFormat(node, "P", node.getP().getNextTest()));
            printLists.add(printListP);
        }
    }
}
