package CodalityLessons.Iterations;

public class BinaryGap {
    public int solution(int N) {
        int max_count = 0;
        String binary_rep = Integer.toBinaryString(N);
        String binary_rep_wo_trailing_zeroes = binary_rep.replaceAll("0+$","");
        if(!binary_rep_wo_trailing_zeroes.contains("0") || !binary_rep.substring(1).contains("1")){
            return 0;
        }
        int gap = 1;
        char[] binary_char_arr = binary_rep.toCharArray();
        for(int i=1; i<binary_char_arr.length; i++){
            if(binary_char_arr[i-1] == binary_char_arr[i]){
                gap++;
            } else {
                max_count = Math.max(gap, max_count);
                gap = 1;
            }
        }
        return max_count;
    }
}
