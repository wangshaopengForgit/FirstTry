package cn.itcast_04;

/**
 * 线程由两种调度：
 *  1.抢占式调度     java
 *  2.分时调度
 *
 *
 *  线程默认的优先级是5 IllegalArgumentException非法参数异常
 *
 *
 *   优先级：最高优先级10 最低优先级1 默认5  数字越大优先级越高
 *
 *   高优先级可以大概率增加抢到cpu的执行权 但是不能保证一定先执行
 *
 *
 *   所以说：优先级不能保证优先级高的
 *
 */
public class MyProxieyThreadDemo {

    public static void main(String[] args) {
        MyProxieyThread m1 = new MyProxieyThread("董事长：");
        MyProxieyThread m2 = new MyProxieyThread("总经理：");
        MyProxieyThread m3 = new MyProxieyThread("部门经理：");
        m1.setPriority(1);
        m3.setPriority(10);
        m1.start();
        m2.start();
        m3.start();

    }

}
