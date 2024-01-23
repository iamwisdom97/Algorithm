class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] arr = rsp.split("");
        
        for(String s : arr){
            if(s.equals("2")){
                answer += 0;
            }else if(s.equals("0")){
                answer += 5;
            }else{
                answer += 2;
            }
        }
        
        return answer;
    }
}