package Definition;

import Adt.MyQueueAdt;

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
        return null;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        return null;
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
