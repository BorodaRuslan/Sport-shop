package project.entities;

public class Cap {
     String brand;
     String color;
     double price;

    public Cap(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.price = 10.0;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
