package mainPackage;

import mainPackage.v1.AppV1;
import mainPackage.v1.domain.Node;

import java.util.HashMap;


public class App {
    public static HashMap<String, Node> nodeMap = new HashMap<>();
    public static void main(String[] args) {
        AppV1.execV1();
    }

    private static void execV2() {


    }


}