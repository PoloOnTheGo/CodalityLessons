package CodalityLessons.Counter;

import java.util.Arrays;

public class CodilityMaxCounters {
    public int[] solution(int N, int[] A) {
        int global_max = 0;
        int[] arr = new int[N];
        int max = 0;
        for (int j : A) {
            if (j > N) {
                global_max = max;
            } else {
                int arr_index = j - 1;
                arr[arr_index] =  Math.max(arr[arr_index], global_max);
                arr[arr_index]++;
                max = Math.max(arr[arr_index], max);
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] =  Math.max(arr[i], global_max);
        }
        return arr;
    }
}
