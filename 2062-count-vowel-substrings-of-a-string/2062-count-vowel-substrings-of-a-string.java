class Solution {
    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    public int countVowelSubstrings(String s) {
        int i=0;
        int j=0;
        int c=0;
        while(i<s.length()){
            if(!isVowel(s.charAt(i))){
                i++;
                continue;
            }
            j=i;
            HashMap<Character,Integer> hs=new HashMap<>();
            while(j<s.length()){
                if(isVowel(s.charAt(j))){
                    hs.put(s.charAt(j),hs.getOrDefault(s.charAt(j),0)+1);
                }
                else{
                    break;
                }
                if(hs.size()==5){
                    c++;
                }
                j++;
            }
            i++;
        }
        return c;
    }
}