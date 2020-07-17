// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public int rob(int[] nums) {
        
        if(nums==null || nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        
        nums[1]=Math.max(nums[0],nums[1]);
        
        for(int i=2;i<nums.length;i++)
        {
            nums[i]=Math.max(nums[i-1],nums[i]+nums[i-2]);
        }
        
        return nums[nums.length-1];
    }
}