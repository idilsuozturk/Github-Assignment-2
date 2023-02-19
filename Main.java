import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your choice: ");
        int choice = scan.nextInt();

        System.out.println("1-Display array" +
                           "2-Find min value of the array" +
                           "3-Find max value of the array" +
                           "4-Display difference from average array" +
                           "5-Find sum of the array");
        
        // code for creating an array will be added later

        if (choice == 1) {

        }
        
        else if (choice == 2) {
            ArrayMinMax m = new ArrayMinMax();
        }

        else if (choice == 3) {
            
        }

        else if (choice == 4) {
            Average a = new Average();
        }

        else if (choice == 5) {
            
        }
    }
}
