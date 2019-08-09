package xiang.test0712;

public class Parcel1 {
    class Content{
        private int i =11;
        public int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label=whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public void ship(String dest){
        Content content=new Content();
        Destination destination=new Destination(dest);
        System.out.println(destination.readLabel());
    }
    public static void main(String[] args) {
        Parcel1 p=new Parcel1();
        p.ship("北京");
    }


}
