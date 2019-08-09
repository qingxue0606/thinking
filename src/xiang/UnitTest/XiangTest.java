package xiang.UnitTest;

import org.junit.Test;
import xiang.test0528.Father;
import xiang.test0528.Son;
import xiang.test0712.Selector;
import xiang.test0712.Sequence;


//import xiang.test0528.Xiang;

import java.math.BigInteger;

public class XiangTest {

    @Test
    public void test() {
        String a="\\\\";
        System.out.println(a);
    }
    @Test
    public void test2() {
        int i1=-1;
        System.out.println(Integer.toBinaryString(i1));
        i1>>>=2;
        System.out.println(Integer.toBinaryString(i1));


    }
    @Test
    public void test3() {
        Sequence sequence =new Sequence(10);
        for (int i=0;i<10;i++){
            sequence.add(Integer.toString(i));
        }

        Selector selector=sequence.selector();



        while (!selector.end()){
            System.out.println(selector.current()+"  ");
            selector.next();
        }


    }






}
