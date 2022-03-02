public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        DemoRunnable thread1 = new DemoRunnable("Thread1");
        DemoRunnable thread2 = new DemoRunnable("Thread2");
        thread1.start();
        thread2.start();

        System.out.println("Main thread stopped!");

    }
}
