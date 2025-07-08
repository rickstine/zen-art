// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class
public class LinkedListStack {
    private Node top;

    // Constructor
    public LinkedListStack() {
        top = null;
    }

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty check
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.display(); // Output: 300 200 100

        System.out.println("Top: " + stack.peek()); // Output: 300

        stack.pop();
        stack.display(); // Output: 200 100
    }
}
