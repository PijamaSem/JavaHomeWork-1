import java.util.Random;

public class app2 {
    public static void main(String[] args) {
        // Условие задачи: сформировать массив из чётных значений массива.
        int[] array = CreateArray(10, 999);  
        PrintArray(array);
        int[] newArray = OddArray(array);
        System.out.println();
        PrintArray(newArray);
    }

    public static int[] CreateArray(int size, int maxValue) {
        int []result = new int [size];
        for (int i = 0; i < result.length; i++) {
            Random newDigit = new Random();
            result[i] = newDigit.nextInt(maxValue);
        }
        return result;
    }
    public static void PrintArray(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ",arr[i]);
        }
    }
    public static int[] OddArray(int[]arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0){
                count++;
            }
        }
        int[] result = new int [count];
        count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]%2 == 0){
                result[count] = arr [j];
                count++;
        }
        }
        return result;
        }
}