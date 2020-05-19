// Time Complexity : O(n log (n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Arrays;

public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i = i + 2){
            sum += nums[i];
        }

        return sum;
    }
}
