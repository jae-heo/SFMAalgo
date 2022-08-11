package mainPackage.v2.tests;

import mainPackage.v2.domain.Node;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public abstract class Test {
    ArrayList<Node> nodes = new ArrayList<>();
    public Node getHead() {
        return this.nodes.get(0);
    }
    public ArrayList<String> getNameList() {
        return nodes.stream().map(Node::getName).collect(Collectors.toCollection(ArrayList::new));
    }
    public ArrayList<Node> getNodeList() {
        return nodes;
    }
    public void addNode(Node @NotNull ... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));
    }
}
