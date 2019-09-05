package com.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private LocalDate lastUpdated;

    public Menu(){
        this.menuItems = new ArrayList<>();
    }

//    public ArrayList<MenuItem> getMenuItem() {
//        return menuItems;
//    }
//
//    public void setMenuItem(ArrayList<MenuItem> menuItems) {
//        this.menuItems = menuItems;
//    }

    public void addItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    public void removeItem(String name){
        for (MenuItem menuItem: menuItems){
            if(menuItem.getName().equals(name)){
                this.menuItems.remove(menuItem);
            }
        }
    }
}
