import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an array size: ");
        int arrSize = scan.nextInt();

        hw1 createarr = new hw1();
        ArrayMinMax m = new ArrayMinMax();
        int [] arr = createarr.createArray(arrSize);

        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n1-Find min value of the array" +
                           "\n2-Find max value of the array" +
                           "\n3-Display difference from average array" +
                           "\n4-Find sum of the array" +
                           "\nPlease enter your choice: ");
        int choice = scan.nextInt();

        
        if (choice == 1) {
            System.out.println(m.findMinimum(arr));
        }

        else if (choice == 2) {
            System.out.println(m.findMaximum(arr));
        }

        else if (choice == 3) {
            Average a = new Average();
            int [] newArr = a.averageDifference(arr);
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }

        else if (choice == 4) {
            
        }

        scan.close();
    }
}
