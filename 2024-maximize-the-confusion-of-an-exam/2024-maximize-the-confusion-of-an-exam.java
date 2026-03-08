class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i=0;
        int j=0;
        int k2=k;
        int maxT=0;
        int maxF=0;
        int n=answerKey.length();
        while(i<n){
            while(j<n && (k>0 || answerKey.charAt(j)=='T')){
                if(answerKey.charAt(j)=='F' && k>0){
                    k--;
                }
                j++;
            }
            maxT=Math.max(j-i,maxT);
            if(answerKey.charAt(i)=='F'){
                k++;
            }
            i++;
        }
        i=0;
        j=0;
        while(i<n){
            while(j<n && (k2>0 || answerKey.charAt(j)=='F')){
                if(answerKey.charAt(j)=='T' && k2>0){
                    k2--;
                }
                j++;
            }
            maxF=Math.max(j-i,maxF);
            if(answerKey.charAt(i)=='T'){
                k2++;
            }
            i++;
        }
        return Math.max(maxT,maxF);
    }
}