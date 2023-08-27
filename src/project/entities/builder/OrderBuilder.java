package project.entities.builder;

import project.entities.ActiveSports;
import project.entities.Cap;
import project.entities.SmartCaps;
import project.entities.TShirt;

public class OrderBuilder {
    private final ActiveSports tshirtBuilder;
    private final SmartCaps capsBuilder;


    public OrderBuilder() {
        this.tshirtBuilder = new ActiveSports();
        this.capsBuilder = new SmartCaps();
    }

    public String buildOrderA(){
        StringBuilder stringBuilder = new StringBuilder();

        TShirt tShirt = tshirtBuilder.createTShirt("Red");
        Cap cap = capsBuilder.createCap("White");
        double totalCost = tShirt.getPrice() + cap.getPrice();

        return stringBuilder.append("OrderA")
                .append(" T-shirt: " + tShirt.getBrand())
                .append(" " + tShirt.getColor())
                .append(" Cost: " + tShirt.getPrice() + "$")
                .append(" Cap: " + cap.getBrand())
                .append(" " + cap.getColor())
                .append(" Cost: " +cap.getPrice() + "$")
                .append(" Total cost: " + totalCost + "$")
                .toString();
    }

    public String buildOrderB(){
        StringBuilder stringBuilder = new StringBuilder();
        TShirt tShirt = tshirtBuilder.createTShirt("Blue");
        Cap cap = capsBuilder.createCap("Black");
        double totalCost = tShirt.getPrice() + cap.getPrice();

        return stringBuilder.append("OrderB")
                .append(" T-shirt: " + tShirt.getBrand())
                .append(" " + tShirt.getColor())
                .append(" Cost: " + tShirt.getPrice() + "$")
                .append(" Cap: " + cap.getBrand())
                .append(" " + cap.getColor())
                .append(" Cost: " +cap.getPrice() + "$")
                .append(" Total cost: " + totalCost + "$")
                .toString();
    }


}
