package com.company;
public class MyLinkedList <T> {
    private Node<T> head;
    private Node<T> tail; // class mylinledlist like in the lecture
    private int size;
    public MyLinkedList(){

    }
    public void add(T item, int index) {
       if( index<0 || index>size){
               throw new IndexOutOfBoundsException("" + index);
        }
        Node <T>  curr= head;
        Node<T> prev=null;
        int i=0;
        while(curr !=null && i!=index){
            prev=curr;
            curr=curr.next;
            i++;
        }
        Node <T> newNode= new Node<>(item);
        if(prev==null){
            newNode.next=head;
            head=newNode;
        } else{
            prev.next=newNode;
            newNode.next=curr;
        }
        size++;
    }


public T remove(int index) {
    T removed;
    if (index == 0) {
        removed = head.data;
        head = head.next;
    } else {
        Node<T> curr = head;
        for (int i = 0; i < index - 1; i++) { // stop 1 before index
            curr = curr.next;
        }
        removed =curr.next.data;
        curr.next = curr.next.next;
    }
    size--;
    return removed;
}
    public int find(T keyitem) { //it returns index
        int index = 0;
        Node<T> current = head;
        while (current != null) {
            if (current.data == keyitem) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
public T get ( int index){
        Node<T> current =head;
        for( int i=0; i<index; i++){
            current =current.next;
        }
        return current.data;
}
    public int getSize() {
        return size;
    }
    public void reverse()
    {
        Node <T> prev = null;
        Node <T> current = head;
        Node <T> Next = null;
        while (current != null)
        {
            Next = current.next;
            current.next = prev; // changeing 2 - 3 to  2 <- 3
            prev= current;
            current = Next; //current equals to next
        }
        head = prev;
    }
private static class Node<E> {
            E data;
            Node<E> next;

            Node( E data){
                this.data=data;
        }
    }
}

