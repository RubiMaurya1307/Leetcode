class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int i=0;
        rec(i,ds,nums,ans);
        return ans;        
    }
    static void rec(int i,List<Integer> ds,int[] nums,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        rec(i+1,ds,nums,ans);
        ds.add(nums[i]);
        rec(i+1,ds,nums,ans);
        ds.remove(ds.size()-1);
    }
}