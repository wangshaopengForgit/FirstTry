package cn.itcast_03;

/**
 * java实现多线程程序
 *
 *
 * 由于线程是依赖进程实现的  所以我们应该先创建出来一个进程
 * 而进程由系统创建的，所以我们应该去调用系统功能创建出来一个进程
 * 但是java是不能调用系统功能的 所以没有办法直接实现多线程
 *
 * 但是 java可以调用c/c++  有他们创建进程 然后由java创建线程
 *
 */

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("线程一：");
        MyThread m2 = new MyThread("线程二：");
        m1.start();
        m2.start();

        //start 和 run的区别
        /**
         * run方法里面是多线程需要执行的代码块  直接调用run是普通的方法调用  是单线程模式
         *
         * start方法 是首先启动线程 由jvm调用该线程的run方法
         *
         *  每个线程只能被启动一次
         */

    }
}
