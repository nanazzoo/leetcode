class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int i=0; i<nums.length; i++) {
            int temp = 0;
            
            if(nums[i]/10 >= 1) {
                temp = 2;
                if(nums[i]/10/10 >= 1) {
                    temp = 3;
                    if(nums[i]/10/10/10 >= 1) {
                        temp=4;
                        if(nums[i]/10/10/10/10 >= 1) {
                            temp = 5;
                             if(nums[i]/10/10/10/10/10 >= 1) {
                                 if(nums[i]/10/10/10/10/10/10 >= 1) {
                                     
                                 } else {
                                    count += 1;
                                }
                            }
                        } else {
                            count += 1;
                        }
                    }
                    
                } else {
                   count +=1; 
                }
                
            } else {
                temp = 1;
            }
            
        }
        return count;
        
    }
}