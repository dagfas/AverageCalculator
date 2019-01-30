import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int int1 = scanner.nextInt();

        System.out.println("Enter second number");
        int int2 = scanner.nextInt();

        System.out.println("Enter the third number");
        int int3 = scanner.nextInt();

        System.out.println("Enter the fourth number");
        int int4 = scanner.nextInt();

        System.out.println("Enter the fifth number");
        int int5 = scanner.nextInt();

        System.out.println("Enter the sixth number");
        int int6 = scanner.nextInt();

        System.out.println("Enter the seventh number");
        int int7 = scanner.nextInt();

        System.out.println("Enter the eighth number");
        int int8 =scanner.nextInt();

        System.out.println("Enter the nineth number");
        int int9 = scanner.nextInt();

        System.out.println("Enter the tenth number");
        int int10 = scanner.nextInt();

        int total = int1+int2+int3+int4+int5+int6+int7+int8+int9+int10;
        System.out.println("Your average of the 4 numbers is " + total/10);
    }
}
