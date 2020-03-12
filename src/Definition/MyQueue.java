package Definition;

import Adt.MyQueueAdt;

import java.util.NoSuchElementException;

public class MyQueue<E> implements MyQueueAdt<E> {
    private Node<E> front;
    private Node<E> rear ;
    private int size;
    @Override
    public boolean offer(E item) {
        if(front==null)
        {
            rear= new Node<E>(item);
            front=rear;
            size++;

        }
        else
        {
            rear.next=new Node<>(item);
            rear=rear.next;
            size++;
        }
        return true;
    }

    @Override
    public E poll() {
        if(front==null)
        {
            throw  new NoSuchElementException("Queue is Empty");
        }
        else{
            E temp = front.getData();
            front = front.next;
            size--;
            return temp;
        }

    }

    @Override
    public E remove() {
        if (front==null)
        {
            return null;

        }
        else {
            E item = peek();
            front=front.getNext();
            size--;
            return item;

        }


    }

    @Override
    public E peek() {
    if(front==null)
        return null;
    else {
        return front.getData();
    }
    }

    @Override
    public E element() {
        return null;
    }
    private static class  Node<E>
    {
        private Node<E> next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public E getData() {
            return data;
        }
    }
}
