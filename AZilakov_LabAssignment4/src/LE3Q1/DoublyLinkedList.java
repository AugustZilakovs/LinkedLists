package LE3Q1;
import java.util.ArrayList;
public class DoublyLinkedList<E> {
    public static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
        public E getElement() { return element; }
        public Node<E> getPrev() { return prev; }
        public Node<E> getNext() { return next; }
        public void setPrev(Node<E> p) { prev = p; }
        public void setNext(Node<E> n) { next = n; }
    }
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;
    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer); // place just before the

    }
    public void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        // create and link a new node
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }
    public Node<E> findNode(E e){
        Node<E> z = header.getNext();//create iterator
        for(int i=1;i<=size();i++){//go through entire list
            if(e==z.getElement()){//if element matches user input, return index.
                return z;
            }
            z=z.getNext();//go to next node
        }
        return null;
    }
    @Override
    public String toString(){
        Node<E> x =header.getNext();
        ArrayList<E> temp = new ArrayList();
        for(int i = 1;i<=size();i++){
            temp.add(x.getElement());
            x=x.getNext();
        }
        return temp.toString();
    }



}
