package mynode.lec4;

/**
 * Created by Serg on 22.01.2017.
 */
public class Node {
    int number;
    Node node;

    public Node(int number,Node node){
        this.number=number;
        this.node=node;
    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                ", node=" + node +
                '}';
    }
}
