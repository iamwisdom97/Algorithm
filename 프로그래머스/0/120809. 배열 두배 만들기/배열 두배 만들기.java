class Solution {
    public int[] solution(int[] numbers) {
        int a = numbers.length;
        int[] answer = new int[a];
        //answer = new int[10];
        //System.out.println(answer.length);
        
        for(int i=0; i<numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}