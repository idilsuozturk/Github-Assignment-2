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

    public static void main(String[] args) 
    {
        int[] a=new int[]{2, 6, 9, 3, 5};
        for(int i:a)
        {
            System.out.print(i+", ");
        }
        System.out.println();
        a=averageDifference(a);
        for(int i:a)
        {
            System.out.print(i+", ");
        }
    }
}
