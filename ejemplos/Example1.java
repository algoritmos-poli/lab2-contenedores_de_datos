package ejemplos;

public class Example1 {
    public static void main(String[] args) {
        // Inicializacion estatica del array
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" };
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

        // Inicializacion dinamica del array
        String[] monthsOfYear = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        for (String month : monthsOfYear) {
            System.out.println(month);
        }
    }
}