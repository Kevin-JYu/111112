import java.math.BigInteger;
import java.util.Scanner;

//实现大数的简单进制转换
public class jinzhi10to2 {
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext())//相当于EOF
        {
            String str=cin.nextLine();
            BigInteger a=new BigInteger(str,10);//将string转换为10进制
            System.out.println(a.toString(2));//将a转换为2进制
        }
        cin.close();
    }
}
// 将一个长度最多为30位数字的十进制非负整数转换为二进制数输出。
//输入描述:
//
//多组数据，每行为一个长度不超过30位的十进制非负整数。
//（注意是10进制数字的个数可能有30个，而非30bits的整数）
//输出描述:
//
//每行输出对应的二进制数。
//示例1
//输入
//
//0
//1
//3
//8
//输出
//
//0
//1
//11
//1000
