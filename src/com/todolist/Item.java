package com.todolist;

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
        return this.title;
    }

    public boolean isDone() {
        return this.done;
    }

    // Setter to change done state
    public void toggleDone() {
        this.done = !this.done;
    }

    // Printing members
    public void printInformation(){
        System.out.println(this.title + " | Done: " + this.done);
    }
}
