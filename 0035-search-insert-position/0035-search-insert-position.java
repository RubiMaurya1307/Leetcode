class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start=0, end=n-1;
        while(start <= end)
        {
           int mid = (start + end)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[mid] < target)
            {
                start = start + 1;
            }
            else if(nums[mid] > target)
            {
                end = end -1;
            }
        }
        return start;
    }
}