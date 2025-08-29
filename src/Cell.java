import java.awt.Graphics;
import java.awt.Color;

public class Cell {
    private int x;
    private int y;
    private int size;

    public Cell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }
}
