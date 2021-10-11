import java.util.*;

public class JD2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        while(sc.hasNext()){
            int[] a = new int[n*2];
            for(int i = 0; i < n*2; i++){
                a[i] = sc.nextInt();
                if(a[i] == 1 && a[i-1]>=max){
                    max = a[i-1];
                    if(i==1)
                        min = a[i-1];
                } else if(a[i]==1 && a[i-1]<=min) {
                    min = a[i-1];
                }
            }
            for(int j = 0; j < n*2; j++){
                if(a[j] == 0 && a[j-1]<max && a[j-1]>min){
                    num++;
                }
            }
            System.out.println(num+2);
        }
    }
}
// https://blog.csdn.net/Ljunyu/article/details/119847121?spm=1001.2014.3001.5501