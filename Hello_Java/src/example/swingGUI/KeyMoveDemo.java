package example.swingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyMoveDemo extends JFrame {
    public static final int NUM = 10;
    private JButton[] list;
    private int index;

    private class MyPanel extends JPanel {
        public MyPanel() {
            setLayout(new GridLayout(0, NUM));
            list = new JButton[NUM*NUM];
            for (int i=0; i<list.length; i++) {
                list[i] = new JButton();
                list[i].setBackground(Color.WHITE);
                list[i].setEnabled(false);  // 칸을 나타내는 용도로만 사용
                add(list[i]);
            }
            index = (int) (Math.random() * (NUM*NUM));
            list[index].setBackground(Color.BLUE);

            this.setFocusable(true);
            this.requestFocus();

            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    list[index].setBackground(Color.white);
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_UP:
                            if (index < NUM)
                                index += NUM*NUM;
                            index -= NUM;
                            break;
                        case KeyEvent.VK_DOWN:
                            index = (index + NUM) % (NUM*NUM);
                            break;
                        case KeyEvent.VK_RIGHT:
                            index++;
                            if (index % NUM == 0)
                                index -= NUM;
                            break;
                        case KeyEvent.VK_LEFT:
                            if (index % NUM == 0)
                                index += NUM;
                            index--;
                            break;
                    }
                    list[index].setBackground(Color.BLUE);
                }
            });
        }
    }
    public KeyMoveDemo() {
        setSize(400, 400);
        setTitle("키 이동 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new MyPanel());
    }

    public static void main(String[] args) {
        new KeyMoveDemo().setVisible(true);
    }
}
