package edu.escuelaing.arep.collections;

/**
 * Generic class that represents a node. This node stores a data type N.
 * @param <N> the type parameter
 *
 * @author Davor Cortés
 * @version 1.0
 */
public class Node<N> {

    private N data;
    private Node<N> next;

    /**
     * Instantiates a new Node.
     *
     * @param data the data
     */
    public Node(N data) {
        this.data = data;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public N getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(N data) {
        this.data = data;
    }

    /**
     * Gets next node.
     *
     * @return the next node.
     */
    public Node<N> getNext() {
        return next;
    }

    /**
     * Sets next node.
     *
     * @param next the next node.
     */
    public void setNext(Node<N> next) {
        this.next = next;
    }

}
