public class ArrayScores {

    public static void arrayScores(int[] arr) {
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            sum += num;
            if(max>0)num=max;
            if(min<0)num=min;
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }

    public static void main(String[] args) {
        int[] numbers = {50, 20, 90, 30};
        arrayScores(numbers);
    }
}
