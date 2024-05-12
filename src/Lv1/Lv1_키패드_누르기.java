package Lv1;
import java.lang.Math;
public class Lv1_키패드_누르기 {
    //import java.lang.Math;

    class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int lf = 10 ; // 왼손 엄지의 초기 위치
            int rf = 12; // 오른손 엄지의 초기 위치
            for (int n : numbers) {
                if (n == 1 || n == 4 || n == 7) { // 무조건 왼손
                    answer = answer.concat("L");
                    lf = n;
                }
                else if (n == 3 || n == 6 || n == 9) { //무조건 오른손
                    answer = answer.concat("R");
                    rf = n;
                }
                else {
                    if (n == 0) n = 11; // n=0일 경우 위치를 11로 설정
                    int ld = Math.abs(lf - n) / 3 + Math.abs(lf - n) % 3; // 왼손과의 거리 계산
                    int rd = Math.abs(rf - n) / 3 + Math.abs(rf - n) % 3; // 오른손과의 거리 계산

                    if (ld < rd) { //왼손과의 거리가 더 가까울 때
                        answer = answer.concat("L");
                        lf = n;
                    }
                    else if (ld > rd) { // 오른손과의 거리가 더 가까울 때
                        answer = answer.concat("R");
                        rf = n;
                    }
                    else { // 거리가 같을 경우
                        if (hand.equals("left")) { //왼손잡이일 경우
                            answer = answer.concat("L");
                            lf = n;
                        }
                        else { //오른손잡이일경우
                            answer = answer.concat("R");
                            rf = n;
                        }
                    }

                }

            }
            return answer;
        }
    }

}
