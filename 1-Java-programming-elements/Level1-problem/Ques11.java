import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        Float number1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float number2 = sc.nextFloat();
        float add = number1 + number2; 
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1+" and "+ number2 +" is "+add+" , "+subtraction+" , "+multiplication+" and "+division);

        
    }
    
}