class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        while(i<nums.length){
            while(j<nums.length && (nums[j]==1 || k>0)){
                if(nums[j]==0 && k>0){
                    k--;
                }
                j++;
            }
            max=Math.max(j-i,max);
            if(nums[i]==0){
                k++;
            }
            i++;
        }
        return max;
    }
}