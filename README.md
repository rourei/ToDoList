## ToDoList

A command line based to-do list application using Java SE 11.
This application is developed under Ubuntu 18.04.4 LTS using IntelliJ IDEA 2020.1.2 (Community Edition).

Its main purpose is to serve as a personal playground for familiarizing myself with Java.

## General information
A to-do list can have multiple items in it that have an individual ID assigned on generation. It provides general access methods to add, remove and modify items.

## Classes
- **Main**: Contains the `main` method and provides examples for the usage of the other classes 
- **Item**: The basic to-do item class.
  - provides getter and setter methods to retrieve information about the item contents
  - provides additional print method to output the class members in the format
    > `title + " | Done: " + done_state`
- **List**: The basic to-do list class.
  - has a `name` member as well as a `HashMap` to store items with an assigned ID
  - provides methods to add new items to the list, remove or toggle items by ID and clear the entire list
  - additionally, a formatted output method is provided that prints the list name and all contained items to the console
  - basic error handling includes checking for the existence of an item by ID before modifying it