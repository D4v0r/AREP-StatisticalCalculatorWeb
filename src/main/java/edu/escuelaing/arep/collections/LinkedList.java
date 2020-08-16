package edu.escuelaing.arep.collections;


import java.util.NoSuchElementException;
import java.lang.Iterable;
import java.util.Iterator;


/**
 * Generic class representing a simple linked list of type N.
 * @param <N> the type parameter
 *
 * @author Davor Cortés
 * @version 1.0
 */
public class LinkedList<N> implements Iterable<N>{

    private Node<N> head, tail;
    private int length;

    /**
     * Instantiates a new Linked list.
     */
    public LinkedList(){
        head = tail = null;
        length = 0;
    }

    /**
     * Size int.
     *
     * @return the int
     */
    public int size(){
        return length;
    }

    /**
     * Add new Node whit data.
     *
     * @param data the data
     */
    public void add(N data){
        Node<N> newNode = new Node<N>(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.setNext(newNode);
        tail = newNode;
        length ++;
    }


    /**
     * Remove the first element and return its value.
     *
     * @return the first element.
     * @throws NoSuchElementException the no such element exception
     */
    public N pop() throws NoSuchElementException{

        if (head == null ) throw new NoSuchElementException("void");
        Node<N> currentHead = head;
        head = head.getNext();
        length --;
        return currentHead.getData();
    }

    /**
     * Remove first element.
     *
     * @throws NoSuchElementException the no such element exception
     */
    public void remove() throws  NoSuchElementException{
        pop();
    }

    public Iterator<N> iterator() {
        return new Iterator<N>() {
            private Node<N> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public N next() {
                N data = currentNode.getData();
                currentNode = currentNode.getNext();
                return data;
            }
        };
    }

}
