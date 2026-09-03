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

        if (position == 1) {
            insertAtBeginning(data);
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

        Node newNode = new Node(data);
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
        System.out.println("Deleted " + current.next.data);
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
        for (int i = 1; i < position - 1 && current.next != null; i++) {
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
        for (int i = 1; i < position && current != null; i++) {
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
        for (int i = 1; i < position && current != null; i++) {
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

    void clear() {
        head = null;
        System.out.println("List cleared.");
    }

    void getFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("First element: " + head.data);
    }

    void getLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println("Last element: " + current.data);
    }

    void displayMenu() {
        System.out.println("\n========== SINGLY LINKED LIST MENU ==========");
        System.out.println("1. Insert at Beginning");
        System.out.println("2. Insert at End");
        System.out.println("3. Insert at Position");
        System.out.println("4. Delete at Beginning");
        System.out.println("5. Delete at End");
        System.out.println("6. Delete at Position");
        System.out.println("7. Delete by Value");
        System.out.println("8. Update at Position");
        System.out.println("9. Update by Value");
        System.out.println("10. Search by Value");
        System.out.println("11. Search by Position");
        System.out.println("12. Display List");
        System.out.println("13. Get Length");
        System.out.println("14. Check if Empty");
        System.out.println("15. Get First Element");
        System.out.println("16. Get Last Element");
        System.out.println("17. Clear List");
        System.out.println("0. Exit");
    }

    public static void main(String args[]) {
        J01SinglyLinkedList list = new J01SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        int choice, data, position, oldValue, newValue;

        do {
            list.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    list.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    list.insertAtPosition(data, position);
                    break;
                case 4:
                    list.deleteAtBeginning();
                    break;
                case 5:
                    list.deleteAtEnd();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 7:
                    System.out.print("Enter value to delete: ");
                    data = scanner.nextInt();
                    list.deleteByValue(data);
                    break;
                case 8:
                    System.out.print("Enter new data: ");
                    newValue = scanner.nextInt();
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    list.updateAtPosition(position, newValue);
                    break;
                case 9:
                    System.out.print("Enter old value: ");
                    oldValue = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    newValue = scanner.nextInt();
                    list.updateByValue(oldValue, newValue);
                    break;
                case 10:
                    System.out.print("Enter value to search: ");
                    data = scanner.nextInt();
                    list.searchByValue(data);
                    break;
                case 11:
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    list.searchByPosition(position);
                    break;
                case 12:
                    list.printList();
                    break;
                case 13:
                    list.getLength();
                    break;
                case 14:
                    list.isEmpty();
                    break;
                case 15:
                    list.getFirst();
                    break;
                case 16:
                    list.getLast();
                    break;
                case 17:
                    list.clear();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
