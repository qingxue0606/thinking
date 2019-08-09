package xiang.test0719;

public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }
    public static void main(String[] args) {


        //外部得到内部类的方法
        DotThis dotThis=new DotThis();
        dotThis.f();

        DotThis.Inner inner=dotThis.inner();
        DotThis dotThis1=inner.outer();
        dotThis1.f();
        System.out.println(dotThis==dotThis1);

        DotThis.Inner inner1=dotThis.new Inner();
        DotThis dotThis2=inner1.outer();

        System.out.println(dotThis2==dotThis);


    }
}
