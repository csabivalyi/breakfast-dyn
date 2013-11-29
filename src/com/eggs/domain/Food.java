package com.eggs.domain;

public class Food implements Comparable<Food>{

    private String id;
    private String name;
    private float price;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Food [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    @Override
    public int compareTo(Food o) {
        if(this.equals(o)) return 0;
        else return this.id.compareTo(o.id);
    }
}
