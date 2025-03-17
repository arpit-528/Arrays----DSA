class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = count;
        for(int i = 1; i<nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 1;
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
