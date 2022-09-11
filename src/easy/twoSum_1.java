package easy;

public class twoSum_1 {
    public static void main(String[] args) {

        int[] array = {3, 3};
        int[] results = twoSum(array, 6);
        System.out.println(results[0]);
        System.out.println(results[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;

                }
            }
        return ans;
    }

}
