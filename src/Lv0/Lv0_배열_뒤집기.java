package Lv0;

public class Lv0_배열_뒤집기 {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];
            for (int i=num_list.length-1;i>=0;i--)
                answer[num_list.length-1-i] += num_list[i];
            return answer;
        }
    }
}
