package Project;

import java.util.Scanner;

public class PlaysShipsMain {

    public static void main(String[] args) {

        System.out.println("Welcome to the Ships game!");

        Scanner scanner = new Scanner(System.in);
        ProduceMap produceMap = new ProduceMap();
        produceMap.generate(4);
        produceMap.generateEnemyShip(4);

        while (true) {
            produceMap.showMap();
            System.out.println("Your turn");
            System.out.println("x:");
            String x = scanner.nextLine();
            System.out.println("y:");
            String y = scanner.nextLine();
            produceMap.playerMove(Integer.parseInt(x), Integer.parseInt(y));
        }
    }
}
