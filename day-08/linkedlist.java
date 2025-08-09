import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    Node head = null;

    // Add new node at the end
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print all values in the linked list
    public void printValues(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            int data = sc.nextInt();
            list.add(data);
        }

        System.out.println("Linked List elements:");
        list.printValues();

        sc.close();
    }
}
