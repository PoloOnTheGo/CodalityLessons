package CodalityLessons.Arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurenceInArray {
    public int solution(int[] A) {
        int lonely_element = 0;
        if(A.length ==1){
            return A[0];
        }
        Map<Integer, Integer> freq_map = new HashMap<>();
        for(int i: A){
            Integer value = 1;
            if(freq_map.get(i) != null) {
                value = freq_map.get(i)+1;
            }
            freq_map.put(i, value);
        }
        for(Integer key: freq_map.keySet()){
            if(freq_map.get(key) % 2 != 0) {
                lonely_element = key;
                break;
            }
        }
        return lonely_element;
    }
}
