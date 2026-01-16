//Base class demonstrating abstraction in a product hierarchy
abstract class Product{
    protected String name;
    protected double price;

    //Constructor for Product class
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Method to calculate price
    public abstract double calculatePrice();
    
    //Method to display product details
    public void displayDetails(){
        System.out.println("Product Name: " + name);
    }
}

//Child classes demonstrating inheritance and method overriding
class physicalProduct extends Product{
    private double deliveryCharge;
    private String shippingAddress;

    public physicalProduct(String name, double price, double deliveryCharge, String shippingAddress){
        super(name,price);
        this.deliveryCharge= deliveryCharge;
        this.shippingAddress= shippingAddress;
    }

    //Overriding method which demonstrates polymorphism
    public double calculatePrice(){
        return price + deliveryCharge;
    }

    public void displayDetails(){
        System.out.println("Price: " + price);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Shipping Address: " + shippingAddress);
    }
}

class digitalProduct extends Product{
    public digitalProduct(String name, double price){
        super(name,price);
    }

    public double calculatePrice(){
        return price;
    }

    public void displayDetails(){
        System.out.println("Price: " + price);
    }
}

public class productHierarchy{
    public static void main(String[] args){
        Product physical=new physicalProduct("Laptop",78000.0,200.5,"Security Street, NY");
        Product digital=new digitalProduct("Digital Planner",500.0);

        physical.displayDetails();
        System.out.println("Total Price: " + physical.calculatePrice());
        System.out.println();

        digital.displayDetails();
        System.out.println("Total Price: " + digital.calculatePrice());
    }
}