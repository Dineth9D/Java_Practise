class Solution_01 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;

                if (count > maxCount){
                    maxCount = count;
                }
                // maxCount =  Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        
        return maxCount;
    }

    public static void main(String[] args) {
        Solution_01 myObj = new Solution_01();
        int[] nums = {1, 0, 1, 1, 0, 1};
        System.out.println("Maximum number of consecutive 1's: " + myObj.findMaxConsecutiveOnes(nums));
    }
}