package Lv0;

public class Lv0_OX퀴즈 {
    class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];

            for(int i = 0; i < quiz.length; i++) {
                String[] string = quiz[i].split(" ");
                int num1 = Integer.parseInt(string[0]);
                int num2 = Integer.parseInt(string[2]);
                int num3 = Integer.parseInt(string[4]);

                if(string[1].equals("+")) {
                    if((num1 + num2) == num3) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                }

                if(string[1].equals("-")) {
                    if((num1 - num2) == num3) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                }
            }
            return answer;

        }
    }

}
