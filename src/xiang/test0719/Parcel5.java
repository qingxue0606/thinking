package xiang.test0719;

public class Parcel5 {
    //方法中定义的内部类
    public Destination destination(String s){
        class PDestions implements Destination{
            private String label;
            PDestions(String whereTO){
                label=whereTO;
            }
            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestions(s);
    }


    public static void main(String[] args) {
        Parcel5 parcel5=new Parcel5();
        Destination destination=parcel5.destination("xiang");
    }

}
