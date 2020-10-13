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
public class arrayqueue<E> implements queue<E> {
    
    private E[] elements; // initialization of array generic E element
    private int front; // initialization of the front of the queue
    private int size; // initialization of the size of the queue
    private int capacity; // initialization of the capacity of the queue
    
     
    public arrayqueue(){
        capacity = 10; // initialization of capacity of the array
        elements = (E[]) new Object[capacity];  // instantation of array in generic form.
    }
    
    public arrayqueue(int capacity){
        this.capacity = capacity;
      elements = (E[]) new Object[capacity]; // for customizing the size or the capacity of the queue
    }
    
    @Override
    public E first() {
            return elements[front]; // checking the front of the queue
    }
     
    @Override
    public int size() {
        return size;      // checking the size of the queue
    }

    @Override
    public boolean isEmpty() {
        return size == 0;       // checking the queue if it's empty or not
    }

    @Override
    public void enqueue(E element) throws FullQueueException { // syntax for storing data in the queue
        if(size == capacity){
            throw new FullQueueException("Queue is Full! You cannot add data anymore!");   // condition if the size is met the capacity
        }                                                      // then it cannot add anymore 
        
        int avail = (front + size) % capacity;
        elements[avail]= element;                   // formula for pushing data from one to another in order
        size++;                                     // to store or input a data
    }

    @Override
    public E dequeue() {        // syntax for removing data in the queue
        if(isEmpty()){
           throw new FullQueueException("Queue is Empty! Theres nothing to be removed anymore!");  // condition if the size is empty        
        }                                                                                           // then there is nothing to be removed anymore
        
        E temp = elements[front];
        elements[front]=null;               // formula for pushing data from one to another in order
        front = (front + 1)% capacity;      // to store or input a data
        size--;
        return temp;
    }
    
}
