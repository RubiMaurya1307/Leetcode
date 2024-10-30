class Solution {
public:
    int findPoisonedDuration(vector<int>& timeSeries, int duration) {
       int total = 0, poison_end = 0;

        if(timeSeries.size() ==  1) return duration;

        for(int i = 0; i < timeSeries.size()-1; i++)
        {
            poison_end = timeSeries[i] + duration - 1;
            total += duration;
            if(poison_end >= timeSeries[i+1]) 
                total -= poison_end - timeSeries[i+1] + 1;  
        }
        return total + duration;  
    }
};