package com.restaurant;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem paste = new MenuItem("Paste:", 89.99, "Good Paste", "app");
        Menu menu = new Menu();

        menu.addItem(paste);

        MenuItem.toString();
    }

}

