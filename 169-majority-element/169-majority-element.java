class Solution {
    public int majorityElement(int[] nums) {
        int num=0, count=0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                num = nums[i];
                count++;
            }
            else if(num == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return num;
    }
}