class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int count=1;
        int max=0;
        while(i<nums.length){
            while(j<nums.length && (nums[j]==1 || count==1 )){
                if(nums[j]==0){
                    count=0;
                }
                max=Math.max(j-i,max);
                j++;
            }
            if(nums[i]==0){
                count=1;
            }
            i++;
        }
        return max;
    }
}