package com.todolist;

import java.util.HashMap;

/* ### TO DO ###
[ ] method to toggle particular item state
[ ] method to remove individual items
[x] adding item IDs?
*/

public class List {
    // Members
    private String name;
    private HashMap<Integer, Item> items = new HashMap<Integer, Item>();
    private static int id_counter = 1;

    // Constructor
    public List(String name){
        this.name = name;
    }

    // Getter to retrieve list name
    public String getName() {
        return name;
    }

    // Adding to-do items
    public void addToDo(String item_title){
        // Add new item to map and increment counter
        items.put(id_counter, new Item(item_title));
        id_counter++;
    }

    // Empty entire list
    public void empty(){
        items.clear();
    }

    // Output all items in array
    public void printItems(){

        // Output list name first
        System.out.println("List name: " + name);

        if (items.isEmpty()){
            System.out.println("No items.");
        }
        else {
            // Loop over map keys
            for (Integer i: items.keySet()) {
                System.out.print(i + ": ");
                items.get(i).printInformation();
            }
        }
    }
}
