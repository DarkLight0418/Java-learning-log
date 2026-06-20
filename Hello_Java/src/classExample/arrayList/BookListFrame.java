package classExample.arrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BookListFrame extends JFrame {
    private ArrayList<Book> bookList;
    private JTextField title, author;
    private JTextArea msgArea;

    public BookListFrame() {
        setSize(230, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Book List");

        bookList = new ArrayList<>();

        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        add(new JLabel("제목"));
        title = new JTextField(15);
        add(title);
        add(new JLabel("저자"));
        author = new JTextField(15);
        add(author);
        JButton register = new JButton("등록");
        add(register);
        JButton search = new JButton("검색");
        add(search);
        msgArea = new JTextArea(5, 18);
        msgArea.setEditable(false);
        add(msgArea);

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                bookList.add(new Book(title.getText().trim(),
                        author.getText().trim()));

                for (Book b : bookList)
                    result += b.toString() + "\n";

                msgArea.setText(result);
                title.setText("");
                author.setText("");
            }
        });

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                String keyTitle = title.getText().trim();
                String keyAuthor = author.getText().trim();

                if (keyTitle.equals("") && keyAuthor.equals(""))
                    return;

                for (Book b : bookList) {
                    if ((keyTitle.equals(keyTitle)) ||
                            b.getTitle().equals(keyTitle)
                            && (keyAuthor.equals("") ||
                            b.getAuthor().equals(keyAuthor)))
                        result += b.toString() + "\n";

                    msgArea.setText(result);
                }
            }
        });
    }

    public static void main(String[] args) {
        (new BookListFrame()).setVisible(true);
    }
}
