class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> first_array = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            first_array.add(nums1[i]);
        }
        for(int j=0; j<nums2.length; j++) {
            if(first_array.contains(nums2[j]) && !arr.contains(nums2[j])){
                arr.add(nums2[j]);
            }
        }
        int[] result = new int[arr.size()];
        for(int i = 0; i<arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}
