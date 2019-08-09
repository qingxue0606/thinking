package xiang.test0731;//: generics/Holder3.java

public class Holder3<T> {
  private T a;
  public void set(T a){
    this.a=a;
  }


  public T get(){
    return a;
  }
  public static void main(String[] args) {
      Holder3<Automobile> h=new Holder3<>();
      Automobile automobile=h.get();
      h.set(automobile);

  }

} ///:~
