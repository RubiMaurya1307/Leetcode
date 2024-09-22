class Solution {
    public int searchInsert(int[] nums, int target) {
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
     else if(target <nums[0])
         return 0;
     else
        return mid+1; 
    }
}