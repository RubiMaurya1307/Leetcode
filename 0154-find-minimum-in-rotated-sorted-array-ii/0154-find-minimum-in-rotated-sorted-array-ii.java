class Solution {
    public int findMin(int[] nums) {
        int left = 0 , right = nums.length-1 , n = right+1;
        if(nums.length == 1) return nums[0];
        while(left < right){
            int mid = left  + (right - left)/2;
            if(nums[left] < nums[right]) break; 
            if(nums[mid] > nums[right]) left = mid+1;
            else if(nums[mid] < nums[left]) right = mid;
            else left++;
        }
        return nums[left];
    }
}