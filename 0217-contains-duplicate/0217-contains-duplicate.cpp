class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        // bool flag = false;
        unordered_map<int, bool> m;
        
        for(int i=0;i <nums.size(); i++)
        {
            // for(int j=i+1; j< nums.size(); j++)
            // {
                if(m.find(nums[i]) != m.end())
                {
                    return true;
                }
                m[nums[i]] = true;
            // }
        }
        return false;
    }
};