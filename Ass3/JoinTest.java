package Ass3;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("\n==> Main thread starting..\n");

    Thread joinThreadA = new JoinThread("A*", 2);
    Thread joinThreadB = new JoinThread("B*", 3);

    // Thread thông thường, sẽ không sử dụng join().
    Thread noJoinThreadC = new JoinThread("C", 50);

       joinThreadA.start();
       joinThreadB.start();
       noJoinThreadC.start();
    // Sử dụng join()
       joinThreadA.join();
       joinThreadB.join();

    // Đoạn code dưới đây sẽ phải chờ cho tới khi 2
    // joinThread A,B hoàn thành, mới được chạy tiếp.
       System.out.println("thread...");

       System.out.println("Thread " + joinThreadA.isAlive());
       System.out.println("Thread  " + joinThreadB.isAlive());
       System.out.println("Thread  " + noJoinThreadC.isAlive());

       System.out.println("\n==> Main Thread end!\n");
}
}

