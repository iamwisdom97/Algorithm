class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        String[] arr = cipher.split("");
        
        for(int i=code-1; i<arr.length; i+=code){
            answer += arr[i];
        }
        
        return answer;
    }
}