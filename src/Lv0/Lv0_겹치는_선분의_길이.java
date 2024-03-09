package Lv0;

public class Lv0_겹치는_선분의_길이 {
    class Solution {
        public int solution(int[][] lines) {
            int answer = 0;
            int[] range = new int[201]; //전체 선분 범위 설정

            for (int i=0;i<lines.length;i++) {
                for (int j=lines[i][0]+100;j<lines[i][1]+100;j++) {//-100부터 100까지의 범위를 0부터 200으로
                    range[j]++;
                }
            }

            for (int k=0;k<range.length;k++) {
                if (range[k]>1) answer++;
            }
            return answer;
        }
    }


}
