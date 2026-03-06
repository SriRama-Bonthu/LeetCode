class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans=0;
        int i=0;
        int j=0;
        long max=0;
        while(i<prices.length){
            j=i+1;
            while(j<prices.length && prices[j-1]-prices[j]==1){
                j++;
            }
            long a=j-i;
            long b=j-i+1;
            max=max+((a*b)/2);
            i=j;
        }
        return max;
    }
}