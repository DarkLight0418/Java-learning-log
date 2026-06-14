package example.swingGUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDrawingFrame2 extends JFrame {
    private Point[] points;
    private int count = 0;

    private class MyListener extends MouseAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }
    }

    private class MyPanel extends JPanel {

    }
}
