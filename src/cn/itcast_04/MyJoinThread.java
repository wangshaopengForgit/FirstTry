package cn.itcast_04;

public class MyJoinThread extends Thread {
    private String  name;
    public MyJoinThread(){}
    public MyJoinThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+i);
        }
    }
    }

