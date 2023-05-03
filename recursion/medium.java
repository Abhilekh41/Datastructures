package recursion;

import java.util.ArrayList;
import java.util.List;

public class medium {
    public static void main(String args[]) {
        int[] arr = new int[] { 3, 1, 2 };
        noOfSubsequences(arr);
    }

    /**
     * subsequences
     * a sequences (contigous or non contigous sequence which follows the order)
     * a subarray can should be contigous, but a subsequence has to be contigous.
     * contigous means following an order.
     * example: {3,1,2}
     * possible sub-sequences
     * {}
     * {3}
     * {1}
     * {2}
     * {3,1}
     * {1,2}
     * {3,2}
     * {3,1,2}
     */
    // find all possible subsequences
    public static void possibleSubsequences(int[] arr) {
        List<Integer> emptylist = new ArrayList<>();
        subsequencer(0, emptylist, arr);
    }

    private static void subsequencer(int index, List<Integer> emptyArr, int[] arr) {
        if (index >= arr.length) {
            System.out.println(emptyArr);
            return;
        }
        emptyArr.add(arr[index]);
        subsequencer(index + 1, emptyArr, arr);
        emptyArr.remove(emptyArr.size() - 1);
        subsequencer(index + 1, emptyArr, arr);
    }

    // find all possible subsequences whose sum is a specific number
    public static void possibleSubsequencesForSum(int[] arr) {
        List<Integer> emptylist = new ArrayList<>();
        int sum = 3;
        subsequencerToSum(0, emptylist, arr, sum, 0);
    }

    private static void subsequencerToSum(int i, List<Integer> emptylist, int[] arr, int sum, int calculatedSum) {
        if (i >= arr.length) {
            if (sum == calculatedSum) {
                System.out.println(emptylist);
            }
            return;
        }
        emptylist.add(arr[i]);
        subsequencerToSum(i + 1, emptylist, arr, sum, calculatedSum + arr[i]);
        emptylist.remove(emptylist.size() - 1);
        subsequencerToSum(i + 1, emptylist, arr, sum, calculatedSum);
    }

    // find first subsequences whose sum is a specific number
    public static void firstSubsequencesForSum(int[] arr) {
        List<Integer> emptylist = new ArrayList<>();
        int sum = 3;
        subsequencerOfFirst(0, emptylist, arr, sum, 0);
    }

    private static boolean subsequencerOfFirst(int i, List<Integer> emptylist, int[] arr, int sum, int calculatedSum) {
        if (i >= arr.length) {
            if (sum == calculatedSum) {
                System.out.println(emptylist);
                return true;
            }
            return false;
        }
        emptylist.add(arr[i]);
        if (subsequencerOfFirst(i + 1, emptylist, arr, sum, calculatedSum + arr[i])) {
            return true;
        }
        emptylist.remove(emptylist.size() - 1);
        if (subsequencerOfFirst(i + 1, emptylist, arr, sum, calculatedSum)) {
            return true;
        }
        return false;
    }

    // no of subsequences whose sum is a specific number
    public static void noOfSubsequences(int[] arr) {
        List<Integer> emptylist = new ArrayList<>();
        int sum = 3;
        System.out.println(noSubsequencer(0, emptylist, arr, sum, 0));
    }

    private static int noSubsequencer(int i, List<Integer> emptylist, int[] arr, int sum, int calculatedSum) {
        if (i >= arr.length) {
            if (sum == calculatedSum) {
                return 1;
            }
            return 0;
        }
        emptylist.add(arr[i]);
        int l = noSubsequencer(i + 1, emptylist, arr, sum, calculatedSum + arr[i]);
        emptylist.remove(emptylist.size() - 1);
        int r = noSubsequencer(i + 1, emptylist, arr, sum, calculatedSum);
        return l + r;
    }
}
