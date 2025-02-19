package slidingwindow;

public class FirstNegativeNumberOfEachSubArray {

    
    public static void main(String[] args) {
        int[] array = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = slidingWindowMaximum(array, k);
        for(int i = 0; i< result.length; i++) {
            System.out.println(result[i]);
        }
    }
    
    private static int[] slidingWindowMaximum(int[] array, int k) {
        if(array.length == 1 || k == 1) {
            return array;
        }
    
        int n = array.length-k+1;
        int[] maxArray = new int[n];
        int index = 0;
        int l = 0;
        int r = k-1;
        while(l<r && r<array.length) {
            int counter = l;
            int max = array[l];
            while(counter<r) {
                counter++;
                max=Math.max(max, array[counter]);
            }
            maxArray[index] = max;
            index++;
            l++;
            r++;
        }
        return maxArray;
    }
}
