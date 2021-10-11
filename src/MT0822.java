import java.util.*;

public class MT0822{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt(); // n个数
            int[] a = new int[n]; //n个数的数组
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int b = sc.nextInt(); // b组询问
            int[] c = new int[b*3]; // c组问询数组
            for(int i = 0; i < c.length; i++){
                c[i] = sc.nextInt();
            }

            for (int i = 0; i < b*3; i=i+3){
                if(c[i] == 1){ // 问询1
                    int num = 0;
                    for(int j = c[i+1]; j <= c[i+2]; j++){
                        num = num + a[j-1];
                    }
                    System.out.println(num);
                } else if(c[i] == 2){ // 问询2
                    int num1 = 0;
                    int num2 = 0;
                    for(int j = c[i+1]; j <= c[i+2]; j++){
                        num1 = num1 + a[j-1];
                    }
                    for(int j = c[i+1]; j <= c[i+2]; j++){

                        num2 = num2 + (num1 - a[j-1])*(num1 - a[j-1]);
                    }
                    System.out.println(num2);
                } else if(c[i] == 3){ // 问询3
                    int max = 0;
                    for(int j = c[i+1]; j < c[i+2]; j++){
                        if(a[j] > max){
                            max = a[j];
                        }
                    }
                    System.out.println(max);
                }
            }
        }
    }
}
