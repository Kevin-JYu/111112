
import java.util.*;
public class Daycarenode4{
    public static void main(String[] args){
        String str = "张三:66 李四:82 王五:59 张三丰:77";
        //将班级总分算出来
        int sum=0;
        String[]str1=str.split(" ");
        for(String x:str1){
            String[]str2=x.split(":");
            int a=Integer.parseInt(str2[1]);
            sum+=a;
        }
        System.out.println(sum);
        //统计有几个人的成绩 > 平均分
        int count=0;
        for(String x:str1){
            String[]str2=x.split(":");
            int a=Integer.parseInt(str2[1]);
            if(a>(sum/str.length())){
                count++;
            }
        }
        System.out.println(count+"个");
        //打印最高分和他的名字
        int max=0;
        String name=" ";
        for(String x:str1){
            String[]str2=x.split(":");
            int a=Integer.parseInt(str2[1]);
            if(a>max){
                max=a;
                name=x;
            }
        }
        System.out.println("姓名："+name+"分数："+max);
    }
}


