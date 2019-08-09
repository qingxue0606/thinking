package xiang.test0719;

public class Parcel4 {
    private class PContents implements Contents{
        private  int i=11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestions implements Destination{
        private String label;
        PDestions(String whereTO){
            label=whereTO;
        }
        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s){
        return  new PDestions(s);
    }
    public Contents contents(){
        return  new PContents();
    }
    public static void main(String[] args) {
        Parcel4 parcel4=new Parcel4();
        Contents contents=parcel4.contents();
        Destination destination=parcel4.destination("xiang");
    }




}
