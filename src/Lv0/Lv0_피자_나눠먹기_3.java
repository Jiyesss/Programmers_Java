package Lv0;

public class Lv0_피자_나눠먹기_3 {
    class Solution {
        public int solution(int slice, int n) {

            if (n % slice == 0) {
                return n/slice;
            }
            else
                return n/slice +1;

        }
    }
}
