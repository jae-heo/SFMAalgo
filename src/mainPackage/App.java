package mainPackage;

import mainPackage.tests.*;
import mainPackage.util.NodeTracker;


public class App {
    public static void main(String[] args) {
        NodeTracker.saveCSVWithPosition(SpineTest1.getInstance(), "척추1");
        NodeTracker.saveCSVWithPosition(SpineTest2.getInstance(), "척추2");
        NodeTracker.saveCSVWithPosition(SpineTest3.getInstance(), "척추3");

        NodeTracker.saveCSVWithPosition(UpperTest1.getInstance(), "상체1");
        NodeTracker.saveCSVWithPosition(UpperTest2.getInstance(), "상체2");
    }
}

