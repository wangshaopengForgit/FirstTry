package cn.itcast_04;

public class MySleepThreadDemo {
    public static void main(String[] args) {
        MySleepThread m1 = new MySleepThread("王少鹏");
        MySleepThread m2 = new MySleepThread("刘亦菲");
        m1.start();
        m2.start();

    }
}
