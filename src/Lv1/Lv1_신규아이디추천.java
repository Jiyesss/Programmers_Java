package Lv1;
import java.util.HashMap;

public class Lv1_신규아이디추천 {

//import java.util.HashMap;
class Solution {
    public String solution(String new_id) {
        String answer = "";

        // 1단계: 모든 문자를 소문자로 변환
        new_id = new_id.toLowerCase();

        // 2단계: 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (Character.isDigit(c) || Character.isLowerCase(c) || c == '-' || c == '_' || c == '.') {
                answer += c;
            }
        }

        // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }

        // 4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
        if (answer.startsWith(".")) {
            answer = answer.substring(1);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }

        // 5단계: 빈 문자열이라면 "a"를 대입
        if (answer.isEmpty()) {
            answer = "a";
        }

        // 6단계: 길이가 16자 이상이면, 첫 15자를 제외한 나머지 문자들을 모두 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        // 7단계: 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
        if (answer.length() <= 2) {
            char lastChar = answer.charAt(answer.length() - 1);
            while (answer.length() < 3) {
                answer += lastChar;
            }
        }

        return answer;
    }
}


}
