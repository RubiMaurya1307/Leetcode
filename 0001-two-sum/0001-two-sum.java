class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // int ans[] = new int[2];
        int req;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j <n; j++)
            {
                if(target == nums[i] + nums[j])
                {
                    int ans[] = {i, j};
                return ans;
                }
            }
        }
        return null;
    }
}