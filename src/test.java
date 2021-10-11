import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=br.readLine())!= null) {
            char ch[] = input.toCharArray();
            System.out.println(ch[0]);
            int[] count = new int[ch.length];
            int[] newcount = new int[ch.length];
            int min = 0;
            for(int i=0;i<ch.length-1;i++) {
                for(int j=i+1;j<ch.length;j++) {
                    if(ch[i]==ch[j]) {
                        count[i]++;
                        count[j]++;
                    }
                }
            }
            for(int i=0;i<count.length;i++) {
                newcount[i] = count[i];
            }
            Arrays.sort(count);
            for(int i=0;i<ch.length;i++) {
                if(newcount[i]>count[0]) {
                    System.out.print(ch[i]);
                }else {
                    continue;
                }
            }
            System.out.println("");
        }
    }
}
//删除个数最小数