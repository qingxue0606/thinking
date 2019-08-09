package xiang.test0722;//: innerclasses/InheritInner.java
// Inheriting an inner class.

class WithInner {
  class Inner { }
}


class A extends WithInner{
   class B extends WithInner.Inner{
     
   }
}

public class InheritInner extends WithInner.Inner {
  //! InheritInner() {} // Won't compile
  InheritInner(WithInner wi ) {
    wi.super();
  }



  public static void main(String[] args) {
    WithInner wi = new WithInner();
    InheritInner ii = new InheritInner(wi);
  }
} ///:~
