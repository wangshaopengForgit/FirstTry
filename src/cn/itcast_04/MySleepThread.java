package cn.itcast_04;

import java.util.Date;

public class MySleepThread extends  Thread {
    private String  name;
    public MySleepThread(){}
    public MySleepThread(String name){
        super(name);
    }

    /**
     * leep()  线程休眠  设置时间后  在休眠时间结束后重新执行
     *
     */
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+new Date());
        }
    }
}
