class Solution {
    public String triangleType(int[] nums) {
        int i = 0;
        int j = i+1;
        int k = i+2;
         if(nums[i]+nums[j] <= nums[k] || nums[j]+nums[k] <= nums[i] || nums[i]+nums[k]   <=nums[j]) {
              return "none";
         }
        if(nums[i]==nums[j] && nums[j]==nums[k]) 
            return "equilateral";
         else if(nums[i]==nums[j] || nums[i]==nums[k] || nums[j]==nums[k]) 
            return "isosceles";
         else
            if(nums[i]+nums[j] > nums[k] && nums[j]+nums[k] > nums[i] && nums[i]+nums[k]         > nums[j]) 
              return "scalene";  
            else 
            return "none";
    }
}
