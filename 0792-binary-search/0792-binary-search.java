class Solution {
    public int search(int[] nums, int target) {
       int start=0, end=nums.length-1;
       int mid = (start+end)/2;
       while(start<=end && nums[mid] != target){
       if(target<nums[mid])
        end =mid-1;
       else
        start = mid + 1;
       mid = (start+end)/2;
     }
     if(target==nums[mid])
        return mid;
       else 
        return -1; 
    }
}