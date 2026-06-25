class Solution {
    public int[] twoSum(int[] nums, int target) {


        boolean found = false;
        for(int n = 0;n<nums.length;n++){ //nested loop to search the array
            for(int z = (n+1); z<nums.length;z++){

                if(nums[z] + nums[n] == target){
                    found = true;
                    return new int[] {n,z};
                

                }

            }
            
        }
        return new int[] {-1, -1};
        
           

    }
}


        
    
