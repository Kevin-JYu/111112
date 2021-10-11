import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Daycarenode3{
    public static void main(String[] args){
        ArrayList<Food> list = new ArrayList<>();
        Food f1 = new Food("凉拌黃瓜",18,"凉菜");
        Food f2 = new Food("皮蛋豆腐",22,"凉菜");
        Food f3 = new Food("辣椒炒肉",28,"热菜");
        Food f4 = new Food("凉拌海带",19,"凉菜");
        Food f5 = new Food("小鸡炖蘑菇",45,"热菜");
        // Food f6 = new Food("小鸡炖蘑菇",45,"l菜");
        //将所有的菜全部装进集合里面
        Collections.addAll(list,f1,f2,f3,f4,f5);
        //由于天气太冷了 删除集合里面的第三道凉菜
        int count=0;
        for(Iterator<Food> car = list.iterator(); car.hasNext();){
            Food f=car.next();
            if(f.type.equals("凉菜")){
                count++;
                /**
                 if(count==3){
                 car.remove();
                 }
                 */
            }
            if(count==3){
                car.remove();
                break;
            }
        }

        //最终打印集合对象 显示
        //[凉拌黄瓜:凉菜,皮蛋豆腐:凉菜,辣椒炒肉:热菜,小鸡炖蘑菇:热菜]

    }
}
class Food{
    String name;
    double price;
    String type;
    public Food(String name,double price,String type){
        this.name=name;
        this.price=price;
        this.type=type;
    }
}
