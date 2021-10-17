package cn.itcast_04;

public class MyProxieyThread extends Thread {
    private String  name;
    public MyProxieyThread(){}
    public MyProxieyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
