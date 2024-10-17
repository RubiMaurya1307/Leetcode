class Solution {
public:
    void duplicateZeros(vector<int>& arr) {
        for(int i=0;i<arr.size()-1;i++){
            if(arr[i]==0){
                arr.erase(arr.begin()+arr.size()-1);
                arr.insert(arr.begin()+i+1,0);
                i++;
            }
        }
    }
};