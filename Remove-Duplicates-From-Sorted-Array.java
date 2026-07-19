class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j = 1; j<nums.length;j++){

            if(nums[i]!=nums[j]){// if the value at j is different from the value at i, move it to the next unique position otherwise continue...
                nums[i+1] = nums [j];
                i++;
            }
            }

        return ++i ;
        }
        
        
    
}