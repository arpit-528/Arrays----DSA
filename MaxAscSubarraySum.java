class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
            sum += nums[i];
            max = Math.max(max, sum);
            } else {
                max = Math.max(max, sum);
                 sum = nums[i];
            }
        }
         max = Math.max(sum, max);
        
        return max;
    }
}
