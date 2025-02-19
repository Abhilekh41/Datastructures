package slidingwindow;

public class reverseString {

    public static void main(String[] args) {
        char[] array = new char[]{'h','e','l','l','o'};
        array = reverse(array);
        for(int i = 0; i<array.length; i++) {
            System.err.println(array[i]);
        }
    }

    public static char[] reverse(char[] array) {
        int l =0, r = array.length-1;
        while(l<r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;
            r--;
        }
        return array;
    }
    
}
