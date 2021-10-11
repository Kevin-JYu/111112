import java.util.ArrayList;
import java.util.Collections;


public class Daycarenode1{
    public static void main(String[] args){
        ArrayList<Teacher> list = new ArrayList<>();
        Teacher t1 = new Teacher("周老师",30,5000.0);
        Teacher t2 = new Teacher("王老师",22,5500);
        Teacher t3 = new Teacher("周老师",22,5500.0);
        Teacher t4 = new Teacher("周老师",30,5500);
        //要求将t1 t2 t3三个老师装进集合里面
        Collections.addAll(list,t1,t2,t3);
        //要求删除t4
        //删除t4的操作 将集合里面的t3删掉
        list.remove(t4);
        System.out.println(list);
    }

}
class Teacher{
    String name;
    int age;
    double salary;
    public Teacher(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return name+" "+age+" "+salary;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null)return false;
        if(!(obj instanceof Teacher) )return false;
        if(obj==this)return true;
        return this.name.equals(((Teacher)obj).name)&&this.salary==((Teacher)obj).salary;
    }
}
