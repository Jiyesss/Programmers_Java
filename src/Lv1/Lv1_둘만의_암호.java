package Lv1;

import java.util.*;
import java.util.Arrays;

public class Lv1_둘만의_암호 {
    //import java.util.*;

    class Solution {
        public String solution(String s, String skip, int index) {
            String answer = "";
            for (int i = 0; i < s.length(); i++) {
                int count = 0; // 각 문자별로 이동해야 할 횟수 셈
                char current = s.charAt(i); // 현재 문자

                // count가 index만큼 뒤로 갈 때까지 반복
                while (count < index) {
                    current++; // 알파벳 하나씩 뒤로

                    if ((int) current > 122) { // 뒤로 가다가 'z'를 넘어가야 하는 경우
                        current -= 26; // 다시 'a'로 돌림
                    }

                    if (skip.indexOf(current) == -1) { // skip에 없는 문자인 경우
                        count++; // count를 증가시킴
                    }
                }
                // 변환된 문자를 결과 문자열에 추가하는 과정을 반복문 밖으로 이동
                answer += Character.toString(current);
            }
            return answer;
        }
    }

}

