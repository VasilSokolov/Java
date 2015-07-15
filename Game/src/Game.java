import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Game extends gameLoop {
	
	
	public void init(){
		setSize(854, 480);
		Thread th = new Thread(this);
		th.start();
		offscreen = createImage(854, 480);
		d = offscreen.getGraphics();
	}
	
	public void paint(Graphics g){
//		g.clearRect(0, 0, 854, 480);
		d.clearRect(0, 0, 854, 480);
		d.drawOval(x, y, 20, 20);
		g.drawImage(offscreen, 0, 0, this);
	}
	
	public void update(Graphics g){
		paint(g);;
	}
}
