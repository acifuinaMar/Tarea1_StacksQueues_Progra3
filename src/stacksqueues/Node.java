/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacksqueues;

/**
 *
 * @author maryori
 */
public class Node {
    int data;
    Node next;
    //Constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    //Getters and setters for each parameter
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
