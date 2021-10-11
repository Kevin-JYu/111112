import java.util.Scanner;

public class lc1143two {
    public static void Print(int i, int j, char a[], int d[][])
    {
        if(i == 0 || j == 0)
            return;
        if(d[i][j] == 1){
            Print(i - 1, j - 1, a, d);
            System.out.print(a[i - 1]);
        }
        else if(d[i][j] == 2)
            Print(i - 1, j, a, d);
        else
            Print(i, j - 1, a, d);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        char a[] = new char[1000];
        char b[] = new char[1000];
        a = cin.next().toCharArray();
        b = cin.next().toCharArray();
        int l1 = a.length;
        int l2 =b.length;
        int c[][] = new int [l1+1][l2+1];
        int d[][] = new int [l1+1][l2+1];
        //边界处理
        c[0][0] = 0;
        for(int i = 1; i <= l1; i++)
            c[i][0] = 0;
        for(int i = 1; i <= l2; i++)
            c[0][i] = 0;
        //以下是动态求解的过程
        for(int i = 1; i <= l1; i++)
            for(int j = 1; j <= l2; j++)
            {
                if(a[i-1] == b[j-1])
                {
                    c[i][j] = c[i - 1][j - 1] +1;
                    d[i][j] = 1;  //标记，用于构造子序列
                }
                else if(c[i][j - 1] < c[i - 1][j])
                {
                    c[i][j] = c[i - 1][j];
                    d[i][j] = 2;
                }
                else
                {
                    c[i][j] = c[i][j - 1];
                    d[i][j] = 3;
                }
            }
        Print(l1, l2, a, d);
        cin.close();
    }
}
//给出两个字符串A B，求A与B的最长公共子序列（子序列不要求是连续的）。
//比如两个串为：
//
//abcicba
//abdkscab
//
//ab是两个串的子序列，abc也是，abca也是，其中abca是这两个字符串最长的子序列。
//Input
//第1行：字符串A
//第2行：字符串B
//(A,B的长度 <= 1000)
//Output
//输出最长的子序列，如果有多个，随意输出1个。
//Input示例
//abcicba
//abdkscab
//Output示例
//abca
//
