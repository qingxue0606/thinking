package xiang.test0722;

import xiang.test0719.Destination;

public class Parcel10 {
    public Destination destination(String dest ,final float price){
        return new Destination() {
            private int cost;


            {
                cost=Math.round(price);
                if(cost>100){
                    System.out.println("over budget!");
                }
            }
            private String label=dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }
    public static void main(String[] args) {
        Parcel10 p=new Parcel10();
        Destination d=p.destination("xiagn",101.365f);
    }

}
