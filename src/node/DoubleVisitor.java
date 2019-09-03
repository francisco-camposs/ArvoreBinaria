package node;

public class DoubleVisitor implements  NodeVisitor{
    @Override
    public void visit(Node node) {
        node.setValue(2 * node.getValue());
    }
}
