package Lv1;
import java.util.*;
public class Lv1_체육복 {
    //import java.util.*;

    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            Arrays.sort(lost);
            Arrays.sort(reserve);
            int answer = n; //n명 해놓고 한 명씩 소거
            int[] student = new int[n+1]; //전체 학생만큼 배열 생성, 각 학생이 가지고 있는 체육복 개수를 넣을 것임
            for (int i=0; i<lost.length; i++) { // 체육복 잃어버린 학생은 -1
                student[lost[i]]--;
            }
            for (int j=0; j <reserve.length;j++) {// 여분 체육복 가진 학생은 +1
                student[reserve[j]]++;
            }

            for (int k=0; k<student.length;k++) {
                if (student[k] == -1) { //체육복 잃어버린 학생의 경우
                    if (k>0 && student[k-1] == 1) { //첫번호가 아니고 앞번호 친구가 체육복 여분이 있는 경우, 앞번호가 체육복을 빌려줌
                        student[k]++;
                        student[k-1]--;
                    }
                    else if (k < student.length-1 && student[k+1] == 1){ // 마지막 번호가 아니고 뒷번호 친구가 체육복 여분이 있는 경우, 뒷번호가 체육복을 빌려줌
                        student[k]++;
                        student[k+1]--;
                    }
                    else answer--; //체육복을 빌리지 못한 경우이므로 체육수업못들음

                }
            }


            return answer;
        }
    }
}
