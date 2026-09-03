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

    // Delete operations
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Deleted " + head.data);
        head = head.next;
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            System.out.println("Deleted " + head.data);
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("Deleted " + current.data);
        current.next = null;
    }

    void deleteAtPosition(int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (position == 1) {
            deleteAtBeginning();
            return;
        }
        Node current = head;
        for (int i = 1; i < position && current.next != null; i++) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Position out of bound!");
            return;
        }
        System.out.println("Deleted " + current.next.data);
        current.next = current.next.next;
    }

    void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == value) {
            deleteAtBeginning();
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Value " + value + " not found.");
            return;
        }
        System.out.println("Deleted " + current.next.data);
        current.next = current.next.next;
    }

    // Update operation
    void updateAtPosition(int position, int newData) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bound!");
            return;
        }
        int oldData = current.data;
        current.data = newData;
        System.out.println("Updated " + oldData + " to " + newData + " at position " + position);
    }

    void updateByValue(int oldValue, int newValue) {
        Node current = head;
        while (current != null && current.data != oldValue) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Value " + oldValue + " not found!");
            return;
        }
        current.data = newValue;
        System.out.println("Updated " + oldValue + " to " + newValue);
    }

    // Read/ Search operation
    void searchByValue(int value) {
        Node current = head;
        int position = 1;
        while (current != null && current.data != value) {
            current = current.next;
            position++;
        }
        if (current == null) {
            System.out.println("Value " + value + " not found!");
        } else {
            System.out.println("Value " + value + " found at position " + position);
        }
    }

    void searchByPosition(int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bound!");
        } else {
            System.out.println("Data at position " + position + " is " + current.data);
        }
    }

    // Utility Operations
    void printList() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        Node current = head;
        System.out.print("Linked List:- ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void getLength() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Length: " + count);
    }

    void isEmpty() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println("List is not empty.");
        }
    }

    public static void main(String args[]) {

    }
}
