class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int right= n-1;
        int left = 0; 
        int leftmax = 0, rightmax = 0; //for tracking the maximum height on their  respective sides 
        int water = 0; 
        while(left<=right) {
            if(height[left] <= height[right]) {
                if(height[left] >= leftmax) {
                    leftmax = height[left];

                } else {
                    water += leftmax - height[left];
                }
                left++;
            } else{
                if(height[right] >= rightmax) {
                    rightmax = height[right] ;
                } else {
                    water += rightmax - height[right];
                }
                right--;
           }
        }
        return water ;
    }
}
