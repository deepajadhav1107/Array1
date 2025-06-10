public class ArrayScores {

    public static void arrayScores(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        int[] numbers = {50, 20};
        arrayScores(numbers);
    }
}
