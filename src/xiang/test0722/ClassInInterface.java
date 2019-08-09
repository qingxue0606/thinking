package xiang.test0722;//: innerclasses/ClassInInterface.java
// {main: ClassInInterface$Test}

public interface ClassInInterface {
  void howdy();
  class Test implements ClassInInterface {

    @Override
    public void howdy() {
      System.out.println("Hoedy");
    }
    public static void main(String[] args) {
        new Test().howdy();
    }
  }
} /* Output:
Howdy!
*///:~
