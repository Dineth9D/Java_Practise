import java.util.Arrays;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        int[] expectedNums = Arrays.copyOf(nums, index); // 
        Arrays.sort(expectedNums);
        return expectedNums.length;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3}; // Input array
        int val = 3; // Value to remove

        Remove_Element solution = new Remove_Element();
        int k = solution.removeElement(nums, val); // Calls your implementation
        System.out.println(k);
        
    }
}
