package ecommerce.model;

public class Book extends Product {
    private String author;
    private String publisher;

    public Book(String id, String name, double price, String author, String publisher,int stockQuantity) {
        super(id, name, price,stockQuantity);
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + " | Author: " + author +
                           " | Publisher: " + publisher + " | Price: ₹" + price);
    }
}

