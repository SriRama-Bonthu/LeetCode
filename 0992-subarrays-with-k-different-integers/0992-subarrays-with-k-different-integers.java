class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        int i=0;
        int j=0;
        int c=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(i<arr.length){
            while(j<arr.length && (hm.size()<k || hm.containsKey(arr[j]))){
                hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);
                c+=j-i+1;
                j++;
            }
            hm.put(arr[i],hm.get(arr[i])-1);
            if(hm.get(arr[i])<=0){
                hm.remove(arr[i]);
            }
            i++;
        }
        i=0;
        j=0;
        int kc=0;
        HashMap<Integer,Integer> hm2=new HashMap<>();
        while(i<arr.length){
            while(j<arr.length && (hm2.size()<k-1 || hm2.containsKey(arr[j]))){
                hm2.put(arr[j],hm2.getOrDefault(arr[j],0)+1);
                     kc+=j-i+1;
                j++;
            }
            hm2.put(arr[i],hm2.getOrDefault(arr[i],0)-1);
            if(hm2.get(arr[i])<=0){
                hm2.remove(arr[i]);
            }
            i++;
        }
        return c-kc;
    }
}