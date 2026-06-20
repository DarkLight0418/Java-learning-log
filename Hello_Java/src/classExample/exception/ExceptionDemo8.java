package classExample.exception;

import java.io.IOException;

public class ExceptionDemo8 {
    public static void main(String[] args) {
        System.out.print("문자를 입력하세요: ");
        try {
            int aChar = System.in.read();
            System.out.println("입력한 문자 = " + (char) aChar);
        } catch (IOException e) {
            System.out.println("IOException 발생: " + e);
        }
    }
}
