class CapacityToShipPackages {

    public static int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;
        
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            int requiredDays = 1;
            int currentWeight = 0;

            for (int weight : weights) {

                if (currentWeight + weight > mid) {
                    requiredDays++;
                    currentWeight = 0;
                }

                currentWeight += weight;
            }

            if (requiredDays <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        System.out.println("Minimum Capacity = " + shipWithinDays(weights, days));
    }
}