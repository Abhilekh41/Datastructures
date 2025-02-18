package slidingWindow;

public class MaxLengthSubarray {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        int k = 6;
        System.out.println(maxLengthSubarray(array, k));
    }

    public static int maxLengthSubarray(int[] array, int k){
        int l = 0, r = 0, max_length = 0, sum = 0;
        
        while(r < array.length-1) {
            sum = sum+array[r];
            if(sum > k && max_length > r-l+1) {
                sum = sum - array[l];
                l = l+1;
            }
            if(sum<=k) {
                max_length = Math.max(max_length, r-l+1);
            }
            r=r+1;
        }
        return max_length;
    }
    
}
