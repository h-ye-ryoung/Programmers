package Lv0;

import java.util.HashMap;
import java.util.Map;

// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
// 최빈값이 여러 개면 -1을 return 합니다.

class FindingtheMode {
    public int solution(int[] array) {

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num: array) {
            countMap.put(num, countMap.getOrDefault(num, 0) +1);
        }

        int maxCount = 0;
        int mode = -1;
        boolean multipleModes = false;

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
                multipleModes = false;
            } else if (entry.getValue() == maxCount) {
                multipleModes = true;
            }
        }

        if (multipleModes) {
            return -1;
        } else {
            return mode;
        }

    }
}
