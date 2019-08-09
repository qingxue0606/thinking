package xiang.test0708;


import static  net.mindview.util.Print.*;



class Cleanser{
    private String s="Cleanser";
    public void append(String a){s+=a;}
    public void dilute(){append("dilute()");}
    public void apply(){append("apply()");}
    public void scrub(){append("scrub()");}

    @Override
    public String toString() {
        return s;
    }
    public static void main(String[] args) {
        Cleanser cleanser=new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        print(cleanser);

    }
}



public class Detergent extends Cleanser {

    @Override
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();
    }
    public void foam(){append("foam()");}

    public static void main(String[] args) {
        Detergent detergent=new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        print(detergent);
        print("------------");
        Cleanser.main(args);

    }
}
