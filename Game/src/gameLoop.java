import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class gameLoop extends Applet implements Runnable {
	
	public int x, y;
	public Image offscreen;
	public Graphics d;
	 
	@Override
	public void run() {
		x = 100;
		y = 200;
		while (true) {
			x++;
			repaint();
//			System.out.println("system");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
