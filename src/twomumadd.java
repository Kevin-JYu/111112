//ListNode链表类定义
class ListNode{
    int val;
    ListNode nextNode;
    ListNode(int val){
        this.val=val;
        this.nextNode=null;
    }
}
public class twomumadd {
    //两逆序存储的链表相加
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;//将x设为节点pp的值,如果pp已经到达l1的末尾，则将其值设置为0。
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;//得到节点的和
            carry = sum / 10;//存在进位则置1
            curr.nextNode = new ListNode(sum % 10);//将sum的个位数添加至下一节点
            curr = curr.nextNode;//curr后移至下一节点，同c中的curr=curr->next
            if (p != null)
                p = p.nextNode;
            if (q != null)
                q = q.nextNode;
        }

        if (carry > 0) {
            curr.nextNode = new ListNode(carry);
        }//如果最后存在进位，则追加节点1

        /*dummyHead=dummyHead.nextNode;
        printList(dummyHead);
        return dummyHead; */

        return dummyHead.nextNode;
    }
    // 遍历输出链表
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.nextNode;
        }
        System.out.println();
    }
    //初始化链表
    public static ListNode buildListNode(int[] input){
        ListNode first = null,last = null,newNode;
        if(input.length>0){
            for(int i=0;i<input.length;i++){
                newNode=new ListNode(input[i]);
                newNode.nextNode=null;
                if(first==null){
                    first=newNode;
                    last=newNode;
                }
                else{
                    last.nextNode=newNode;
                    last=newNode;
                }
            }
        }
        return first;
    }

    //主方法
    public static void main(String [] args){
        int[] input=new int[]{2,4,3};
        ListNode listNode1=buildListNode(input);
        int[] input2=new int[]{5,6,4};
        ListNode listNode2=buildListNode(input2);
        ListNode listNode3=addTwoNumbers(listNode1,listNode2);
        printList(listNode3);
    }
}