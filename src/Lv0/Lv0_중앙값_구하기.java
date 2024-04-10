package Lv0;
import java.util.*;
public class Lv0_중앙값_구하기 {
    //import java.util.*;

    class Solution {
        public int solution(int[] array) {

            Arrays.sort(array);

            return array[array.length/2];
        }
    }
}
