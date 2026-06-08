package example.exception;

import java.util.Scanner;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("점수 합계는?: ");
        int sum = input.nextInt();
        System.out.print("과목의 수는?: ");
        int count = input.nextInt();

        try {
            if (count == 0) {
                throw new DivideByZeroException();
            }
            int average = sum / count;
            System.out.println("평균값 = " + average);
        } catch (DivideByZeroException e) {
            System.out.println(e);
        }
    }
}
