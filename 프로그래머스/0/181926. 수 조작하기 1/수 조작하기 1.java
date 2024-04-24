class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] controller = control.split("");
                
        for (String c : controller) {
            if(c.equals("w")) {
                answer += 1;
            } else if(c.equals("s")) {
                answer -= 1;
            } else if(c.equals("d")) {
                answer += 10;
            } else if(c.equals("a")) {
                answer -= 10;
            } 
        }
        
        return answer;
    }
}