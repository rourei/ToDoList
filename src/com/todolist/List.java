package com.todolist;

import java.util.HashMap;

/* ### TO DO ###
[x] method to toggle particular item state
[x] method to remove individual items
[x] adding item IDs?
[x] check item existence before toggling / removing
*/

public class List {
    // Members
    private String name;
    private HashMap<Integer, Item> items = new HashMap<Integer, Item>();
    private int id_counter = 1;

    // Constructor
    public List(String name){
        this.name = name;
    }

    // Getter to retrieve list name
    public String getName() {
        return name;
    }

    // Adding to-do items
    public void addItem(String item_title){
        // Add new item to map and increment counter
        items.put(id_counter, new Item(item_title));
        id_counter++;
    }

    // Empty entire list
    public void empty(){
        items.clear();
        // Reset ID counter
        id_counter = 1;
    }

    // Toggle item state by ID
    public void toggleItem(int id){
        // Check existence of requested item id
        if (items.containsKey(id)) {
            // Update state of requested item
            items.get(id).toggleDone();
        }
        else {
            System.out.println("Could not toggle item state. Requested item does not exist.");
        }
    }

    // Remove item by ID
    public void removeItem(int id){
        // Check existence of requested item id
        if (items.containsKey(id)) {
            // Remove requested item
            items.remove(id);
        }
        else {
            System.out.println("Could not remove item. Requested item does not exist.");
        }
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
