package xiang.test0726;
class B{
    int num;
}
public class A {

    public static B changge(B b){
        b.num=1;
        return b;
    }
    public static void main(String[] args) {

        B b=new B();
        b.num=0;
        B b1=  changge(b);
        System.out.println(b.num);
        System.out.println(b==b1);


    }
}
