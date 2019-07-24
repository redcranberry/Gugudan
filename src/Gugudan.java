import java.util.Scanner;

public class Gugudan {

    public static void main(String[] args) {
        //while
        //        System.out.println("What dan do you want?");
        //        Scanner scanner = new Scanner(System.in);
        //        int number = scanner.nextInt();
        //        int j = 1;
        //        int result;
        //        while (j < 10) {
        //            result = number * j;
        //            System.out.println(result);
        //            j = j + 1;
        //                }
        //for
        //        System.out.println("What dan do you want?");
        //        Scanner scanner = new Scanner(System.in);
        //        int number = scanner.nextInt();
        //        int result;
        //        for (int j = 1; j < 10; j++) {
        //            result = number * j;
        System.out.println("What dan do you want?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Input value : " + number);
        int result;
        if (number < 2) {
            System.out.println("Please input bigger number than 2");
        } else if (number > 9) {
            System.out.println("Please input smaller number than 10");
        } else {
            for (int i = 1; i < 10; i++) {
                System.out.println(number * i);
            }
        }
    }
}
