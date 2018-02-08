import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 * This class produces simple graphical output.
 * The program will display a small graphical output.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Janyl Jumadinova
 */

public class PaintScene extends JApplet
{

  private static final int WIDTH = 600;
  private static final int HEIGHT = 400;

  /**
   * This pain method will draw the graphics on the screen.
   *
   */
    public void paint(Graphics page)
    {
      page.setColor(Color.cyan);
      page.fillRect(0,0,WIDTH,HEIGHT);
      page.setColor(Color.red);
      page.fillOval(50, 30, 40, 40);
    }
}
