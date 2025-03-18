class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length, left = 0, right = 0, maxi = 0, sum = 0;
        while (right < n) {
            while ((sum & nums[right]) != 0) sum -= nums[left++];
            sum += nums[right];
            maxi = Math.max(maxi, right - left + 1);
            right++;
        }
        return maxi;
    }
}