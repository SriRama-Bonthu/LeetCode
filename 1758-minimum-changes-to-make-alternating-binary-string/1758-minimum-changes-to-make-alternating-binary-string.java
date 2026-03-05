class Solution {
    public int minOperations(String s) {
        int zeroidx=0;
        int oneidx=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='0'){
                    zeroidx++;
                }
                else{
                    oneidx++;
                }
            }
            else{
                if(s.charAt(i)=='0'){
                    oneidx++;
                }
                else{
                    zeroidx++;
                }
            }
        }
        return Math.min(zeroidx,oneidx);
    }
}