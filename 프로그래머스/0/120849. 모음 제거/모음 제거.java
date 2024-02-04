import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] s = my_string.split("");
        
        for(int i=0; i<s.length; i++){
            if(!s[i].equals("a") && !s[i].equals("e") && !s[i].equals("i") && !s[i].equals("o") && !s[i].equals("u")){
                answer+=s[i];
            }
            //System.out.print(s[i]);
        }
        
        return answer;
    }
}