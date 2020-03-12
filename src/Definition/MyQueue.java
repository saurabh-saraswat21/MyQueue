package Definition;

import Adt.MyQueueAdt;

public class MyQueue<E> implements MyQueueAdt<E> {
    @Override
    public boolean offer(E item) {
        return false;
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
}
