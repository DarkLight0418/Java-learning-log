package hongongJava.part12_thread;

public class User1 extends Thread {
    private Calculator calculator;  // 공유 객체

    public void setCalculator(Calculator calculator) {
        this.setName("User1");  // 스레드 이름 설정
        this.calculator = calculator;  // 공유 객체 필드 저장
    }

    public void run() {
        calculator.setMemory(100);  // 공유 객체 Calculator의 메모리에 100 저장
    }
}
