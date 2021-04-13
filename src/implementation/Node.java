package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    private E data;
    private  Node left;
    private Node right;

    public Node(E data){
        this.data = data;
        left = null;
        right = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public myinterface.Node getLeft() {
        return left;
    }


    public myinterface.Node getRight() {
        return right;
    }

    @Override
    public void setLeft(myinterface.Node left) {
        this.left = (Node) left;
    }

    @Override
    public void setRight(myinterface.Node right) {
        this.right = (Node) right;
    }

}
