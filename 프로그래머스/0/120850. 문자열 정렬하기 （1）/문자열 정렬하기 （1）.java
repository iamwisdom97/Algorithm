import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        
        String[] s = my_string.replaceAll("[^0-9]", "").split("");
        answer = new int[s.length];
        //t n = Integer.parseInt(s);
        
        for(int i=0; i<s.length; i++){
            answer[i] = Integer.parseInt(s[i]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}