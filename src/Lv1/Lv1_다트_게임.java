package Lv1;

public class Lv1_다트_게임 {
    class Solution {
        public int solution(String dartResult) {
            String score = "";
            int[] answer = new int[3];
            int index = 0;

            for (int i = 0; i < dartResult.length(); i++) {
                char c = dartResult.charAt(i);
                if (Character.isDigit(c)) {
                    score += c;
                }
                else if (c == 'S') {
                    answer[index++] = Integer.parseInt(score);
                    score = "";
                }
                else if (c == 'D') {
                    answer[index++] = (int) Math.pow(Integer.parseInt(score), 2);
                    score = "";
                }
                else if (c == 'T') {
                    answer[index++] = (int) Math.pow(Integer.parseInt(score), 3);
                    score = "";
                }
                else if (c == '*') {
                    if (index > 1) {
                        answer[index - 2] *= 2;
                    }
                    answer[index - 1] *= 2;
                }
                else if (c == '#') {
                    answer[index - 1] *= -1;
                }
            }

            int sum = 0;
            for (int value : answer) {
                sum += value;
            }
            return sum;
        }
    }

}
