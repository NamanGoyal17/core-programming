import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();
        double inches = heightCm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;
        System.out.printf("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + remainingInches);
        scanner.close();
    }
}
