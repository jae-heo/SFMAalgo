package mainPackage;

import mainPackage.domain.Node;
import mainPackage.tests.*;
import mainPackage.util.NodeTracker;

import java.util.HashMap;


public class App {
    public static HashMap<String, Node> nodeMap = new HashMap<>();
    public static void main(String[] args) {



        NodeTracker.saveCSVWithPosition(SpineTest1.getInstance(), "척추1");
        NodeTracker.saveCSVWithPosition(SpineTest2.getInstance(), "척추2");
        NodeTracker.saveCSVWithPosition(SpineTest3.getInstance(), "척추3");

        NodeTracker.saveCSVWithPosition(UpperTest1.getInstance(), "상체1");
        NodeTracker.saveCSVWithPosition(UpperTest2.getInstance(), "상체2");

        NodeTracker.saveCSVWithPosition(MultiExtension1.getInstance(), "복수신전1");
        NodeTracker.saveCSVWithPosition(MultiExtension2.getInstance(), "복수신전2");
        NodeTracker.saveCSVWithPosition(MultiExtension3.getInstance(), "복수신전3");

        NodeTracker.saveCSVWithPosition(MultiFlexionTest.getInstance(), "복수굴곡");

        NodeTracker.saveCSVWithPosition(MultiRotationTest1.getInstance(), "복수회전1");
        NodeTracker.saveCSVWithPosition(MultiRotationTest2.getInstance(), "복수회전2");
        NodeTracker.saveCSVWithPosition(MultiRotationTest3.getInstance(), "복수회전3");
        NodeTracker.saveCSVWithPosition(MultiRotationTest4.getInstance(), "복수회전4");
        NodeTracker.saveCSVWithPosition(MultiRotationTest5.getInstance(), "복수회전5");

        NodeTracker.saveCSVWithPosition(OneLegTest1.getInstance(), "한다리1");
        NodeTracker.saveCSVWithPosition(OneLegTest2.getInstance(), "한다리2");

        NodeTracker.saveCSVWithPosition(OverheadSquatTest.getInstance(), "오버헤드");
    }
}

