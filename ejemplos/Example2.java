package ejemplos;

public class Example2 {
    public static void main(String[] arg) {
        // Initialize an array for 30 seats
        int[] seats = new int[30];
        // Assign values: 1 for balcony, 2 for premium seats , 3 for standard seats
        for (int i = 0; i < seats.length; i++) {
            // First 5 seats are balcony
            if (i < 5) {
                seats[i] = 1;
            } else if (i < 15) {
                seats[i] = 2; // Next 10 seats are premium seats
            } else {
                seats[i] = 3; // Remaining seats are standard seats
            }
        }

        /*
        for (int seatType : seats) {
            System.out.println(seatType);
        }
        */

        for (int i = 0; i < seats.length; i++) {
            switch (seats[i]) {
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