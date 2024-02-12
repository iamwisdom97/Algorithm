import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<String> list = new ArrayList(Arrays.asList(s.split("")));
        List<String> list2 = new ArrayList(Arrays.asList(s.split("")));
        
        List<String> distinctList = list.stream()
                            .distinct()
                            .collect(Collectors.toList());
        
        for (String el : distinctList) {
            list.remove(el);
        }       
        
        list2.removeAll(list);
        Collections.sort(list2);
        answer = String.join("", list2);
        
        return answer;
    }
}