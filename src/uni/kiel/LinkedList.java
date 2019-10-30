package uni.kiel;

import java.util.Arrays;

public class LinkedList<T>{
    private int size;
    Node head, tail;

    private class Node{
        String value;
        Node next;
        Node(String value){
            this.value = value;
            this.next = null;
        }
        void addNext(Node next){
            this.next = next;
        }
    }

    public LinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addToTail(String value){
        if(head == null){
            head = new Node(value);
            tail = head;
        }else{
            tail.addNext(new Node(value));
            tail = tail.next;
        }
        size++;
    }
    public void addToHead(String value){
        if(head == null){
            head = new Node(value);
            tail = head;
        }else{
            Node newHead = new Node(value);
            newHead.addNext(head);
            head = newHead;
        }
        size++;
    }

    public void addSorted(String value){
        if(head == null){
            head = new Node(value);
            tail = head;
        }else{
            Node temp = head;
            while(temp.value.compareTo(value)<=0 || temp.next != null){
                if(temp.value.compareTo(value)<=0){
                    Node newNode = new Node(value);
                    if(temp.next == null){
                        temp.next = newNode;
                    }else{
                        temp.next.next = newNode.next;
                        temp.next = newNode;
                    }
                    break;
                }
                temp = temp.next;
            }
        }

    }
    public void printList(){
        for (Node i = head; i != null; i=i.next ) {
            System.out.println(i.value);
        }
    }
    public String[] toArray(){
        if (head == null)
            return null;
        Node n = head;
        String[] arr =new String[this.size];
        for (int i = 0; i < this.size; i++) {
            arr[i] =n.value;
            n = n.next;
        }
        return arr;
    }
    public String toString(){
        StringBuilder listString = new StringBuilder();
        listString.append('[');
        for (Node i = head; i != null; i=i.next ) {
            listString.append(i.value);
            listString.append(i.next == null? ']':',');
        }
        return listString.toString();
    }
}

