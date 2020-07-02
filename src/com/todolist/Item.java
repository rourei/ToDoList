package com.todolist;

// 'this' in getter / setter methods is only necessary, when an argument has the same name
// as a field in order to distinguish them.

public class Item {
    // Members
    private String title;
    private boolean done;

    // Constructor
    public Item(String title_in){
        this.title = title_in;
        this.done = false;
    }

    // Getter to retrieve members
    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

    // Setter to change done state
    public void toggleDone() {
        done = !done;
    }

    // Printing members
    public void printInformation(){
        System.out.println(title + " | Done: " + done);
    }
}
