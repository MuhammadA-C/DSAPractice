package org.example.DataStructures.ArrayList;

public class ArrayList {
    /** Reference to array of integers. */
    private int[] items;
    /** Tracks the actual amount of items stored in the array. */
    public int size;


    /**
     * Constructor to create an ArrayList with a specified size.
     * @param length initial length of the array
     */
    public ArrayList(int length) {
        this.items = new int[length];
        this.size = 0;
    }

    /**
     * Inserts an item at the end of the array.
     * Note: If there isn't enough space, then the array size will increase.
     *
     * @param item to insert
     */
    public void insert(int item) {
        if ((this.size + 1) < this.items.length) {
            this.items[this.size] = item;
            this.size++;
            return;
        }

        // Increase array size when there isn't enough space to insert the new item
        int[] newArray = new int[this.items.length * 2];
        for (int i = 0; i < this.items.length; i++) {
            newArray[i] = this.items[i];
        }
        this.items = newArray;

        // Add item to array
        this.items[this.size] = item;
        this.size++;
    }

    /**
     * Removes an item at a specified index.
     * @param index of the item to remove
     */
    public void removeAt(int index) {
        // Error handling for invalid index
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException();
        }

        // Removes item at last index
        if (index == (this.size - 1)) {
            this.items[index] = 0;
            this.size--;
            return;
        }

        // Removes item from array and shifts all the items from the right of the removed item to the left
        for (int i = index; i < this.size; i++) {
            if ((i + 1) == this.size) {
                this.items[i] = 0;
                break;
            }
            this.items[i] = this.items[i + 1];
        }
        this.size--;
    }

    /**
     * Obtains the index of an item if it exists.
     * @param item to find the index of
     * @return index of the item if found, or -1
     */
    public int indexOf(int item) {
        for (int i = 0; i < this.size; i++) {
            if (this.items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Checks if an item exists.
     * @param item to verify if it exists
     * @return boolean, true if it exists and false otherwise
     */
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    /**
     * Prints out the array (i.e.[2, 10, 24]).
     */
    public void print() {
        System.out.print("[");
        for (int i = 0; i < this.size; i++) {
            if ((i + 1) != this.size) {
                System.out.print(this.items[i] + ", ");
            } else {
                System.out.print(this.items[i]);
            }
        }
        System.out.print("]");
    }

    /**
     * Returns amount of space allocated for the array and not the actual amount of items stored in it.
     * @return integer representing the arrays length
     */
    public int getArrayLength() {
        return this.items.length;
    }

    /*
        Notes:
        1. Can add a method to insert an item at a specified index
        2. Can add an overridden equals() method
        3. Can add a method to remove an item (without specifying an index)
     */
}
