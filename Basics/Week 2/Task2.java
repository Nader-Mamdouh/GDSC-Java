public class ArraySumAndAverage {
    public static void main(String[] args) {
        /*Write a Java program to find the sum and average of elements in an array of integers, each mathematical operation in a single method.*/
        int[] arr = {1, 2, 3, 4, 5};
        
        int sum = findSum(arr);
        double average = findAverage(arr);
        
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double findAverage(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int sum = findSum(arr);
        return (double) sum / arr.length;
    }
}
