public class ArrayMinMax 
{
    public int findMinimum(int[] array)
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

    public int findMaximum(int[] array)
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
