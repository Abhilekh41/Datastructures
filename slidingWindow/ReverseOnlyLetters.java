package slidingwindow;

class ReverseOnlyLetters {

    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        System.out.println("Test1ng-Leet=code-Q!");
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s) {
        char[] str = s.toCharArray();
        int l = 0;
        int r = str.length-1;
        while(l<r) {
            if(!Character.isLetter(str[l])) {
                l++;
                continue;
            }
            if(!Character.isLetter(str[r])) {
                r--;
                continue;
            }
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        return String.valueOf(str);
    }
}