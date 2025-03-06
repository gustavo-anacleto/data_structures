package org.gustavo.linkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public LinkedList(T value) {
        Node<T> newNode = new Node<>(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printLinkedList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    public void append(T value){
        Node<T> newNode = new Node<>(value);

        if (length == 0){ //Empty list case
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }

        length++;
    }

    public Node<T> removeLast(){
        if(length == 0) return null;
        Node<T> temp = head;
        Node<T> pre = head;

        while (temp.getNext() != null){
            pre = temp;
            temp = temp.getNext();
        }

        tail = pre;
        tail.setNext(null);
        length--;

        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(T value){
        Node<T> newNode = new Node<>(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head =  newNode;
        }

        length++;
    }

    public Node<T> removeFirst(){
        if(length == 0) return null;

        Node<T> temp = head;
        head = head.getNext();
        temp.setNext(null);

        length--;

        if(length == 0){
            tail = null;
        }

        return temp;
    }

    public Node<T> get(int index){
        if(index < 0 || index >= length ) return null;

        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public boolean update(int index, T value){
        Node<T> temp = get(index);
        if(temp == null) return false;

        temp.setValue(value);
        return true;
    }

    public boolean insert(int index, T value){
        if(index < 0 || index > length) return false;

        if(index == 0){
            prepend(value);
            return true;
        }

        Node<T> newNode = new Node<>(value);
        Node<T> temp = get(index - 1);

        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        length++;

        return true;
    }

    public Node<T> remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node<T> prev = get(index - 1);
        Node<T> temp = prev.getNext();

        temp.setNext(prev.getNext());
        prev.setNext(null);
        length--;

        return prev;
    }

    public void reverse(){
        Node<T> temp = head;
        head = tail;
        tail = temp;
        Node<T> before = null;
        Node<T> after;

        for (int i = 0; i < length; i++) {
            after = temp.getNext();
            temp.setNext(before);
            before = temp;
            temp = after;
        }
    }
}

