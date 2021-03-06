/*
@author Jon Biolette
@date 03/19/2022
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 3;
        //nums[3] = 15;
        int target = 6;

        System.out.println(twoSum(nums, target).toString());
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    pair[0] = i;
                    pair[1] = j;
                    break;
                }
            }
        }
        return pair;
    }
}
