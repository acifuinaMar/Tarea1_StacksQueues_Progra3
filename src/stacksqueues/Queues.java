/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacksqueues;

/**
 *
 * @author maryori
 */
public class Queues {
    private Node first;
    private Node last;
    //Constructor
    public Queues(){
        this.first = null;
        this.last = null;
    }
    //Method that´ll verify if the queue is empty
    public boolean isEmpty(){
        return first == null;
    }
    //Method that´ll insert/enqueue data
    public void enqueue(int data){
        Node node = new Node(data);
        if(isEmpty()){
            first = node;
        } else{
            last.setNext(node);
        }
        last = node;
        System.out.println("Se ha insertado el dato: " + node.getData());
    }
    //Method that´ll peek the data from the top
    public void peek(){
        if(isEmpty()){
            System.out.println("Cola vacia. No hay elementos por mostrar");
        } else {
            System.out.println("En la cima se encuentra el dato: " + first.getData());
        }
    }
   //Method that will remove the node at the front of the queue (node first)
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Cola vacia. No hay elemento por mostrar.");
        } else {
            System.out.println("El primer elemento ingresado fue: " + first.getData()+ " y ha sido eliminado.");
            first = first.getNext();
            if(first == null){
                flush();
            }
        }
    }
   //Method that´ll clean the queue
    public void flush(){
        first = null;
        last = null;
    }
}
