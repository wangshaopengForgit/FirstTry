package cn.itcast_04;

public class MyDamenThread extends Thread {
    private String  name;
    public MyDamenThread(){}
    public MyDamenThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
