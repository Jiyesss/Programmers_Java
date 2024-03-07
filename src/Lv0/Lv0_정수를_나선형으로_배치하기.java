package Lv0;

public class Lv0_정수를_나선형으로_배치하기 {
    class Solution {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];
            int a = 1;
            int count = 1;
            int total = n;

            while (n >= 1) {
                // 왼쪽에서 오른쪽으로 채우기 (최상단)
                for (int i=a;i<=n;i++) {
                    answer[a-1][i-1] = count;
                    count += 1;
                }

                // 위에서 아래로 채우기 (오른쪽)
                for (int i=a+1;i<=n;i++) {
                    answer[i-1][n-1] = count;
                    count += 1;
                }

                // 오른쪽에서 왼쪽으로 채우기 (최하단)
                for (int i=n-1;i>=a;i--) {
                    answer[n-1][i-1] = count;
                    count += 1;
                }

                // 아래에서 위로 채우기 (왼쪽)
                for (int i=n-1;i>=a+1;i--) {
                    answer[i-1][a-1] = count;
                    count += 1;
                }
                n -= 1;
                a += 1;
            }

            if (n ==1) //n이 홀수로 주어지는 경우만 해당
                answer[total/2][total/2] = count;
            return answer;
        }
    }
}
