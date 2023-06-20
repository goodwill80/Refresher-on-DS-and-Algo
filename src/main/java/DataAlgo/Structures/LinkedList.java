package DataAlgo.Structures;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // Node class
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }

        public int getNode() {
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    // Constructor
    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    // Methods
    // a. Append a new value
    public void append(int value) {
        Node newNode = new Node(value);
        if(this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length ++;
    }

    // b.Remove Last - need to define a pre and temp variables
    public Node removeLast() {
        if(this.length == 0) return null;
        Node temp = head; // always one step ahead of pre
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        this.length --;
        if(this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    // c. Prepend - insert at the front
    public void prepend(int value) {
        Node newNode = new Node(value);
        if(this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    // d. Remove First
    public Node removeFirst() {
        if(this.length == 0) return null;
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        length --;
        if(length == 0) {
            this.tail = null;
        }
        return temp;
    }

    // e. Get an item by index
    public Node get(int index) {
        if(index < 0 || index >= this.length) {
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // f. Set an item at a particular index
    public boolean set(int index, int value) {
        Node temp = this.get(index);
        if(temp != null) {
            temp.setValue(value);
            return true;
        }
        return false;
    }

    // g. Inset a new node at a particular index
    public boolean insert(int index, int value) {
        if(index < 0 || index > this.length) return false;
        if(index == 0) {
            this.prepend(value);
            return true;
        }
        if(index == length) {
            this.append(value);
            return true;
        }

      Node newNode = new Node(value);
      Node temp = this.get(index - 1);
      newNode.next = temp.next;
      temp.next = newNode;
      this.length ++;
      return true;
    }

    // h. Remove an item at particular index
    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == this.length - 1) return removeLast();

        Node prev = this.get(index-1);
        Node temp = prev.next; // This is the item in the particular index

        prev.next = temp.next;
        temp.next = null;
        this.length --;
        return temp;
    }

    // i. Reverse a linked list
    public void reverse() {
        // Reverse the head and tail
        // Then flip the arrows the other way
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        // Define other nodes of before temp and after temp
        Node after = temp.next;
        Node before = null;

        // Reverse the arrows using a for loop
        for(int i = 0; i < this.length; i++) {
            after = temp.next;
            temp.next = before; // This flips the head to opposite direction
            before = temp; // move one step up
            temp = after; // move one step up
        }
    }


    // Print
    public void printList() {
        Node temp = this.head;
        while(temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
    }

    //Getters
    public void getHead() {
        System.out.println("Head: " + this.head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + this.tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }


}
