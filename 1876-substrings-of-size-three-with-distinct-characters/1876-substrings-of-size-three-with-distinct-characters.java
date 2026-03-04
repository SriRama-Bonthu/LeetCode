class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for (int i=0;i<s.length()-2;i++) {
            char a=s.charAt(i),b=s.charAt(i+1),c1=s.charAt(i+2);
            if (a!=b && a!=c1 && b!=c1) {
                c++;
            }
        }
        return c;
    }
}
