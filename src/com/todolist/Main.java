package com.todolist;

public class Main {

    // Main method is entry point for program (same as in C++)
    public static void main(String[] args) {

        // ############ Inform user about current program stage ############
        System.out.println("### ITEM TEST ###");

        // Create new item and print members to console using getter methods
	    Item it = new Item("Learn Java");
        System.out.println("Item title by getter: " + it.getTitle());
        System.out.println("Item state by getter: " + it.isDone());

	    // Toggle state and print members using formatted class method
        it.toggleDone();
        it.printInformation();

        // ############ Inform user about current program stage ############
        System.out.println("\n### LIST TEST ###");

        // Create new to-do list instance and print name using getter method
        List l = new List("Wednesday");
        System.out.println("List name by getter: " + l.getName());

        // Add some to-dos and print list content to console
        l.addToDo("Shopping");
        l.addToDo("Work out");
        l.addToDo("Repair car");
        l.printItems();

        // Remove one of the items and output result
        System.out.println(); // Blank line for better readability
        l.removeItem(1);
        l.printItems();

        // Add another item
        l.addToDo("Laundry");

        // Toggle one of the items and output result
        System.out.println(); // Blank line for better readability
        l.toggleItem(2);
        l.printItems();

        // Empty list and print contents again
        System.out.println(); // Blank line for better readability
        l.empty();
        l.printItems();
    }
}
