package Lv0;
import java.util.Arrays;
public class Lv0_배열_자르기 {


    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);

            return answer;
        }
    }
}
