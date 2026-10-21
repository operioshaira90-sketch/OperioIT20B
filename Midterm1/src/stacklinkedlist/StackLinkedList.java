/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacklinkedlist;

/**
 *
 * @author ASUS
 */
public class StackLinkedList {
    //Node class
    private class Node{
        int data;
        Node next;
        
        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
//Top of the Stack
    private Node top;
    
//constructor
    public StackLinkedList(){
        top = null;
    }
    //Push element into stack
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into the stack.");
    }
    
    //Remove element
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    public  int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
        }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.println("Stack elements: ");
        
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
        public boolean isEmpty(){
            return top == null;
        }
        public static void main(String[] args) {
            StackLinkedList stack = new StackLinkedList();
                stack.push(10);
                stack.push(20);
                stack.push(30);
                stack.push(40);
                
            System.out.println();   
            
            //display stack
            stack.display();
            
            //view top elements
            System.out.println("Top element: " + stack.peek());
            
            //remove an element;
            System.out.println("Removed: " + stack.pop());
            
            //view top element
            System.out.println("Top Element: " + stack.peek());
            
            stack.display();
    }

}