class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] arr = Integer.toString(order).split("");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")){
                answer ++;
            }
        }
        
        return answer;
    }
}