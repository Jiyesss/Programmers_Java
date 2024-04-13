package Lv0;
import java.util.*;
public class Lv0_짝수는_싫어요 {
    //import java.util.*;

    class Solution {
        public int[] solution(int n) {
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    // 0은 리스트에 추가하지 않음
                    ls.add(i + 1);
                }
            }

            // 리스트를 int[] 배열로 변환
            int[] finalAnswer = new int[ls.size()];
            for (int i = 0; i < ls.size(); i++) {
                finalAnswer[i] = ls.get(i); // 리스트의 값을 배열에 할당
            }

            return finalAnswer;
        }
    }


}
