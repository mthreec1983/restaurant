package com.restaurant;

import java.time.LocalDate;

public class MenuItem {
    private LocalDate dateCreated;
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateCreated = LocalDate.now();
    }
//    public boolean isNew(isNew){
//        return this.dateCreated.isBefore(LocalDate.now().plusWeeks(1));
//    }


//    "Dog Id: " + this.getDogId() + "\nWeight: " +
//            this.getWeight() + "\nAge: " + this.getAge();

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.getName() + this.getPrice() + this.getDescription() + this.getCategory();
    }
}

