package ecommerce.model;

public class Furniture extends Product 
{
    private String material;
    private String dimensions;

    public Furniture(String id, String name, double price, String material, String dimensions,int stockQuantity) 
    {
        super(id, name, price,stockQuantity);
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public void displayDetails() 
    {
        System.out.println("Furniture: " + name + " | Material: " + material +
                           " | Dimensions: " + dimensions + " | Price: ₹" + price);
    }
}

