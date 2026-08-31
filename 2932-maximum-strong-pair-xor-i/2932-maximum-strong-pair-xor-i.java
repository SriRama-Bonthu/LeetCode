class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int i=0;
        int j=0;
        int max_Xor=0;
        Arrays.sort(nums);
        for(j=0;j<nums.length;j++){
            i=j;
            while(i<nums.length){
                 if(Math.abs(nums[j]-nums[i])<=Math.min(nums[j],nums[i]) && (nums[i]^nums[j])>max_Xor){
                max_Xor=nums[i]^nums[j];
            }
            i++;
        }
        }
        return max_Xor;
    }
}
