class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        while(j<nums.length){
            if(nums[j]==0 && k>0){
                k--;
            }
            else if(nums[j]==0 && k==0){
                max=Math.max(j-i,max);
                if(nums[i]==0){
                    k++;
                }
                i++;
                continue;
            }
            j++;
        }
        max=Math.max(j-i,max);
        return max;
    }
}