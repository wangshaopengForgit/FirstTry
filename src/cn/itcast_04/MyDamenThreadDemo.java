package cn.itcast_04;

/**
 * 守护线程（后台线程）：
 *
 *  当线程被设置为守护线程时setDaemon(true);主线程停止后，守护线程也会停止，但是不会立即停止，会稍微的运行一点。
 *
 */
public class MyDamenThreadDemo {
    public static void main(String[] args) {
        MyDamenThread m1 = new MyDamenThread("张飞");
        MyDamenThread m2 = new MyDamenThread("关羽");
        m1.setDaemon(true);
        m2.setDaemon(true);
        m1.start();
        m2.start();
        Thread.currentThread().setName("刘备");
        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
