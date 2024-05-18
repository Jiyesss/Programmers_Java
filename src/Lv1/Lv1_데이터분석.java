package Lv1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Lv1_데이터분석 {


    public class Solution {
        public static List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
            // ext와 sort_by에 따라 index 결정
            int extIndex = getIndex(ext);
            int sortByIndex = getIndex(sort_by);

            // 조건에 맞는 데이터 필터링
            List<int[]> filteredData = Arrays.stream(data)
                    .filter(d -> d[extIndex] < val_ext)
                    .collect(Collectors.toList());

            // sort_by에 해당하는 값으로 정렬
            filteredData.sort((d1, d2) -> Integer.compare(d1[sortByIndex], d2[sortByIndex]));

            return filteredData;
        }

        // ext와 sort_by 문자열을 인덱스 값으로 변환
        private static int getIndex(String column) {
            switch (column) {
                case "code":
                    return 0;
                case "date":
                    return 1;
                case "maximum":
                    return 2;
                case "remain":
                    return 3;
                default:
                    throw new IllegalArgumentException("잘못.침.ㅋ");
            }
        }


    }


}
