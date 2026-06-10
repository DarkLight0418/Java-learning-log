package example.swingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleBtnExample extends JFrame {

    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            (getContentPane()).setBackground(Color.gray);
        }
    }
    public SimpleBtnExample() {
        setSize(300, 150);
        setTitle("Simple Button Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container containerPane = getContentPane();
        containerPane.setBackground(Color.CYAN);
        containerPane.setLayout(new FlowLayout());
        JLabel label = new JLabel("버튼을 누르세요");
        JButton button = new JButton("버튼");
        ButtonListener buttonListener = new ButtonListener();
        button.addActionListener(buttonListener);
        containerPane.add(label);
        containerPane.add(button);
    }

    public static void main(String[] args) {
        (new SimpleBtnExample()).setVisible(true);
    }
}

