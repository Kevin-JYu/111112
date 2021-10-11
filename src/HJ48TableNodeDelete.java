import java.util.ArrayList;
import java.util.Scanner;

public class HJ48TableNodeDelete{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int num = sc.nextInt(); // 节点个数num
            int firstNode = sc.nextInt(); // 头结点firstNode

            ArrayList<Integer> list = new ArrayList<>();
            // 创建泛型对象: ArrayList<泛型> list=new ArrayList<>();

            list.add(firstNode); // 添加元素:一次添加一个元素: list.add(元素);
            // 一次添加多个元素: Collections.addAll(集合，元素，元素，...);
            // 得到集合元素的个数: list.size();
            // 得到某一个元素: list.get(下标);
            // 判断集合里面是否出现指定元素: list.contains();

            // 遍历:for+下标
            // for(int x=0;x<list.size();x++){
            //    //x->下标
            //    //list.get(元素);
            // }
            //     foreach
            // for(集合的泛型 x :list){
            //    //x->元素
            // }
            //     迭代器********（重点）
            //for(得到迭代器对象;判断迭代器上面是否还有下一个元素;){
            //				取出下一个元素
            //			  }
            //
            //for(Iterator<泛型>car=list.iterator();car.hasNext;){
            //    car.next();->元素
            //}
            for(int i=0;i<num-1;i++){
                int Node1 = sc.nextInt();			// 要插入的节点
                int Node2 = sc.nextInt();			// 插入在哪个节点之后
                int index = list.indexOf(Node2);    // Node2第一次出现的索引位置
                list.add(index+1,Node1);      // 将Node1插入到Node2之后
            }
            Object deleteNode = sc.nextInt(); // 6 2 1 2 3 2 5 1 4 5 7 2 2 (7 3 1 5 4 )Object删除的是值 int删除的是位置

            // 5 2 3 2 4 3 5 2 1 4 3

            list.remove(deleteNode); // ArrayList 删除元素:list.remove(int 下标);
                                     // 下标指向谁就删除谁，如果下标不存在就抛出异常。
                                     // 清空集合：list.clear();
                                     // list.remove(元素->参照物);指定元素进行删除，一个remove只能删除一个对象。
            // System.out.print(list.size()+" "); 6 2 1 2 3 2 5 1 4 5 7 2 2
            //5 7 3 1 5 4

            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }

        }
        sc.close(); // 内存小时间快
    }
}
// 1:ArrayList类里面的remove(元素)的方法
//		底层需要尊重equals比较机制
//
//		当我们想要删除一个元素的时候 底层拿着这个元素
//		和集合里面的每一个元素做equals比较
//
//2:谁主张谁举证
//		要被删除的对象会主动调用他自己类的equals方法
//		和集合里面的每一个元素做比较
//
//3:当我们使用迭代器遍历集合的过程中 不允许对集合
//		的整体进行添加、删除操作 否则出发CME异常
//
//		如果想要在遍历的过程中进行删除
//		只能使用迭代器的删除方法：car.remove();
//
//4:构造方法：
//		ArrayList list = new ArrayList(int 数组空间大小);
//		ArrayList list = new ArrayList();//数组默认开辟10块空间
//
//		集合会自动扩容：
//			jdk6.0及之前	x * 3 / 2 + 1
//							10 -> 16 -> 25....
//
//			jdk7.0及之后	x + (x >> 1)
//							10 -> 15 -> 22....
//
//		在项目开发的时候 尽量避免扩容：
//			1：创建一个更大的新的数组对象
//			2：将老数组里面的元素复制到新数组里面
//			3：改变引用指向
//			4：回收老数组对象
//			5：继续添加元素
//
//		扩容：list.ensureCapacity(数组空间)
//		缩容：list.trimToSize()
//
//*****
//Vector语法和ArrayList一模一样的
//*********************
//面试题：
//ArrayList和Vector之间的区别？
//1:同步特性不同
//Vector同一时间允许一个线程进行访问，效率较低，但是不会发生并发错误。
//ArrayList同一时间允许多个线程进行访问，效率高，但是可能会发生并发错误。
//***********************
//jdk5.0开始 集合的工具类[Collections]里面提供一个方法synchronizedList
//	   可以将线程不安全的ArrayList集合变成线程安全的集合对象
//	   于是Vector渐渐被淘汰了
//2：扩容不同
//ArrayList:分版本
//		jdk6.0及之前	x * 3 / 2 + 1
//		jdk7.0及之后	x + (x >> 1)
//
//Vector:分构造方法
//		Vector(10) -> 2倍扩容	10 -》 20 -》 40...
//		Vector(10,3) -> 定长扩容 10 -》 13 -》 16...
//
//3:出现的版本不同
//	  Vector:since jdk1.0
//	  ArrayList:since jdk1.2
// **************************************
// LinkedList语法和ArrayList一模一样
//	面试题：
//    ArrayList和LinkedList之间的区别？
//     ArrayList和LinkedList底层数据结构不同 导致优劣势不同
//     ArrayList：底层是基于数组实现的
//    优点：随机访问 遍历查找效率高
//    缺点：添加删除元素的时候效率低
//     LinkedList：底层是基于链表实现的
//
//     优点：添加删除元素的时候效率高。
//     缺点：随机访问 遍历查找效率低[从下标0开始找起]
//**************************
//Stack: 用数组模拟栈结构

