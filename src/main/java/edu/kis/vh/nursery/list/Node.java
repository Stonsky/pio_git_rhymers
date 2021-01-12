package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }


    public edu.kis.vh.nursery.list.Node getPrev() {
        return prev;
    }

    public void setPrev(edu.kis.vh.nursery.list.Node prev) {
        this.prev = prev;
    }

    public edu.kis.vh.nursery.list.Node getNext() {
        return next;
    }

    public void setNext(edu.kis.vh.nursery.list.Node next) {
        this.next = next;
    }
}
