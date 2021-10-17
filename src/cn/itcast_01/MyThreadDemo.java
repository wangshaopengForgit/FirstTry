package cn.itcast_01;

/**
 *   进程：正在运行的程序 是系统资源分配和调用的独立单位  每个程序都有自己的内存空间和系统资源
 *   线程：是进程中的单个顺序控制流，是一条执行路径
 *        一个进程如果只有一条执行路径  则称之为单线程程序
 *        一个进程有多个执行路径        则称之为多线程程序
 *   举例：扫雷程序（可以点击地雷   时间计时）
 *         迅雷下载（多个任务下载）
 *   并行和并发的区别：
 *          并行：逻辑上同时发生  同一时间内同时运行多个程序
 *          并发：物理上同事发生  同一时间点同时运行多个程序
 *   java程序的运行原理：
 *          有java命令启动jvm,jvm相当于一个进程
 *          接着有该进程创建一个主线程执行main方法
 *
 *    思考题：
 *          jvm虚拟机的启动是单线程的还是多线程的
 *                  多线程的
 *                  原因是：垃圾回线程也需要启动，否则会出现内存溢出
 *                  现在启动的垃圾回收线程和前面启动的主线程，所以是两个线程
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        System.out.println("hello");
        new Object();
        new Object();
        System.out.println("world");
        System.out.println("world");
    }
}
