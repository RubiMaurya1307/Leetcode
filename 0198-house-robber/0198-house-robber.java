class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0]; // Only one house
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]); // Choose the richer house
        }

        int pr2 = nums[0]; // Max money from first house
        int pr1 = Math.max(pr2, nums[1]); // Max money from first two houses

        for (int i = 2; i < n; ++i) {
            int curr = Math.max(pr1, pr2 + nums[i]); // Take max of robbing or skipping
            pr2 = pr1; // Shift pr2 to previous pr1
            pr1 = curr; // Update pr1 with new max
        }

        return pr1; // Final max money
    }
}