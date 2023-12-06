import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class Main extends MIDlet {
    protected void startApp() throws MIDletStateChangeException {
        Display.getDisplay(this).setCurrent(new Canvas() {
            protected void paint(Graphics graphics) {
                graphics.setColor(0xffffff);
                graphics.fillRect(0, 0, getWidth(), getHeight());
                graphics.setColor(0x0);
                graphics.drawString("Hello, World!", 0, 0, Graphics.TOP | Graphics.LEFT);
            }
        });
    }

    protected void pauseApp() {

    }

    protected void destroyApp(boolean b) throws MIDletStateChangeException {

    }
}
