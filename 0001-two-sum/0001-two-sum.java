class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = {0,0};
        
        for(int i=0; i<nums.length-1; i++) {
            for(int z=1; z<nums.length; z++) {
                if(nums[i] + nums[z] == target && i!=z) {
                    result[0] = i;
                    result[1] = z;
                    return result;
                }
            }
        }
        return result;
        
    }
}