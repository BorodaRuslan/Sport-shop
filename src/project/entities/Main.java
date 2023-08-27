package project.entities;

import project.entities.builder.OrderBuilder;

public class Main {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        String orderA = orderBuilder.buildOrderA();
        String orderB = orderBuilder.buildOrderB();

        printOrder(orderA);
        printOrder(orderB);

    }
    public static void printOrder(String order){
        System.out.println(order);
    }
}
