package xiang.test0722;

public class Parcle8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            @Override
            public int value() {
                return super.value()*47;
            }
        };
    }
    public static void main(String[] args) {
        Parcle8 p=new Parcle8();
        Wrapping w=p.wrapping(10);
    }
}
