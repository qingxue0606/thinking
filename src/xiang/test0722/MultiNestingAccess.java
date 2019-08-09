package xiang.test0722;//: innerclasses/MultiNestingAccess.java
// Nested classes can access all members of all
// levels of the classes they are nested within.

class MNA {
  private void f() {
    System.out.println("mna f");
  }
  class A {
    private void g(){}
    private void f(){
      System.out.println("mna a f");
    }
    public class B{
      void  h(){
        g();
        MNA.this.f();
      }
    }

  }
}	

public class MultiNestingAccess {
  public static void main(String[] args) {
    MNA mna=new MNA();
    MNA.A a=mna.new A();
    MNA.A.B b=a.new B();
    b.h();
  }
} ///:~
