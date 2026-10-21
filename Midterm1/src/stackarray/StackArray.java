/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackarray;

/**
 *
 * @author ASUS
 */
public class StackArray {
 
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public StackArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
       
    // Push element into stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + "pushed into the stack");
        }
    }

    // Remove top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
            int value = stack[top];
            top--;
            return value;
        }

    // View top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity -1;
    }
    // Main method
    public static void main(String[] args) {

        // Create a stack with capacity of 5
        StackArray stack = new StackArray(5);

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

        // Display stack
        stack.display();

        System.out.println();

        // View top element
        System.out.println("Top element: " + stack.peek());

        System.out.println();

        // Remove an element
        System.out.println("Removed: " + stack.pop());

        System.out.println();

        // View top again
        System.out.println("Top element: " + stack.peek());

        System.out.println();

        // Display stack again
        stack.display();
    }
}
    

