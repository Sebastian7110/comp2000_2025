import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class Grid extends JPanel {
    private int columns = 20;
    private int rows = 20;
    private int cellLength = 35;
    private int gridOffset = 10;
    private Cell[][] cells;

    public Grid(int columns, int rows, int cellLength) {
        this.columns = columns;
        this.rows = rows;
        this.cellLength = cellLength;
        this.cells = new Cell[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                int x = 10 + i * cellLength;
                int y = 10 + j * cellLength;
                cells[i][j] = new Cell(x, y, cellLength);
            }
        }
        
    }

    @Override
    public void paint(Graphics g) {
        

        g.setColor(Color.BLACK);

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j].paint(g);
            }
        }
    }
}
