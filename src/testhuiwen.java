import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class testhuiwen{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = br.readLine())!=null && str.length()!=0){
            char[] chars = str.toCharArray();
            int n = chars.length;
            int max = 1;

            for(int i = 0; i < n-1; i++){//奇
                int left = i - 1;
                int right = i + 1;
                int length = 1;
                while(left>=0 && right<n && chars[left]==chars[right]){
                    length += 2;
                    left--;
                    right++;
                }
                max = max > length ? max : length;
            }
            for(int i = 0; i < n-1; i++){//偶
                int length = 1;
                if(chars[i]==chars[i+1]){
                    length = 2;
                }else
                    continue;

                int left = i - 1;
                int right = i + 2;
                while(left>=0 && right<n && chars[left]==chars[right]){
                    length += 2;
                    left--;
                    right++;
                }
                max = max > length ? max : length;
            }
            System.out.println(max);
        }
    }
}