package xiang.test0719;

public class Parcel3 {
    class Contents{
        private int i=11;
        public  int value (){return  i;}
    }
    class Destionation{
        private String label;
        Destionation(String whereTo){
            label=whereTo;
        }
        String readLabel(){return label;}
    }
    public static void main(String[] args) {
        Parcel3 p=new Parcel3();
        Parcel3.Destionation destionation =p.new Destionation("xiang");
        Parcel3.Contents contents=p.new Contents();

    }
}
