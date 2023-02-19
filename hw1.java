package gitHubHw;
import java.util.Random;

public class hw1 {
    public static void main(String[] args) {
        
    
    Random rand = new Random();
    int [] numbers = new int [100];
    for(int i=0; i<100;i++)
    {
        int random1= rand.nextInt(100);
        numbers [i]= random1;
    }
    for(int a =0; a<100;a++)
    {
        System.out.println(numbers[a]);
    }
    }

}


