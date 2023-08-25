package practice;
public class ArraySumExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length");
            return;
        }

        int[] sumArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // Print the sumArray
        System.out.print("Sum Array: ");
        for (int num : sumArray) {
            System.out.print(num + " ");
        }
    }
}
