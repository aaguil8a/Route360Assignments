package com.citalan.category.model;

public class CategoryApplication{
    public static void main(String[] args) {
        //The main method creates an instance of Catalog and calls the buildCategories method on it
        Catalog catalog = new Catalog();
        catalog.buildCategories(null);
       
    }
}