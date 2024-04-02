package Lv1;
import java.util.Arrays;
public class Lv1_완주하지_못한_선수 {



    class Solution {
        public String solution(String[] participant, String[] completion) {

            Arrays.sort(participant);
            Arrays.sort(completion);

            for (int i = 0; i < completion.length; i++) {
                if (!participant[i].equals(completion[i])) {
                    return participant[i];
                }
            }

            return participant[participant.length-1];



        }

    }
}
