import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min=100;
        for(int i=0; i<array.length; i++) {
                if(Math.abs(array[i]-n)<min) {            
                    min=Math.abs(array[i]-n);          
                }
            }
        ArrayList<Integer> arr=new ArrayList<Integer>();  
            for(int i=0; i<array.length; i++) {
                if((Math.abs(array[i]-n))==(min)) {       
                    arr.add(array[i]);                    
                }
            }
        Collections.sort(arr);                            
        
        answer = arr.get(0);
        
        return answer;
    }
}