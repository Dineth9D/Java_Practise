public class Array_Deletions {
    public static void main(String[] args) {
        // Declare an integer array of 10 elements.
        int[] intArray = new int[10];

        // The array currently contains 0 elements
        int length = 0;

        // Add elements at the first 6 indexes of the Array.
        for(int i = 0; i < 6; i++) {
            intArray[length] = i;
            length++;
        }

        for (int i = 0; i < length; i++) {
            // System.out.println("Index " + i + " contains " + intArray[i]);
            System.out.println(intArray[i]);
        }
    }
}