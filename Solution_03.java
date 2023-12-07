import java.util.Arrays;

public class Solution_03 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }


    public static void main(String[] args) {
        Solution_03 myObj = new Solution_03();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] sortedSquares = myObj.sortedSquares(nums);
        System.out.println(Arrays.toString(sortedSquares));
    }
}
