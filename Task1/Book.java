package tasks.oops;

class Book {
    // Fields
    String title;
    String author;
    double price;

    // Constructor to initialize fields
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
        System.out.println("--------------------------");
    }

    // main method
    public static void main(String[] args) {
        // Creating two book objects
        Book book1 = new Book("Wings of Fire", "Dr. A.P.J. Abdul Kalam", 299.50);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 349.99);

        // Displaying their details
        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }
}

