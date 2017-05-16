import java.awt.*;
import java.applet.*;

public class AppletA extends Applet {
	public void paint(Graphics g) {
		g.drawLine(100, 100, 200, 200);
	}
}

/*
	<applet code="AppletA.class" height="300" width="300"></applet>
*/