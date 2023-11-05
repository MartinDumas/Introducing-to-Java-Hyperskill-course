import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 1; i <= 7; i++) {
            System.out.print(i);
            for (int j = 0; j < 8; j++) {
                System.out.print(" S");
            }
            System.out.println();
        }
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = src.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = src.nextInt();
        int total = rows*seats;
        int frontHalf, backHalf;
        System.out.println("Total income:");
        if (total > 60){
            if (total % 2 == 0){
                frontHalf = rows / 2;
                backHalf = rows / 2;
            } else {
                frontHalf = rows / 2;
                backHalf = rows / 2 + 1;
            }
            System.out.println("$" + (frontHalf * seats * 10 + (backHalf * seats * 8)));
        }
        System.out.println("$" + total * 10);
    }
}