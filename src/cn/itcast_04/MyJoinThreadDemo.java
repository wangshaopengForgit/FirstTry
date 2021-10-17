package cn.itcast_04;

/**
 * 加入线程会优先执行   比优先级设置要靠谱
 */
public class MyJoinThreadDemo {

    public static void main(String[] args) {
        MyJoinThread m1 =new MyJoinThread("李渊");
        MyJoinThread m2 =new MyJoinThread("李世民");
        MyJoinThread m3 =new MyJoinThread("李元霸");

        m1.start();
        try {
            m1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2.start();
        m3.start();

    }
}
