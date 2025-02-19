package slidingwindow;

public class ReverseVowels {
    
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowel(s));

    }

    private static String reverseVowel(String s) {
        char[] str = s.toCharArray();
        int l = 0;
        int r = str.length-1;
        while(l<r) {
            if(str[l]!='a' && str[l]!='e' && str[l]!='i' && str[l]!='o' && str[l]!='u' && str[l]!='A' && str[l]!='E' && str[l]!='I' && str[l]!='O' && str[l]!='U') {
                l++;
                continue;
            }
            if(str[r]!='a' && str[r]!='e' && str[r]!='i' && str[r]!='o' && str[r]!='u' && str[r]!='A' && str[r]!='E' && str[r]!='I' && str[r]!='O' && str[r]!='U') {
                r--;
                continue;
            }
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            r--;
            l++;
        }
        return String.valueOf(str);
    }
}
