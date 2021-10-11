import java.util.ArrayList;
import java.util.List;



public class Daycareindexof{
    public static void main(String []args){
        String a = "a",b = "b",c = "c",d = "d",apple = "apple";
        List<String> list = new ArrayList<String>();
        list.add(a);
        list.add(apple);
        list.add(b);
        list.add(apple);
        list.add(c);
        list.add(apple);
        list.add(d);
        System.out.println(list);
        System.out.println("apple第一次出现的索引位置是："+list.indexOf(apple));
        System.out.println("apple第一次出现的索引位置是："+list.lastIndexOf(apple));
        System.out.println("b第一次出现的索引位置是："+list.indexOf(b));
        System.out.println("b最后一次出现的索引位置是："+list.lastIndexOf(b));

        list.add("保护环境");  //向列表中添加数据
        list.add("爱护地球");  //向列表中添加数据
        list.add("从我做起");  //向列表中添加数据
        list.add(1,"从我做起");  //在第1+1个元素的位置添加数据
        for(int i=0;i<list.size();i++){  //通过循环输出列表中的内容
            System.out.println(i+":"+list.get(i));
        }
    }
}