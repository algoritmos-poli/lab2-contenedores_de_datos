package ejemplos;

import java.util.Arrays;

public class Ejemplo3 {
    public static void main(String[] args) {
        // Initialize an array with 30 seats
        int[] seats = new int[30];
        // Fill indices 0 to 5 with 1 (Balcony)
        Arrays.fill(seats, 0, 5, 1);
        // Fill indices 5 to 15 with 2 (Premium)
        Arrays.fill(seats, 5, 15, 2); // Fill indices 15 to 30 with 3 (Comfort)
        Arrays.fill(seats, 15, 30, 3);

        /*
        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i]);
        }
        */

        for (int i : seats) {
            switch (i) {
                case 1:
                    System.out.println("Seat " + (i + 1) + ": Balcony");
                    break;
                case 2:
                    System.out.println("Seat " + (i + 1) + ": Premium");
                    break;
                case 3:
                    System.out.println("Seat " + (i + 1) + ": Standard");
                    break;
                default:
                    System.out.println("Seat " + (i + 1) + ": Unknown");
            }
        }
    }
}