import java.util.ArrayList;
import java.util.Iterator;

public class Daycarenode5{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("天王盖地虎[45]少盐");
        list.add("斩青龙[18]多放蒜");
        list.add("辣椒炒肉[23]不放肉");
        list.add("西红柿鸡蛋汤[20]放两个鸡蛋");
        list.add("米饭[2]8");
        //向厨师展示信息：
        //菜名字 ：菜要求
        //由于今天西红柿断货 所有和西红柿有关的菜全部删除
        //由于出门钱带的不多 删除价格>30的菜
        //计算这顿饭花费多少钱
        for(String str:list){
            int a=str.indexOf("[");
            int b=str.indexOf("]");
            String str1=str.substring(0,a);
            String str2=str.substring(b+1);
            String str3=str1+" "+str2;
            System.out.println(str3);
        }
        for(Iterator<String> car=list.iterator();car.hasNext();){
            String a=car.next();
            if(a.contains("西红柿")){
                car.remove();
            }
        }
        System.out.println(list);
        for(Iterator<String> car = list.iterator(); car.hasNext();){
            String g=car.next();
            int s=g.indexOf("[");
            int d=g.indexOf("]");
            String str5=g.substring(s+1,d);
            int a=Integer.parseInt(str5);
            if(a>30){
                car.remove();
            }
        }
        System.out.println(list);
        int sum=0;
        for(Iterator<String> car=list.iterator();car.hasNext();){
            String h=car.next();
            int q=h.indexOf("[");
            int w=h.indexOf("]");
            String str5=h.substring(q+1,w);
            int e=Integer.parseInt(str5);
            if(e==2){
                e=2*8;
            }
            sum+=e;
        }
        System.out.println("一共花了"+sum);
    }
}
