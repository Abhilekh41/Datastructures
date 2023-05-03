package recursion;

class basic {

    // public static void main(String args[]) {
    // int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
    // int[] finalarray = reverseArray(arr);
    // System.out.println(fibonacci(8));
    // for (int i = 0; i < finalarray.length; i++) {
    // System.out.println(finalarray[i]);
    // }
    // }

    // print name 5 times
    public static void printName(int num) {
        if (num == 0) {
            return;
        } else {
            printName(num - 1);
            System.out.println("Developer");
        }
    }

    // print linearly from N to 1
    public static void printNto1(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            printNto1(n - 1);
        }

    }

    // summation of first N numbers
    public static int sumtoN(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumtoN(n - 1);
        }
    }

    // factorial of N
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // swap an array
    public static int[] reverseArray(int[] arr) {
        return swapArray(arr, 0, arr.length - 1);
    }

    private static int[] swapArray(int[] arr, int i, int j) {
        if (i == j || j < i) {
            return arr;
        } else {
            swapArray(arr, i + 1, j - 1);
            int ref = arr[i];
            arr[i] = arr[j];
            arr[j] = ref;
            return arr;
        }
    }

    // nth fibonacci number
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
