class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], false);
        }

        for(int key : hm.keySet()){
            if(hm.containsKey(key-1)== false){
                hm.put(key, true);
            }
        }

        int max = 0;
        for(int key : hm.keySet()){
            int k =1;
            if(hm.get(key) == true){
                while(hm.containsKey(key + k) == true){
                    k++;
                }
            }

            max = Math.max(max, k);
        }

        return max;

       


        
        // if(nums.length==0){
        //     return 0;
        // }

        // Arrays.sort(nums);
        // int maxlen=1;
        // int prev=nums[0];
        // int len = 1;
        // for(int i=1; i<nums.length; i++){
        //     if(prev==nums[i]){                // best code for this problrm  
        //         continue;
        //     }
        //     if(nums[i]==(prev+1)){
        //         len++;
        //         prev=nums[i];
        //     }else{
        //         len=1;
        //         prev=nums[i];
        //     }
        //     maxlen=Math.max(maxlen,len);
        // }  
        // return maxlen; 
       
       
      /* 
      Arrays.sort(nums);
      int len=1;
      int maxlen=1;
      int prev= nums[0];                   // code is true but it give run time error

      for(int i=1; i<nums.length; i++){
        if(prev==nums[i]){
            continue;
        }
        if(nums[i]==(prev+1)){
            len++;
            prev= nums[i];
        }else{
            len=1;
            prev=nums[i];
        }
        maxlen = Math.max(len,maxlen);
      }  
      return maxlen;
      */
       
       /*
      Arrays.sort(nums); 
      int len =1;
      int maxlen =1;
      int prev= nums[0];

      for(int i=1; i<nums.length; i++){
        if(prev==nums[i]){
            continue;
        }

        if(nums[i]==(prev+1)){
            len++;
            prev=nums[i];
        }

        else{
            len=1;
            prev=nums[i];
        }

        maxlen = Math.max(maxlen, len);
      }
        return maxlen;
      */
    }
}