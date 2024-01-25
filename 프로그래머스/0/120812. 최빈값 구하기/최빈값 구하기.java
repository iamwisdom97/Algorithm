import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
       Arrays.sort(array); //배열 오름차순 정렬
        max = array[array.length - 1]; //가장 큰 수를 max로 설정
        
        /*각 수의 count를 위한 배열 만들어줌
        (배열 index는 0부터 시작되기 때문에 길이는 max+1)*/
        int count[] = new int[max + 1];
        for(int i = 0; i < array.length; i++) {
            count[array[i]]++; //각 수의 index에 count
        }
        max = count[0];
        //가장 큰 count값을 max로 설정
        for(int i = 1; i < count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                answer = i; //max값이 바뀔 때의 index (최빈값)
            }else if(max == count[i]) { //최빈값이 여러 개인 경우 -1 return
                answer = -1;
            }
        }
        return answer;
    }
}