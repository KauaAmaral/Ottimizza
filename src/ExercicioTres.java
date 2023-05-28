public class ExercicioTres {
    public static int findMaxValue(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] array = {334, 568, 123, 796, 225};
        int max = findMaxValue(array);
        System.out.println("Max Value: " + max);
    }
}