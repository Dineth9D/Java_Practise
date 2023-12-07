public class Solution_02 {
    public int findNumbers(int[] nums) {
        int total_count = 0;

       for(int i = 0; i < nums.length; i++) {
        int count = 0;
            // nums[0] = 12
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                total_count++;
            }
       }
        return total_count;
    }


    public static void main(String[] args) {
        Solution_02 myObj = new Solution_02();
        int[] nums = {12,345,2,6,7891};
        System.out.println("Maximum number of consecutive 1's: " + myObj.findNumbers(nums));
    }
}
