package Lv0;

public class Lv0_옹알이_1 {
    class Solution {
        public int solution(String[] babbling) {
            String[] baby = {"aya","ye","woo","ma"};
            int answer = 0;
            for (String b:baby){
                for (int i = 0;i<babbling.length;i++) {
                    if (babbling[i].contains(b)) {
                        babbling[i] = babbling[i].replace(b,"1");
                    }
                }
            }

            for (String j:babbling) {
                j = j.replace("1","");
                if (j.equals("")) answer += 1;
            }

            for (String k:babbling) {
                if (k.equals("")) answer += 1;
            }


            return answer;
        }
    }
}
