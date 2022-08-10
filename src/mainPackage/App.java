package mainPackage;

import mainPackage.domain.Node;
import mainPackage.util.NodeTracker;
import mainPackage.v1.tests.*;

import java.util.HashMap;


public class App {
    public static HashMap<String, Node> nodeMap = new HashMap<>();
    public static void main(String[] args) {
        execV1();

        execV2();
    }

    private static void execV2() {


    }

    private static void execV1() {
        NodeTracker.saveCSVWithPosition(SpineTest1.getInstance(), "SpineTest1");
        NodeTracker.saveCSVWithPosition(SpineTest2.getInstance(), "SpineTest2");
        NodeTracker.saveCSVWithPosition(SpineTest3.getInstance(), "SpineTest3");

        NodeTracker.saveCSVWithPosition(UpperTest1.getInstance(), "UpperTest1");
        NodeTracker.saveCSVWithPosition(UpperTest2.getInstance(), "UpperTest2");

        NodeTracker.saveCSVWithPosition(MultiExtension1.getInstance(), "MultiExtension1");
        NodeTracker.saveCSVWithPosition(MultiExtension2.getInstance(), "MultiExtension2");
        NodeTracker.saveCSVWithPosition(MultiExtension3.getInstance(), "MultiExtension3");

        NodeTracker.saveCSVWithPosition(MultiFlexionTest.getInstance(), "MultiFlexionTest");

        NodeTracker.saveCSVWithPosition(MultiRotationTest1.getInstance(), "MultiRotationTest1");
        NodeTracker.saveCSVWithPosition(MultiRotationTest2.getInstance(), "MultiRotationTest2");
        NodeTracker.saveCSVWithPosition(MultiRotationTest3.getInstance(), "MultiRotationTest3");
        NodeTracker.saveCSVWithPosition(MultiRotationTest4.getInstance(), "MultiRotationTest4");
        NodeTracker.saveCSVWithPosition(MultiRotationTest5.getInstance(), "MultiRotationTest5");

        NodeTracker.saveCSVWithPosition(OneLegTest1.getInstance(), "OneLegTest1");
        NodeTracker.saveCSVWithPosition(OneLegTest2.getInstance(), "OneLegTest2");

        NodeTracker.saveCSVWithPosition(OverheadSquatTest.getInstance(), "OverheadSquatTest");
    }
}