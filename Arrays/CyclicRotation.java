package CodalityLessons.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int arr_size = A.length;
        int[] updated_arr = new int[arr_size];
        if(arr_size == 0){
            return updated_arr;
        }
        int k = K % arr_size;
        for(int i = 0; i < arr_size;i++){
            if(i+k >= arr_size){
                updated_arr[i+k-arr_size] = A[i];
            } else {
                updated_arr[i+k] = A[i];
            }
        }
        return updated_arr;
    }
}
