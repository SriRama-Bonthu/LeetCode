class Solution {
    public String minWindow(String s, String t) {
        int i=0;
        int j=0;
        HashMap<Character,Integer> tmap=new HashMap<>();
        HashMap<Character,Integer> smap=new HashMap<>();
        for(char ch:t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        if(t.length()>s.length()){
            System.out.println("...............");
            return "";
        }
        int max=Integer.MAX_VALUE;
        int c=0;
        int start=0;
        int end=0;
        while(j<s.length()){
            smap.put(s.charAt(j),smap.getOrDefault(s.charAt(j),0)+1);
            if(tmap.containsKey(s.charAt(j)) && smap.get(s.charAt(j)).intValue()==tmap.get(s.charAt(j)).intValue()){
                c++;
            }
            while(i<=j && c==tmap.size()){
                if(j-i+1<max){
                    max=j-i+1;
                    start=i;
                    end=j;
                }
                smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)-1);
                if(tmap.containsKey(s.charAt(i)) && smap.get(s.charAt(i))<tmap.get(s.charAt(i))){
                    c--;
                }
                if(smap.get(s.charAt(i))<=0){
                    smap.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
        if(max==Integer.MAX_VALUE){
            return "";
        }
        System.out.println(s.length()+" "+t.length());
        return s.substring(start,end+1);
    }
}
// 