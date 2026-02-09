package etc.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*

< 예제 따라서 getClass() 못쓰는 이유 >
(https://hudi.blog/java-inputstream-outputstream/)

static 안에서는 this가 없다 -> getClass()는 this가 있어야 한다
=> main() 안에서 getClass() 직접 호출 불가
*/

public class ReadTest {
    public static void main(String[] args) throws IOException {
        String filePath = ReadTest.class
                .getClassLoader()
                .getResource("sample.txt")
                .getPath();

        InputStream inputStream = new FileInputStream(filePath);

        while (true) {
            int read = inputStream.read();
            if (read < 0) {
                break;
            }
            System.out.print((char) read);
        }

        inputStream.close();
    }
}
