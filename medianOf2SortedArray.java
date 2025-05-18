class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double med;
        int[] temp = new int[m+n];
        int i = 0; //nums1
        int j = 0;  //nums2
        int k = 0; //temp
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
       while(i < m){
        temp[k++] = nums1[i++];
       }
       while(j < n) {
        temp[k++] = nums2[j++];
       }
       int size = m+n;
        if(size % 2 == 0) { 
             med = (temp[size / 2 - 1] + temp[size / 2]) / 2.0;
        } else {
            med = temp[size/2];
        }
        return med;
    }
}
