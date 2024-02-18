import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        int a=0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                a++;
            }
        }
        
        answer = new int[a];
        int count = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                answer[count] = numlist[i];
                count++;
            }
        }
        
        return answer;
    }
}