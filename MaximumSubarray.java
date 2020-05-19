// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int local = nums[0];
        int global = nums[0];

        for(int i = 1; i < nums.length; i++){
            local = Math.max(nums[i], local + nums[i]);
            global = Math.max(local, global);
        }

        return global;
    }
}
