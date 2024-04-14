package Lv1;

public class Lv1_숫자_짝꿍 {
    class Solution {
        public String solution(String X, String Y) {
            StringBuilder jjak = new StringBuilder(); // StringBuilder 사용
            boolean common = false;

            int[] xCounts = new int[10]; // X 문자열에서 각 숫자의 등장 횟수
            int[] yCounts = new int[10]; // Y 문자열에서 각 숫자의 등장 횟수

            // X와 Y에서 각 숫자의 등장 횟수 계산
            for (int i = 0; i < X.length(); i++) {
                xCounts[X.charAt(i) - '0']++;
            }
            for (int i = 0; i < Y.length(); i++) {
                yCounts[Y.charAt(i) - '0']++;
            }

            // X, Y에 공통으로 나타나는 정수가 있는지 확인
            for (int i = 0; i < 10; i++) {
                if (xCounts[i] > 0 && yCounts[i] > 0) {
                    common = true;
                    break;
                }
            }

            if (common) {
                // 가장 큰 정수를 만들어야 하므로 내림차순 진행
                for (int i = 9; i >= 0; i--) {
                    int count = Math.min(xCounts[i], yCounts[i]);
                    for (int j = 0; j < count; j++) { // count 만큼 jjak에 추가
                        jjak.append(i);
                    }
                }
            }

            if (jjak.length() == 0) {
                return "-1"; // 공통 숫자가 없는 경우
            } else if (jjak.toString().startsWith("0")) {
                return "0"; // 결과가 0으로만 구성된 경우
            } else {
                return jjak.toString();
            }
        }
    }

}
