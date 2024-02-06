import java.io.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(char c : my_string.toCharArray()){
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c) ;
            }else{
                answer += Character.toUpperCase(c);
            }
        }
        
        return answer;
    }
}