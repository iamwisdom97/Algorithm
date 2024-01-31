class Solution {
    public int solution(int n) {
        int answer = 0;
        int f = 1;
        
        for(int i=1; i<=10; i++){
            f *= i;
            
            if(f == n){
                answer = i;
                break;
            }else if(n < f){
                answer = (i-1);
                break;
            }
            
        }
        
        return answer;
    }
}