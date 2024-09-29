class Solution {
    public int singleNumber(int[] nums) {
        // int count = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0; i< nums.length-1; i+=2)
        {
            // for(int j=i +1; j< nums.length ;j++)
            // {
                if(nums[i] != nums[i+1])
                {
                   return nums[i];
                }
            // }
        }
        return nums[n-1];
    }
}