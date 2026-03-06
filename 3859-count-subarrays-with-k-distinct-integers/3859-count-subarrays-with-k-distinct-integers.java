class Solution {
    public long CntSub(int[] nums,int k,int m){
        int i=0;
        int j=0;
        int c=0;
        int good=0;
        long ans=0;
        int bool=0;
        int r=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(j<nums.length){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            if(hm.get(nums[j])==m){
                good++;
            }
            while(hm.size()>k){
                if(hm.get(nums[i])==m){
                    good--;
                }
                // if(hm.get(nums[i])>m){
                //     r--;
                // }
                hm.put(nums[i],hm.getOrDefault(nums[i],0)-1);
                
                if(hm.get(nums[i])<=0){
                    hm.remove(nums[i]);
                }
                i++;
                r=0;
            }
             while(i<=j && hm.size()==k && hm.get(nums[i])>m){
                    hm.put(nums[i],hm.getOrDefault(nums[i],0)-1);
                        // ans++;
                        r++;
                        i++;
                }
            if(good==k && hm.size()==k){
                // int temp=i;
                ans+=(r+1);
            }
            j++;
        }
        return ans;
    }
    public long countSubarrays(int[] nums, int k, int m) {
        // if(k==1){
        //     return CntSub(nums,k,m);
        // }
        return CntSub(nums,k,m);
    }
}