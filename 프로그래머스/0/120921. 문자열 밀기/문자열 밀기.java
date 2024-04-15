class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String before = A;
        
        for(int i = 0; i < A.length(); i++) {
            if(before.equals(B)) {
                return answer;
            }
            String a = before.substring(before.length() -1);
            before = a + before.substring(0, before.length() -1);
            answer++;
        }
        return -1;
    }
}