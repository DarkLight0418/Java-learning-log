package example.exception;

import java.io.IOException;

public class ExceptionDemo9 {
    public static char readOneChar() throws IOException {
        System.out.print("문자를 입력하세요: ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        try {
            System.out.println("입력한 문자 = " + readOneChar());
        } catch (IOException e) {
            System.out.println("IOException 발생: " + e);
        }
    }
}
