package srp2;

import srp2.model.Order;
import srp2.util.JSONSaver;
import srp2.util.Saver;
import srp2.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        ConsoleView consoleView = new ConsoleView();
        Order order = consoleView.inputFromConsole();
        Saver orderSaver = new JSONSaver(order);
        orderSaver.save();
    }
}
