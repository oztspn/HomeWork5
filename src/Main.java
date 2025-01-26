import coffee.order.CoffeeOrderBoard;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();


        orderBoard.add("Amanda");
        orderBoard.add("Linda");
        orderBoard.add("Rose");
        orderBoard.draw();
        System.out.println("___________________");
        System.out.println("Order № " + orderBoard.deliver(102).getOrderNumber() + " is ready!");

        orderBoard.draw();
        System.out.println("___________________");
        orderBoard.add("Brown");
        orderBoard.draw();

        System.out.println("Order № " + orderBoard.deliver().getOrderNumber() + " is ready!");
        orderBoard.draw();
        System.out.println("___________________");
        System.out.println("Order № " + orderBoard.deliver().getOrderNumber() + " is ready!");

    }
}
