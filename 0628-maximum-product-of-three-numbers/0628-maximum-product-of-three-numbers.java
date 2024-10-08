class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if(n < 3)
        {
            return -1;
        }
        int maxA = Integer.MIN_VALUE,
         maxB = Integer.MIN_VALUE,
         maxC = Integer.MIN_VALUE;


        int minA = Integer.MAX_VALUE,
          minB = Integer.MAX_VALUE;
          for(int i =0; i< n; i++)
          {
            if(nums[i] > maxA)
            {
                maxC = maxB;
                maxB = maxA;
                maxA = nums[i];
            }
            else if(nums[i] > maxB)
            {
                maxC = maxB;
                maxB = nums[i];
            }

            else if(nums[i] > maxC)
            maxC = nums[i];
            if(nums[i] < minA)
            {
                minB = minA;
                minA = nums[i];
            }
            else if(nums[i] < minB)
            minB = nums[i];
          }
          return Math.max(minA * minB * maxA , maxA * maxB * maxC);
    }
}