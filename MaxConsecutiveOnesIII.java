class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int zeros = 0;
        while(right < nums.length){
            if(nums[right] == 0) {
                zeros++;
            }
                while(zeros > k) {
                    if(nums[left] == 0) {
                    zeros--;
                    }
                    left++;
                }
                    maxlen = Math.max(maxlen, right-left+1);
                    right++;
    }
    return maxlen;
    }
}
