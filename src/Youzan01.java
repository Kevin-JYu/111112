import java.util.*;

public class Youzan01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int casenum = sc.nextInt(); // n个case
            int value = sc.nextInt(); // 值的大小
            int valum = sc.nextInt(); // 背包空间大小
            int[] vl = new int[value]; // 石头值的的数组
            int[] vm = new int[value]; // 石头背包空间的数组
            for(int i = 0; i < value; i++){
                vl[i] = sc.nextInt();
            }
            for(int i = 0; i < value; i++){
                vm[i] = sc.nextInt();
            }
            maxbonevalue(vm, valum);

        }
    }
    public static void maxbonevalue(int[] value, int valum){
        int[] v= value;
        Arrays.sort(v);
        //直接先给雪糕价钱数组排个序
        int count = 0;
        //记录可以买雪糕数
        for(int i = 0; i < value.length; i++){
            //贪心：从总的钱里从小到大一次减去每根雪糕钱数
            //直到钱数小于单支雪糕数退出循环
            int cost = v[i];
            if (valum >= cost){
                valum -= cost;
                count++;
            } else{
                break;
            }
        }
        for (int i = 0; i < count; i++){
            for(int j = 0; j<value.length;j++){
                if(value[i]==v[i]);
            }
        }
        //返回可买雪糕数，这题中等？？？太离谱了
    }
}
