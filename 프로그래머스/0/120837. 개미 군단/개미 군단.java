class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        if(hp >= 5){
            if(hp%5 == 0){
                answer = hp/5;   
            }else{
                answer = hp/5;
                hp = hp%5;
                if(hp >= 3){
                    if(hp%3 == 0){
                       answer += hp/3; 
                    }else{
                        answer += hp/3;
                        answer += hp%3;
                    }
                }else{
                    answer += hp;
                }
            }
        }else if(hp >= 3){
            if(hp%3 == 0){
                answer += hp/3; 
            }else{
                answer += hp/3;
                answer += hp%3;
            }
        }else{
            answer = hp;
        }
        
        
        return answer;
    }
}