import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class J01SinglyLinkedList {
    Node head;

    // Insertion operation
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted " + data + " at beginning.");
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted " + data + " at end.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        System.out.println("Inserted " + data + " at end.");
    }

    void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bound!");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
        System.out.println("Inserted " + data + " at position " + position);
    }

    public static void main(String args[]) {

    }
}
