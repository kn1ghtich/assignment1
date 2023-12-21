package helpers;

public class Calculus {
    private Calculus() {

    }

    public static double getMax(double[] arr) {
        if (arr.length == 0)
            return 0;

        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        return max;
    }

    public static double getSum(double[] arr) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }

        return sum;
    }
    public static double getAvg(double[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        return getSum(arr)/ arr.length;
    }
}
