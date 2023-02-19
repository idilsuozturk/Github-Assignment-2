import java.util.Random;

public class hw1 {

    public int[] createArray(int size) {
        Random rand = new Random();
        int [] numbers = new int [size];
        for(int i=0; i < size ;i++)
        {
            int random1= rand.nextInt(100);
            numbers [i]= random1;
        }
        
        return numbers;
    }
}


