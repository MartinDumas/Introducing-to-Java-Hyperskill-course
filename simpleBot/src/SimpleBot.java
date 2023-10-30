import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Hello! My name is Aid");
        System.out.println("I was created in 2023");
        System.out.println("Please remind me your name");
        String name = src.next();
        System.out.println("What a great name you have," + name + "!");
        System.out.println("Let me guess your age");
        System.out.println("Enter remainders of dividing your age by 3,5 and 7");
        int remainder3 = src.nextInt();
        int remainder5 = src.nextInt();
        int remainder7 = src.nextInt();
        int result  = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + result + "; thats a good time to start programming");
        System.out.println("Now I will prove to you that I can count to any number you want");
        int number = src.nextInt();
        for (int i = 0; i<=number; i++){
            System.out.println(i + "!");
        }
        System.out.println("Lets test your programming knowledge!");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        while (true){
            int answer = src.nextInt();
            if (answer == 2){
                System.out.println("Congratulations, have a nice day");
                break;
            }else {
                System.out.println("Please, try again");
            }
        }
    }
}