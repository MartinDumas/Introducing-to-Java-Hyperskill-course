import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number of rows:");
        int rows = src.nextInt();
        System.out.println("Enter a number of seats in each row:");
        int seats = src.nextInt();
        String[][] arr = new String[rows][seats];
        for (int i =0; i < rows; i++){
            for (int j = 0; j < seats; j++){
                arr[i][j] = "S";
            }
        }

        // Visualizing the seating arrangements
        System.out.println("Cinema:");
        for (int i = 0; i <= seats; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < rows; i++){
            System.out.print(i + 1 +" ");
            for (int j = 0; j < seats; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Seat booking
        System.out.println("Enter a row number:");
        int rowNumber = src.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNumber = src.nextInt();
        arr[rowNumber-1][seatNumber-1] = "B";

        // Ticket price calculation

        int totalSeats = rows * seats;
        int frontHalf = totalSeats/2;
        int ticketPrice;
        if (totalSeats > 60) {
            if (rowNumber <= frontHalf) {
                ticketPrice = 10;
                System.out.println("Ticket price: $" + ticketPrice);
            } else {
                ticketPrice = 8;
                System.out.println("Ticket price: $" + ticketPrice);
            }
        } else {
            ticketPrice = 10;
            }

        // Visualizing the updated seating arrangements

        System.out.println("Ticket price: $" + ticketPrice);
        System.out.println("Cinema:");
        for (int i = 0; i <= seats; i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i = 0; i<rows; i++){
            System.out.print(i+ 1+ " ");
            for (int j = 0; j < seats; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}