class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String word = Integer.toString(array[i]);
            for (int t = 0; t < word.length(); t++) {
                if(word.substring(t, t+1).equals("7")) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}