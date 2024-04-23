import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        
        int last = num_list[num_list.length - 1];
        int sec = num_list[num_list.length - 2];  
        
       
        if (last > sec) {
            answer.add(last - sec);
        } else if (last <= sec) {
            answer.add(last * 2);
        }        
       
        return answer;
    }
}