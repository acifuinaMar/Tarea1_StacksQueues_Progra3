/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacksqueues;

/**
 *
 * @author maryori
 */
public class Stacks {
    private Node top;
    //Constructor
    public Stacks(){
        this.top = null;
    }
    //Method that´ll verify if the stack is empty
    public boolean isEmpty(){
        return top == null;
    }
    //Method that´ll insert data into the stack
    public void push(int data){
        Node node = new Node(data);
        if(isEmpty()) {
            top = node;
            System.out.println("Se ha insertado el dato: " + top.getData());
        } else {
            node.setNext(top);
            top = node;
            System.out.println("Se ha insertado el dato: " + top.getData());
        }
    }
    //Method to get data from the top
    public void peek(){
        if(isEmpty()){
            System.out.println("La lista esta vacia. No hay un elemento en la cima");
        } else {
            System.out.println("En la cima de la pila encontramos el dato: " + top.getData());
        }
    }
    //Method to eliminate the element on the top
    public void pop(){
        if(isEmpty()){
            System.out.println("La lista esta vacia. No hay elemento por eliminar");
        } else {
            System.out.println("Se ha eliminado el elemento: " + top.getData());
            top = top.getNext();
        }
    }
    //Method that´ll empty the whole stack
    public void flush(){
        top = null;
    }
}
