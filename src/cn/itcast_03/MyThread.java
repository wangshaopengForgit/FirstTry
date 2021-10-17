package cn.itcast_03;

public class MyThread extends Thread{
    private String name;
    public MyThread(){}
    public MyThread(String name){
         super(name);
    }
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
