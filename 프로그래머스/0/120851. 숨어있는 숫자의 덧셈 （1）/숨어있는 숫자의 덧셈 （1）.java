class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String s[] = my_string.replaceAll("[^0-9]", "").split("");
        
        for(int i=0; i<s.length; i++){
            answer += Integer.parseInt(s[i]);
        }
        
        return answer;
    }
}