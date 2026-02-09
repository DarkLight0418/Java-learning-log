package hongondJava.part14_IO_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/Temp/test1.db");

        byte a = 10;
        byte b = 20;
        byte c = 30;

        os.write(a);
        os.write(b);
        os.write(c);
        // 1byte씩 출력

        os.flush();  // 잔류하는 모든 바이트 출력
        os.close();  // 출력 스트림 닫기
    }
}
