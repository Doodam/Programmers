class Solution {
    public int solution(int[] num_list) {
        int multiplication = 1;
        int sum = 0;
        int answer = 0;
        
        for(int i=0; i<num_list.length; i++) {
            multiplication *= num_list[i]; 
            sum += num_list[i];
        }
        
        answer = (int) Math.pow(sum, 2) > multiplication ? 1 : 0;
        
        return answer;
        
    }
}
