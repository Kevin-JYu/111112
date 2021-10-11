import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



class Node{  //写一个节点类
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
public class treebianli {
    public static Node buildTree(){   //构造出一棵树
        Node a = new Node('A');   //创建树的结点
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');

        a.left = b;      //把各个结点按照树的结构链接起来
        a.right = c;
        b.left = d;
        b.right = e;
        return a;  //返回树的根节点
    }
    public static void preOrder(Node root){   //树的先序遍历
        if(root == null){   //如果是空树就返回
            return;
        }
        System.out.print(root.val + " ");  //访问当前根结点的值
        preOrder(root.left);  //递归访问访问左子树
        preOrder(root.right); //递归访问右子树
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " " );
    }
    public static List<List<Character>> levelOrder(Node root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Character>> res = new ArrayList<>(); //创建一个二维List内部List用来存储每层的数据
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();  //每次循环获取到的size为上次循环新进入的结点
            List<Character> list = new ArrayList<>();
            while(count > 0){
                Node node = queue.poll();
                list.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
                count--;
            }
            res.add(list);
        }
        return res;
    }
    public static void main(String[] args) {
        Node tree = buildTree();//调用构造树方法
        System.out.println("先序遍历：");
        preOrder(tree);
        System.out.println();
        System.out.println("中序遍历：");
        inOrder(tree);
        System.out.println();
        System.out.println("后序遍历：");
        postOrder(tree);
        System.out.println();
        System.out.println("层序遍历:");
        List<List<Character>> list = levelOrder(tree) ;
        System.out.println(list);
    }
}