package slidingwindow;

class MaxSubArrayWithLengthK {

    public static void main(String[] args) {
        int[] array = new int[]{9,2,-1,4,5,-1};
        int k = 3;
        System.out.println(maxSum(array, k));
    }

    private static int maxSum(int[] array, int k) {
        int l = 0;
        int r = k-1;
        int sum =0;
        int max_sum = 0;
        if(array.length == 1) {
            return array[0];
        }
        for(int i = 0; i< k; i++) {
            sum = sum + array[i];
        }
        max_sum = sum;
        while(l<r) {
            sum = sum - array[l];
            if(r<array.length-1) {
                r++;
                sum = sum + array[r];
            }
            max_sum = Math.max(sum, max_sum);
            l++;
        }
        return max_sum;
    }
    
}
