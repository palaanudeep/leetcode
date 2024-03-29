class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i!=0 && nums[i-1]==nums[i])continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j]==nums[j+1])j++;
                    j++;
                    while(j<k && nums[k-1]==nums[k])k--;
                    k--;
                }
                else if(sum>0)k--;
                else j++;
            }
        }
        return res;
    }
}