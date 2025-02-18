package slidingWindow;

public class CountPairsSumLessThanTarget {

    public static void main(String[] args) {
        int[] array = new int[]{-1,1,2,3,1};
        int k = 2;
        System.out.println(countPairsSumLessThanTarget(array, k));
    }

    public static int countPairsSumLessThanTarget(int[] array, int k) {
        int count = 0, l = 0, r = 1;
        while(l<array.length-1) {
            if(array[l]+array[r]<k) {
                count = count+1;
            }
            if(r==array.length-1) {
                l=l+1;
                r=l+1;
            } else {
                r=r+1;
            }
        }
        return count;
    }
    
}
