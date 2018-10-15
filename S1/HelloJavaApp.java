import java.applet.Applet;
import java.awt.Graphics;
public class HelloJavaApp extends Applet{
	public void paint(Graphics g){
		g.drawString("Welcome to Java applet World!", 100, 100);
	}
}