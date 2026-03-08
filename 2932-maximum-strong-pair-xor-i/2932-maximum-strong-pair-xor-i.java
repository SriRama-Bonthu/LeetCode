class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int i=0;
        int j=0;
        int maxXor=0;
        Arrays.sort(nums);
        for(j=0;j<nums.length;j++){
            i=j;
            while(i<nums.length){
                 if(Math.abs(nums[j]-nums[i])<=Math.min(nums[j],nums[i]) && (nums[i]^nums[j])>maxXor){
                maxXor=nums[i]^nums[j];
            }
            i++;
        }
        }
        return maxXor;
    }
}