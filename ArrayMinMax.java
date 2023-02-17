public class ArrayMinMax 
{
    public static int findMinimum(int[] array)
    {
        int min = array[0];
        for( int element : array)
        {
            if(element < min)
            {
                min = element;
            }
        }
        return min;
    }

    public static int findMaximum(int[] array)
    {
        int max = array[0];
        for( int element : array)
        {
            if(element > max)
            {
                max = element;
            }
        }
        return max;
    }
}
