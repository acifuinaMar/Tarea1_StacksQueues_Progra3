/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stacksqueues;

/**
 *
 * @author motit
 */
public class StacksQueues {
    public static void main(String[] args) {
        //Demostration of the stacks
        Stacks stacks = new Stacks();
        
        //Insert/Push elements
        stacks.push(11);
        stacks.push(10);
        stacks.push(9);
        //Peek the element on the top (9)
        stacks.peek();
        //Delete the element on the top (9)
        stacks.pop();
        //Peek the element on the top (10)
        stacks.peek();
        //Add another element
        stacks.push(8);
        //Peek the element on the top (8)
        stacks.peek();
        //Delete the element on the top (8)
        stacks.pop();
        //Peek the element on the top (10)
        stacks.peek();
        //Delete the element on the top (10)
        stacks.pop();
        //Peek the element on the top (11)
        stacks.peek();
        //Delete the element on the top (11)
        stacks.pop();
        //The stack is empty, so we let the user know
        stacks.peek();
        
        System.out.println("-------------------");
        //Demostration of the queues
        Queues queue = new Queues();
        
        //Insert/Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        //Peek the first element that got in (1)
        queue.peek();
        //Delete the first element that got in (1)
        queue.dequeue();
        //Peek the first element that got in (2)
        queue.peek();
        //Add a new element
        queue.enqueue(6);
        //Delete the first element that got in (2)
        queue.dequeue(); 
        //Peek the first element that got in (3)
        queue.peek();
        //Delete the first element that got in (3)
        queue.dequeue();
        //Peek the first element that got in (6)
        queue.peek();
        //Delete the first element that got in (6)
        queue.dequeue();
        //Since the queue is empty, we´ll let the user know
        queue.dequeue();
    }
}
