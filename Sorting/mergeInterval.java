import java.util.*;

class mergeInterval {

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                result.get(result.size() - 1)[1] =
                        Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        System.out.println("Merged Intervals:");

        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}