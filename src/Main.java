import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
  private Grid grid;
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      grid = new Grid(20, 20, 35);
      JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                grid.paint(g);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(720, 720);
            }
        };

        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
