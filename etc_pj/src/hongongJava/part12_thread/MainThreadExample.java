package hongongJava.part12_thread;

public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // User1 스레드
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        // User2 스레드
        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }
}
