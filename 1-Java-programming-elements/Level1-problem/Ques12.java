import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = sc.nextFloat();
        float yard = distanceInFeet ;
        
        float miles = yard / 1760; // 1 miles = 1760 yards
        System.out.println("The distance in miles is "+miles+" and in yards is "+yard);

    }
    
}