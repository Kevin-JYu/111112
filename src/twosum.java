public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0] = i;
                    a[1] = j;
                    //return new int[] {i,j};
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] b = {1, 5, 6, 7, 15};
        int tar = 12;

        int[] c = twoSum(b, tar);
        for(int i=0;i<c.length;i++) {
            System.out.println(c[i]);
        }
    }
}
