import java.util.Arrays;

public class Solution_04 {
    public static int[] duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                for(int j=arr.length-1; j>i; j--){
                    arr[j] = arr[j-1]; 
                }
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] result = duplicateZeros(nums);
        System.out.println("Original array: " + Arrays.toString(duplicateZeros(nums)));
    }
}
