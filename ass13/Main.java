package ass13;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    private Node first;
    private Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }
    public void addAfterLast(int existingValue, int[] valuesToAdd) {
        Node current = first;
        Node lastNode = null;

        while (current != null) {
            if (current.data == existingValue) {
                lastNode = current;
            }
            current = current.next;
        }
        if (lastNode != null) {
            for (int value : valuesToAdd) {
                Node newNode = new Node(value);
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
    }

    public void display() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
    public class Main {
        public static void main(String[] args) {
            LinkedList linkedList=new LinkedList();
//Adding elements to the linkedList
            linkedList.addFirst(5);
            linkedList.addLast(10);
            linkedList.addLast(15);
            linkedList.addLast(10);
//Adding values after the last occurence of 10
            int[] valuesToAdd={20,25,30};
            linkedList.addAfterLast(10,valuesToAdd);
 //Displaying the elements of linkedList
            linkedList.display();
        }
    }

