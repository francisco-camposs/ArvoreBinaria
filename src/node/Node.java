package node;

public class Node {
    private Integer value;
    private Node left;
    private Node right;

    public Node() {
    }

    public Node(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void accessPreOrder(NodeVisitor visitor){
        visitor.visit(this);

        if (null != left) {
            this.left.accessPreOrder(visitor);
        }

        if (right != null) {
            this.right.accessPreOrder(visitor);
        }
    }

    public void accessInOrder(NodeVisitor visitor){
        if (left != null) {
            this.left.accessPreOrder(visitor);
        }

        visitor.visit(this);

        if (right != null) {
            this.right.accessPreOrder(visitor);
        }
    }

    public void accessPostOrder(NodeVisitor visitor){
        if (left != null) {
            this.left.accessPreOrder(visitor);
        }
        if (right != null) {
            this.right.accessPreOrder(visitor);
        }
        visitor.visit(this);
    }


}
