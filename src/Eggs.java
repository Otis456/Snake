import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Eggs {
	
	int row,col;
	int w = Yards.BLOCK_SIZE;
	int h = Yards.BLOCK_SIZE;
	
	private static Random r = new Random();        
	private Color color = Color.GREEN;
	
	public Eggs(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	
	public Eggs() {
		this(r.nextInt(Yards.ROWS-2) + 2,r.nextInt(Yards.COLS));
		
	}
	
	public void reAppear() {
		this.row = r.nextInt(Yards.ROWS-2) + 2;
		this.col = r.nextInt(Yards.COLS);
	}
	
	public Rectangle getRect() {
		return new Rectangle(Yards.BLOCK_SIZE * col, Yards.BLOCK_SIZE * row, w, h);
	}
	
	public void draw(Graphics g){
		Color c = g.getColor();
		g.setColor(color);
		
		g.fillOval(Yards.BLOCK_SIZE * col, Yards.BLOCK_SIZE * row, w, h);  
		g.setColor(c);
		if(color == Color.GREEN) color = Color.RED;
		else color = Color.GREEN;
	}
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
}