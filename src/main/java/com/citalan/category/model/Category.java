package com.citalan.category.model;

import java.util.Collection;

public class Category {


private int id;
private String name;
private Collection<Category> children;
private int totalSales;
private int totalQuantity;

// constructor
public Category(int id, String name, Collection<Category> children, int totalSales, int totalQuantity) {
this.id = id;
this.name = name;
this.children = children;
this.totalSales = totalSales;
this.totalQuantity = totalQuantity;

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Category> getChildren() {
        return children;
    }

    public void setChildren(Collection<Category> children) {
        this.children = children;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

}
