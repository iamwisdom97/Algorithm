import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String[] ageList = {"a","b","c","d","e","f","g","h","i","j"};
        String sAge = age + "";
        String test[] = sAge.split("");

        for (int i=0; i<test.length; i++){
            answer += ageList[Integer.parseInt(test[i])];
        }
        
        return answer;
    }
}