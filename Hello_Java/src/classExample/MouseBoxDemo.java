package classExample;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseBoxDemo extends JFrame {
    private class TestPanel extends JPanel {
        private Point[] points;
        private int count = 0;

        public TestPanel() {
            points = new Point[100];

            this.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    if (count < points.length) {
                        points[count++] = new Point(e.getX(), e.getY());
                        repaint();
                    }
                }

            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (int i=0; i<count; i++) {
                switch (i % 3) {
                    case 0:
                        g.setColor(Color.RED);
                        break;
                    case 1:
                        g.setColor(Color.GREEN);
                        break;
                    case 2:
                        g.setColor(Color.BLUE);
                        break;
                    }
                    g.fillRect(points[i].x, points[i].y, 30, 30);
                }
            }
        }

    public MouseBoxDemo() {
        setSize(400, 300);
        setTitle("사각형");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new TestPanel());
    }

    public static void main(String[] args) {
        (new MouseBoxDemo()).setVisible(true);
    }
}
