public class ArraySummation {
    
    public static int sumOfOddIndex(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i += 2){
            sum += array[i];
        }
        return sum;
    }

    public static int sumOfEvenIndex(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2){
            sum += array[i];
        }
        return sum;
    }
}

