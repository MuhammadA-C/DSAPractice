package org.example.DataStructures.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    /**
     * Node class to create the nodes for the Linked List that contain the item value and pointer to next item in the list.
     */
    private class Node {
        /** Holds the value for the item. */
        public int value;
        /** Points to the next item. */
        public Node next;
    }

    /** Reference to the first node in the linked list. */
    public Node head;
    /** Reference to the last node in the linked list. */
    public Node tail;
    /** Reference to the size of the linked list. */
    public int size;


    /**
     * Creates Linked List if it doesn't exist.
     * @param value to add
     */
    public void createLinkedList(int value) {
        // Error handling if the Linked List already exists
        if (this.head != null) {
            return;
        }

        this.head = new Node();
        this.head.value = value;
        this.head.next = null;
        this.tail = this.head;
        this.size++;
    }

    /**
     * Adds an item (node) to the start.
     * @param value to add
     */
    public void addFirst(int value) {
        /*
            Note: Technically, this shouldn't be possible as long as we don't have a constructor with 0 args &
            that doesn't create a Linked List.
         */
        if (this.head == null) {
            createLinkedList(value);
            return;
        }

        Node node = new Node();
        node.value = value;
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    /**
     * Adds an item (node) to the end.
     * @param value to add
     */
    public void addLast(int value) {
        /*
            Note: Technically, this shouldn't be possible as long as we don't have a constructor with 0 args &
            that doesn't create a Linked List.
         */
        if (this.head == null) {
            createLinkedList(value);
            return;
        }

        Node node = new Node();
        node.value = value;
        node.next = null;

        // Replace tail node
        this.tail.next = node;
        this.tail = node;

        this.size++;
    }

    /**
     * Deletes the first item (node).
     */
    public void deleteFirst() {
        // Error handling if the Linked List doesn't exist
        if (this.head == null) {
            throw new NoSuchElementException();
        }

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
            return;
        }

        Node tempNode = this.head.next;
        this.head.next = null;
        this.head = tempNode;
        this.size--;
    }

    /**
     * Deletes the last item (node).
     */
    public void deleteLast() {
        // Error handling if the Linked List doesn't exist
        if (this.head == null) {
            throw new NoSuchElementException();
        }

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
            return;
        }

        Node tempNode = this.head;
        for (int i = 1; i < this.size - 1; i++) {
            tempNode = tempNode.next;
        }

        tempNode.next = null;
        this.tail = tempNode;
        this.size--;
    }

    /**
     * Checks if an item exists.
     * @param value to verify if it exists
     * @return boolean, true if exists and false otherwise
     */
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    /**
     * Obtains the index of a value.
     * @param value to obtain index
     * @return index of the value if it exists, otherwise -1
     */
    public int indexOf(int value) {
        Node tempNode = this.head;
        for (int i = 0; i < this.size; i ++) {
            if (tempNode.value == value) {
                return i;
            }
            tempNode = tempNode.next;
        }
        return -1;
    }
}
