package classExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonColorFrame3 extends JFrame {
    private JRadioButton yellow;
    private JRadioButton green;

    public ButtonColorFrame3() {
        setSize(300, 160);
        setTitle("Button Color Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container containerPane = getContentPane();
        containerPane.setLayout(new FlowLayout());

        yellow = new JRadioButton("노란색");
        green = new JRadioButton("연두색");
        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(yellow);
        colorGroup.add(green);

        JButton button = new JButton("변경");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (yellow.isSelected()){
                    (getContentPane()).setBackground(Color.yellow);
                } else if (green.isSelected()) {
                    (getContentPane()).setBackground(Color.green);
                }
            }
        });

        containerPane.add(yellow);
        containerPane.add(green);
        containerPane.add(button);
    }

    public static void main(String[] args) {
        (new ButtonColorFrame3()).setVisible(true);
    }
}
