package classExample;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>(5);
        list.add("사과");
        list.add("오렌지");
        list.add("배");
        list.set(1, "감");
        list.add(2, "석류");
        list.add("참외");
        list.remove("사과");

        for (int i = 0; i < list.size(); i++)
            System.out.println(i + ": " + list.get(i));

        System.out.print("찾을 내용은? ");
        String item = input.next();
        System.out.println(list.contains(item) ? "있어요" : "없어요");
    }
}
