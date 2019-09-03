import node.DoubleVisitor;
import node.Node;
import node.PrintVisitor;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);
        Node child = new Node(25);
        child.setRight(new Node(12));
        child.setLeft(new Node(19));

        root.setLeft(child);
        root.setRight(new Node(34));
        root.setValue(3);

        PrintVisitor n = new PrintVisitor();
        root.accessPreOrder(n);
//        root.accessInOrder(n);
//        root.accessPostOrder(n);

        DoubleVisitor v = new DoubleVisitor();
        root.accessInOrder(v);
        root.accessInOrder(n);
    }

}
