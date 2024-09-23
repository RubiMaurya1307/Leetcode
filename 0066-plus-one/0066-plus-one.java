class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i =0;
        for( i = n-1; i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
            
              return digits;
            }
            digits[i] = 0;
        }
        // if(digits[i] == 0)
        //    {
            int new1[] = new int[n+1];
            new1[0] = 1;
        //    }
        return new1;
    }
}