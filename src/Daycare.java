import java.util.*;
public class Daycare{
    public static void main(String[] args){
        //ArrayList  Collections.addAll(集合,元素,....)
        //创建一个集合对象装名字
        ArrayList<String> list=new ArrayList<>();
        //一次添加一个元素的方式：添加：Andy   Lee
        Collections.addAll(list,"Andy","Lee");
        //统计集合里面有几个人的姓名
        System.out.println("人的个数："+list.size());
        //打印第一个人的姓名
        System.out.println("第一个人的名字："+list.get(0));
        //判断集合里面是否出现Lee的名字
        System.out.println(list.contains("Lee"));
        //使用两种不同的方式打印 所有以A开头的名字
        for(String name:list){
            if(name.charAt(0)=='A'){
                System.out.println(name);
            }
        }
        for(String name:list){
            if(name.startsWith("A")){
                System.out.println(name);
            }
        }
        //用迭代器
        for(Iterator<String> car=list.iterator();car.hasNext();){
            String name=car.next();
            if(name.startsWith("A")){
                System.out.println(name);
            }

        }
    }
}
