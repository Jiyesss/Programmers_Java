package Lv0;

public class Lv0_중복된_숫자개수 {
    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            for (int i = 0; i < array.length; i++)
                if (array[i] == n) answer += 1;
            return answer;
        }
    }
}
