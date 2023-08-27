package project.entities;

public class TShirt {
    private final String brand;
    private final String color;
    private final double price;

    public TShirt(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.price = 12.0;
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
