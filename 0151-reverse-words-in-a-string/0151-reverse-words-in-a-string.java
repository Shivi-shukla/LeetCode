class Solution {
    public String reverseWords(String s) {
        String[] ch=s.trim().split(" ");
         String out = "";
        for(int i=ch.length-1;i>0;i--){
            if(ch[i]!=""){
            out += ch[i] + " ";
        }
        }
        return out + ch[0];
        
    }
}