package com.todolist;

import java.util.ArrayList;

/* ### TO DO ###
[ ] method to toggle particular item state
[ ] method to remove individual items
[ ] adding item IDs?
*/

public class List {
    // Members
    private String name;
    private ArrayList<Item> items = new ArrayList<Item>();

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
        items.add(new Item(item_title));
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
            // Loop over array
            for (int i = 0; i < items.size(); i++) {
                items.get(i).printInformation();
            }
        }
    }
}
