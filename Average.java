public class Average 
{
    public static int[] averageDifference(int[] array)
    {
        int average=0;
        for(int i:array)
        {
            average+=i;
        }
        average=average/array.length;
        int[] newArray=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            newArray[i]=array[i]-average;
        }
        return newArray;
    }
}
