import java.util.ArrayList;
import java.util.Collections;


public class Daycarenode2{
    public static void main(String[] args){
        //老筐 里面装的水果 有些重复的
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,56,77,77,90,56,28);
        ArrayList<Integer>list1=new ArrayList<>();
        //将重复元素去除
        for(Integer i:list){
            if(!(list1.contains(i))){
                list1.add(i);
            }
        }
        System.out.println(list1);
    }
}
