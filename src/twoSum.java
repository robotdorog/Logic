import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        // int[] num = {1, 2, 3, 4, 5};
        int[] num = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Индексы элементов, сумма которых равна искомому значению: " + Arrays.toString(twoSum(num, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                sum = nums[i] + nums[j];
                if (sum == target) {

                    System.out.println("Сумма элементов массива " + nums[i] + " и " + nums[j] + " равна искомому значению " + sum);
                    result[0] = i;
                    result[1] = j;
                    return result;

                }
            }
        }
        return result;
    }
}