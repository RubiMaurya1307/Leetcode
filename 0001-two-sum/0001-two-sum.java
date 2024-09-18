import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for(int i=0; i< nums.length; i++)
        {
            int comp = target - nums[i];
             if(numToIndex.containsKey(comp))
                {
                    return new int [] {numToIndex.get(comp), i};
                }
            numToIndex.put(nums[i], i);
        }
     return new int [] {};   
    }
}