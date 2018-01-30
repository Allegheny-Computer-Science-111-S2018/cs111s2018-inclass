/** This class displays two lines of output.
 * The program calculates the surface area
 * and the volume of the sphere and displays
 * the result to the terminal.
 *
 * 29 January, 2018
 *
 * @author Janyl Jumadinova
 */

public class VolumeArea
{
    public static void main(String[] args)
    {
        int radius;
        double area, volume, pi = 3.14;
        radius = 10;
        area = 3 * pi * radius * radius;
        System.out.println("Surface Area of sphere: "+area);
        volume = 1.333 * pi * radius * radius * radius;
        System.out.println("Volume of sphere: "+volume);
    }
}
