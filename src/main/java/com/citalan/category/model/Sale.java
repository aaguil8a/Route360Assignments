package com.citalan.category.model;

public class Sale {
//     Define a new model class under com.<yourlastname>.category.model called Sale with the following attributes

// productId
private int productId;

// leafCategoryId
private int leafCategoryId;

// primaryCategoryId
private int primaryCategoryId;

// amount

private int amount;

// quantity

private int quantity;

// constructor

public Sale(int productId, int leafCategoryId, int primaryCategoryId, int amount, int quantity) {
    this.productId = productId;
    this.leafCategoryId = leafCategoryId;
    this.primaryCategoryId = primaryCategoryId;
    this.amount = amount;
    this.quantity = quantity;
}

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getLeafCategoryId() {
        return leafCategoryId;
    }

    public void setLeafCategoryId(int leafCategoryId) {
        this.leafCategoryId = leafCategoryId;
    }

    public int getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    public void setPrimaryCategoryId(int primaryCategoryId) {
        this.primaryCategoryId = primaryCategoryId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
