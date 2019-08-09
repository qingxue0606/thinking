package xiang.test0712;
import static  net.mindview.util.Print.*;

interface Processor {
     String name();
    Object process(Object input);
}



class Base{
    public String name() {
        return getClass().getSimpleName();
    }
}

class Upcase extends Base implements Processor {




    @Override
    public String process(Object input){
        return  ((String)input).toUpperCase();
    }
}


class Downcase  extends Base implements Processor {


    @Override
    public String process(Object input){
        return  ((String)input).toLowerCase();
    }
}



public class Apply{
    public static void  process(Processor processor,Object s){
        print( "Using Processor "+ processor.name());
        print(processor.process(s));
    }
    public static String s="Xiang qing Xue";
    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
    }
}









