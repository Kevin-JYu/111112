import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//快慢指针法
public class HJ51{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str = br.readLine()) != null){
            int n = Integer.parseInt(str);
            String[] params = br.readLine().split(" ");
            Node head = new Node(Integer.parseInt(params[0]));
            Node temp1 = head;
            for(int i = 1; i < n; i++){
                temp1.next = new Node(Integer.parseInt(params[i]));
                temp1 = temp1.next;

            }
            int re = Integer.parseInt(br.readLine());
            Node temp = head;
            int count = 0; // 顺序下标，倒数第K个节点 = 总个数 - 顺序下标
            while(count != n - re && temp != null){
                temp = temp.next;
                count++;
            }
            if(temp == null){
                System.out.println(0);
            }else{
                System.out.println(temp.val);
            }

        }
    }
}