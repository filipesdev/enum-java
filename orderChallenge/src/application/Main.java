package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Dados do cliente
        System.out.println("ENTER CLIENT DATA: ");
        System.out.print("Name: ");
        String userName = sc.nextLine();
        System.out.print("Email: ");
        String userEmail = sc.next();
        System.out.print("Birh date (DD/MM/yyyy): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(userName, userEmail, birthDate);

        System.out.println();

        // Dados do pedido
        System.out.println("ENTER ORDER DATA:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int items = sc.nextInt();

        for (int i=1; i<=items; i++) {
            System.out.println("ENTER #" + i + " ITEM DATA:" );
            System.out.print("Product name: ");
            String productName = sc.next();

            System.out.print("Product price: ");
            Double price = sc.nextDouble();

            Product product = new Product(productName, price);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, price, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
        sc.close();
    }
}