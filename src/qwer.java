import java.util.Scanner;

public class qwer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a[] = null;
            a= new int[5];

            for(int k = 0; k < a.length; k++){
                int b = in.nextInt();
                a[k] = b;
            }
            for(int i = 0; i < a.length; i++){
                for(int j = i+1; j <a.length; j++){
                    if(a[i] == a[j]){
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
