package Lv0;

import java.util.HashMap;
import java.util.Map;

class Finding_the_Mode {
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
