package xiang.test0719;

public class Parcel6 {
    //作用域的内部类

    private void internalTracking(boolean b){
        if(b){
            class TrackingShip{
                private String id;
                TrackingShip(String s){
                    id=s;
                }
                String getSlisp(){return id;}
            }
            TrackingShip trackingShip=new TrackingShip("s");
            String s= trackingShip.getSlisp();

        }else {
            //这里不能创建对象了
        }
    }
    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel6=new Parcel6();
        parcel6.track();
    }

}
