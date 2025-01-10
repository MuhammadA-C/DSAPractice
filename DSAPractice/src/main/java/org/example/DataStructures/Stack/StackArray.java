package org.example.DataStructures.Stack;

public class StackArray {
    /**  */
    private int[] items;
    /** */
    private int topOfStack;

    /**
     *
     * @param size
     */
    public StackArray(int size) {
        this.items = new int[size];
        this.topOfStack = -1;
    }


    /**
     * Checks if stack is empty.
     * @return true if the stack is empty, otherwise false
     */
    public boolean isEmpty() {
        return this.topOfStack == -1;
    }

    /**
     * Checks if the stack is full.
     * @return true if the stack is full, otherwise false
     */
    public boolean isFull() {
        return this.topOfStack == this.items.length - 1;
    }

    /**
     * Adds an item to the stack.
     * @param value item to add to stack
     */
    public void push(int value) {
        if (this.items == null || isFull()) {
            throw new IllegalStateException();
        }
        this.items[++this.topOfStack] = value;
    }

    /**
     * Removes the last item from the stack.
     * @return removed item
     */
    public int pop() {
        if (this.items == null) {
            throw new IllegalStateException();
        }

        if (isEmpty()) {
            return -1;
        }
        return this.items[this.topOfStack--];
    }

    /**
     * Returns the last item on the stack without removing it.
     * @return last item
     */
    public int peek() {
        if (this.items == null) {
            throw new IllegalStateException();
        }

        if (isEmpty()) {
            return -1;
        }
        return this.items[this.topOfStack];
    }

    /**
     * Deletes the stack.
     */
    public void deleteStack() {
        this.items = null;
        this.topOfStack = -1;
    }

    /**
     * Returns the number of items in the stack.
     * @return integer representing the number of items in the stack
     */
    public int getNumberOfItems() {
        return this.topOfStack + 1;
    }

    /**
     * Outputs items in the stack (e.g. [10, 20, 30]).
     */
    public void print() {
        if (this.items == null || isEmpty()) {
            throw new IllegalStateException();
        }

        System.out.print("[");
        for (int i = 0; i < this.topOfStack + 1; i++) {
            if (i != this.topOfStack) {
                System.out.print(this.items[i] + ", ");
            } else {
                System.out.print(this.items[i]);
            }
        }
        System.out.println("]");
    }
}
