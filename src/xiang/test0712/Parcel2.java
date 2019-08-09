package xiang.test0712;

public class Parcel2 {
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
        Parcel2.Content content=new Parcel2.Content();
        Parcel2.Destination destination=new Parcel2.Destination(dest);
        System.out.println(destination.readLabel());
    }
    public Destination to(String s){
        return  new Destination(s);
    }
    public Content content(){
        return new Content();
    }


    public static void main(String[] args) {
        Parcel2 p=new Parcel2();
        p.ship("北京");

        Parcel2.Content content=p.content();
        Parcel2.Destination destination=p.to("上海");

    }



}
