class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int sum=0;
        int count=0;
        unordered_map<int, int> sum_count;
        sum_count[sum] = 1;
        for(int i=0; i<nums.size(); i++){
            sum += nums[i];
            if(sum_count.find(sum-k)!=sum_count.end())count += sum_count[sum-k];
            sum_count[sum]++;
        }
        return count;
    }
};