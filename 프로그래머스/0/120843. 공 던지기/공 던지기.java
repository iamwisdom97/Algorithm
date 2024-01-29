class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n = 0;
        
        int index = (k - 1) * 2 % numbers.length;
        answer = numbers[index];
        
        return answer;
    }
}