/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuehenz;

/**
 *
 * @author Henz Montera
 * @param <E>
 */
public interface queue<E> {
    
    E first();
    int size();
    boolean isEmpty();
                                                            // use interface class when creating queue in order to isolste
    void enqueue(E element) throws FullQueueException;      // initialization from other classes
    
    E dequeue() throws FullQueueException;
    
    
}
