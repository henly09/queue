/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuehenz;

/**
 *
 * @author Henz Montera
 */
public class FullQueueException extends IllegalStateException {
    public FullQueueException(String msg){                  // syntax for creating error message 
        super(msg);
    }
}
