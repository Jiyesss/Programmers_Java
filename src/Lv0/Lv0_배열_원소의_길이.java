package Lv0;

public class Lv0_배열_원소의_길이 {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];
            for (int i =0;i<= strlist.length - 1; i++) {
                answer[i] = strlist[i].length();
            }

            return answer;
        }
    }
}
