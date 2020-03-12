package Adt;

public interface MyQueueAdt<E> {

    /**Inserts item at the rear of the queue. Returns true if successful; returns false if the item
    could not be inserted*/

    boolean offer(E item) ;

    /**Removes the entry at the front of the queue and returns it if the queue is not empty. If the
     queue is empty, throws a NoSuchElementException*/

    E poll() ;

    /**Removes the entry at the front of the queue and returns it; returns null if the queue is empty*/

    E remove() ;


    /**Returns the entry at the front of the queue without removing it; returns null if the queue is empty*/

    E peek() ;

    /**Returns the entry at the front of the queue without removing it. If the queue is empty,
            throws a NoSuchElementException*/

    E element();
}
