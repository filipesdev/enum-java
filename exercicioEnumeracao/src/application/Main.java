package application;

import entities.Order;
import enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED; // OrderStatus os1 sempre vai ser DELIVERED, nunca vai mudar o seu valor.

        OrderStatus os2 = OrderStatus.valueOf("PROCESSING"); //  OrderStatus.valueOf("DELIVERED"); poderia usar  diversos valores vindo do Front-End por exemplo.

        System.out.println(os1);
        System.out.println(os2);
    }
}