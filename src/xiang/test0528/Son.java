package xiang.test0528;

public class Son extends Father {
    @Override
    public void say() {
        System.out.println("Class: "+this.getClass().getName()+" method: "+ Thread.currentThread().getStackTrace()[1].getMethodName() + " line: 【"+ Thread.currentThread().getStackTrace()[1].getLineNumber()+"】");

    }
}
