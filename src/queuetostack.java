import java.util.Stack;

public class queuetostack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyQueue<Integer> queue=new MyQueue<>();
        queue.push(1);
        queue.push(2);
        queue.pop();
        queue.push(3);
        queue.pop();
        queue.pop();
    }
}

class MyQueue<ElementType>{
    private Stack<ElementType> s1=new Stack<ElementType>();
    private Stack<ElementType> s2=new Stack<ElementType>();

    public void push(ElementType value){
        if(s1.isEmpty()){
            s1.push(value); // s1空，元素进栈
        }else{
            while(!s1.isEmpty()) // s1不空
                s2.push(s1.pop()); // s1出栈，压入s2中
            s1.push(value); // 然后s1再进栈
            while(!s2.isEmpty()) // 当s2不空，
                s1.push(s2.pop());
        }
    }

    public void pop(){
        System.out.print(s1.pop()+" ");
    }
}
