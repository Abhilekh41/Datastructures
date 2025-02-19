package slidingwindow;

import java.util.ArrayList;
import java.util.List;

class IntersactionOfArrays {
    
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] num2 = new int[]{2,2};

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int[] hashtable = new int[1000];
        for(int i = 0; i<nums1.length;i++) {
            hashtable[nums1[i]] = 1;
        }
        for(int i = 0; i<nums2.length;i++) {
            if(hashtable[nums2[i]]>0) {
                list.add(nums2[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).distinct().toArray();
    }
}
