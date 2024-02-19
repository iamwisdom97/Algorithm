import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int count = 0;
        
        for(int i=0; i<quiz.length; i++){
            String[] q = quiz[i].split(" ");
            
            if(q[1].equals("+")){
                if((Integer.parseInt(q[0])+Integer.parseInt(q[2])) == Integer.parseInt(q[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else{
                if((Integer.parseInt(q[0])-Integer.parseInt(q[2])) == Integer.parseInt(q[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        
        
        return answer;
    }
}