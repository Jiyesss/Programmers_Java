package Lv1;
import java.util.HashMap;
public class Lv1_성격유형검사하기 {

//import java.util.HashMap;
    public class Solution {
        public static String solution(String[] survey, int[] choices) {
            String answer = "";
            // MBTI 점수를 저장할 HashMap 생성
            HashMap<Character, Integer> mbti = new HashMap<>();
            mbti.put('R', 0);
            mbti.put('T', 0);
            mbti.put('C', 0);
            mbti.put('F', 0);
            mbti.put('J', 0);
            mbti.put('M', 0);
            mbti.put('A', 0);
            mbti.put('N', 0);

            for (int i = 0; i < survey.length; i++) {
                char disagree = survey[i].charAt(0); // 비동의 지표
                char agree = survey[i].charAt(1); // 동의 지표
                int choice = choices[i];

                if (choice < 4) {
                    mbti.put(disagree, mbti.get(disagree) + (4 - choice));
                } else if (choice > 4) {
                    mbti.put(agree, mbti.get(agree) + (choice - 4));
                }
            }

            // 지표 계산
            if (mbti.get('R') >= mbti.get('T')) answer += "R";
            else answer += "T";

            if (mbti.get('C') >= mbti.get('F')) answer += "C";
            else answer += "F";

            if (mbti.get('J') >= mbti.get('M')) answer += "J";
            else answer += "M";

            if (mbti.get('A') >= mbti.get('N')) answer += "A";
            else answer += "N";

            return answer;
        }
    }

}
