package Lv1;
import java.util.Arrays;
//시간초과
public class Lv1_햄버거_만들기 {
    // import java.util.Arrays;

    public class Solution {
        public int solution(int[] ingredient) {
            // 햄버거 재료 패턴
            String hamburgerPattern = "1231";


            // 숫자 외의 문자([, ], 공백, 콤마)를 제거
            String ingredientStr = Arrays.toString(ingredient).replaceAll("[^0-9]", "");

            int answer = 0;

            while (true) {
                int beforeLength = ingredientStr.length();
                ingredientStr = ingredientStr.replaceFirst(hamburgerPattern, "");
                int afterLength = ingredientStr.length();

                // beforeLength와 afterLength가 같으면 더이상 패턴이 없는 것이므로 종료
                if (beforeLength == afterLength) {
                    break;
                } else {
                    //패턴 찾은 겨웅
                    answer++;
                }
            }

            return answer;
        }

    }


}
