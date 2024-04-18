public class Main
{
    public static void main(String[] args)
    {
        /*Write a Java program to find the first occurrence of a specific number in an array using a for loop and break statement. However,
          if the position of the first occurrence is less than 5, skip it and continue searching for the next occurrence.*/
        int[] arr = {1, 2, 3, 4, 7, 6, 7, 8, 9, 5, 10};
        int target = 7;
        int position = -1;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) 
            {
                if (i < 5) 
                {
                    continue;
                }
                position = i;
                break;
            }
        }
        if (position != -1)
        {
            System.out.println("The first occurrence of " + target + " is at position " + position);
        } else
        {
            System.out.println(target + " not found in the array.");
        }
    }
}
