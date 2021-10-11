public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){

        if(low>high){ // 如果low>high则退出
            return;
        }

        int i=low; // i从数组最左端向右查找比基准数大的值
        int j=high; // j数组最右端向左查找比基准数小的值
        int temp = arr[low]; // temp就是基准数，首先基准数设置为数组最左边的值

        while (i<j) {
            while (temp<=arr[j]&&i<j) { // 先看右边，依次往左递减
                j--;
            }
            while (temp>=arr[i]&&i<j) { // 再看左边，依次往右递增
                i++;
            }
            if (i<j) { // 如果满足i<j条件则交换ij位置
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
//*/
        arr[low] = arr[i]; // 最后将基准数与i和j相等的位置的数字交换
        arr[i] = temp;

        quickSort(arr, low, j-1); // 递归调用处理基准数左半数组
        quickSort(arr, j+1, high); // 递归调用处理基准数右半数组
    }

    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19}; // 创建数组arr
        quickSort(arr, 0, arr.length-1); // 调用快速排序函数quickSort，入参为数组arr、低位、高位
        for (int i = 0; i < arr.length; i++) { // 输出已排序数组
            System.out.print(arr[i]+" "); // System.out.println(arr[i]);
        }
    }
}