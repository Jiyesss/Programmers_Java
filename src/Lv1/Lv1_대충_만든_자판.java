package Lv1;

public class Lv1_대충_만든_자판 {
    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];
            char[] alphabet = new char[26]; //알파벳을 담을 배열
            int[] fastkey = new int[26]; //알파벳 작성하기 위해 키를 최소 몇 번 눌러야 하는지 담는 배열

            for(int i = 0; i < alphabet.length; i++) {
                int min = 100; // 초기값 100 설정
                alphabet[i] = (char)(65 + i);
                for (int j = 0; j < keymap.length; j++) {
                    for (int k = 0; k < keymap[j].length(); k++) {
                        if (alphabet[i] == keymap[j].charAt(k)) {
                            if (k + 1 < min) min = k +1;
                            break;
                        }
                    }
                }
                fastkey[i] = (min == 100) ? -1 : min;
            }

            for (int l = 0; l < targets.length; l++) {
                int press = 0;
                boolean isUnreachable = false; // 입력할 수 없는 문자가 있는지 여부를 확인하는 플래그
                for (int m = 0; m < targets[l].length(); m++) {
                    if (isUnreachable) break; // 입력 불가능한 문자가 이미 발견되었으면 반복 중단
                    for (int n = 0; n < alphabet.length; n++) {
                        if (targets[l].charAt(m) == alphabet[n]) {
                            if (fastkey[n] == -1) {
                                press = -1;
                                isUnreachable = true; // 입력 불가능 상태로 설정
                                break;
                            } else {
                                press += fastkey[n];
                            }
                        }
                    }
                }
                answer[l] = press;
            }

            return answer;
        }
    }

}
