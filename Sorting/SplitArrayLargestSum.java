    class SplitArrayLargestSum {

    public static int splitArray(int[] nums, int k) {

        int left = 0;
        int right = 0;

        // left = maximum element
        // right = sum of all elements
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            int subArrays = 1;
            int currentSum = 0;

            for (int num : nums) {

                if (currentSum + num > mid) {
                    subArrays++;
                    currentSum = 0;
                }

                currentSum += num;
            }

            if (subArrays <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        System.out.println("Minimum Largest Sum = " + splitArray(nums, k));
    }
}