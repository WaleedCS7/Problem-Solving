class Solution {
    public int searchInsert(int[] nums, int target) {// A typical binary search method
        int l = 0;
        int r = (nums.length) -1;
        int m= 0;
        for(;(l <= r);){
            m = (l+r)/2;

            if(target == nums[m]){
            return m;}

            if(target<nums[m]){
                r=m-1;
            }

             if(target>nums[m]){
                l=m+1;
            }


        }
        
        
        return l;
        
    }
}
