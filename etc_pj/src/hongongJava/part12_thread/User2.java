package hongongJava.part12_thread;

public class User2 extends Thread {
    private Calculator calculator;  // 공유 객체

    public void setCalculator(Calculator calculator) {
        this.setName("User2");  // 공유 객체 이름 설정
        this.calculator = calculator; // 공유 객체 필드 저장
    }

    public void run() {
        calculator.setMemory(50);
    }
}
