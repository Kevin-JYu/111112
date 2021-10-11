import java.util.Arrays;

public class test5 {
    public static void main(String[] args) {
        int[] nums = {100,0,2,99,5,3,4,7};
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

        int min = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != nums[i+1]+1){
                System.out.println(nums[i] + ",");
                max = i;
            }

            if(nums[i] == nums[i+1]+1){
                min = i;
            }
            System.out.println(min + "->" + max);
        }
    }
}
//给定一个无重复元素的整数数组 nums
//返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。
//输入：nums = [100,0,2,99,5,3,4,7]
//输出：["0","2->5","7","99->100"]
//解释：区间范围是：
//[0,0] --> "0"
//[2,5] --> "2->5"
//[7,7] --> "7"
//[99,100] --> "99->100"
//
//0 <= nums.length <= 20
//-2^31 <= nums[i] <= 2^31 - 1
//nums 中的所有值都 互不相同