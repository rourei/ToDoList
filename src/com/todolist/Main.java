package com.todolist;

public class Main {

    // Main method is entry point for program (same as in C++)
    public static void main(String[] args) {

        // Create new item and print members to console using getter methods
	    Item it = new Item("Learn Java");
        System.out.println(it.getTitle());
        System.out.println(it.isDone());

	    // Toggle state and print members using formatted class method
        it.toggleDone();
        it.printInformation();


    }
}
