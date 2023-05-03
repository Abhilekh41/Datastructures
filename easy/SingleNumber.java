class SingleNumber {

    public static int singleNumber(int[] nums) {
        int uniqNum = 0;
        for (int idx : nums) {
            // Concept of XOR...
            uniqNum = uniqNum ^ idx;
            System.out.print(uniqNum);
        }
        return uniqNum;
    }
}