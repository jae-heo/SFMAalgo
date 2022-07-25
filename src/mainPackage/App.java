package mainPackage;

import mainPackage.tests.UpperTest1;
import mainPackage.util.NodeTracker;


public class App {
    public static void main(String[] args) {
//        NodeTracker.saveCSVWithPosition(UpperTest1.getInstance(), "상지패턴1 자리맞춤");
//        NodeTracker.saveCSVWithPosition(UpperTest2.getInstance(), "상지패턴2 자리맞춤");
//        NodeTracker.saveCSVWithPosition(MultiFlexionTest.getInstance(), "다중분절굴곡 자리맞춤");
//        NodeTracker.saveCSVWithPosition(OneLegTest.getInstance(), "한다리서기 자리맞춤");
//        NodeTracker.printList(UpperTest1.getInstance());

        NodeTracker.saveCSVWithoutPosition(UpperTest1.getInstance(), "바보맨");
        NodeTracker.saveCSVWithPosition(UpperTest1.getInstance(), "바보맨2");
    }
}

