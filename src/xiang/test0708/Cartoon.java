package xiang.test0708;
import static  net.mindview.util.Print.*;


class Art{
    Art(int i){
        print("Art constructor");
    }
}

class Drawing extends Art{

    Drawing(int i){
        super(i);

        print("Drawing constructor");
    }
    public void paly(){
        print("Drawing");
    }

}





public class Cartoon  extends  Drawing{

    Cartoon(int i){
        super(i);
        print("Cartoon constructor");
    }

    @Override
    public void paly() {
        print("Cartoon");
    }

    public static void main(String[] args) {
        Drawing drawing=new Cartoon(1);
        drawing.paly();

    }
}


