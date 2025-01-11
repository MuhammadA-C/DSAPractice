package org.example.DataStructures.Stack;

public class StackLinkedList {
    public class Node {
        public int value;
        public Node next;
    }

    public Node head;
    public int size;

    public StackLinkedList(final int value) {
        this.head = new Node();
        this.head.value = value;
        this.head.next = null;
        this.size = 1;
    }

    /**
     * Adds an item to the stack.
     * @param value item to add to stack
     */
    public void push(final int value) {
        if (this.head == null) {
            throw new IllegalStateException();
        }

        Node insertNode = new Node();
        insertNode.value = value;
        insertNode.next = this.head;
        this.head = insertNode;
        this.size++;
    }

    /**
     * Removes the last item from the stack.
     * @return removed item
     */
    public int pop() {
        if (this.head == null) {
            return -1;
        }

        int temp = this.head.value;
        this.head = this.size == 1 ? null : this.head.next;
        this.size--;
        return temp;
    }

    /**
     * Returns the last item on the stack without removing it.
     * @return last item
     */
    public int peek() {
        if (this.head == null) {
            return -1;
        }
        return this.head.value;
    }
    
    /**
     * Outputs items in the stack (e.g. [10 -> 20 -> 30]).
     */
    public void print() {
        if (this.head == null) {
            throw new IllegalStateException();
        }

        System.out.print("[");
        Node tempNode = this.head;
        for (int i = 0; i < this.size; i++) {
            if (i + 1 != this.size) {
                System.out.print(tempNode.value + " -> ");
            } else {
                System.out.print(tempNode.value);
            }
            tempNode = tempNode.next;
        }
        System.out.println("]");
    }
}
