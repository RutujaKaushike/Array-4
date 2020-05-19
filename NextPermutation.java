// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        // Step 1
        int i = nums.length - 2;
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }

        // Step 2
        int j = nums.length - 1;
        if(i >= 0){
            while(j > i && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3
        reverse(nums, i+1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
