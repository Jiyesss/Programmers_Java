package Lv1;

public class Lv1_로또의_최고순위와_최저순위 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int same = 0;
            int count0 = 0;

            for (int i =0;i<lottos.length;i++) {
                if (lottos[i] == 0) count0++; //0 개수 count

                for (int j = 0; j<win_nums.length;j++) {
                    if (lottos[i] == win_nums[j]) same++;
                }
            }

            if (same == 0 && count0 == 0) {
                answer[0] = 6;
                answer[1] = 6;
            }
            else if ( same == 0 && count0 != 0) {
                answer[0] = 6 - count0 + 1;
                answer[1] = 6;
            }
            else {
                answer[0] = 6 - same - count0 + 1;
                answer[1] = 6 - same + 1;
            }

            return answer;
        }
    }
}
