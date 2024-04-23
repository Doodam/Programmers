class Solution {
    public int solution(int[] num_list) {
        int multiplication = 1;
        int sumSquare = 0;
        int sum = 0;
        
        for(int i=0; i<num_list.length; i++) {
            multiplication *= num_list[i]; 
        }
        for (int m=0; m<num_list.length; m++) {
            sum += num_list[m];
            sumSquare = (int) Math.pow(sum, 2);
        } 
        
         
        if(multiplication < sumSquare) {
           return 1;
         } else if(multiplication > sumSquare) {
           return 0;
        } else {
            return -1;
        }
        
    }
}