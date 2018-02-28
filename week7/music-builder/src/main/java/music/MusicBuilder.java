package music;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.util.Date;

/** MusicBuilder class to demonstrate
* JFugue's MusicString, Player and Pattern classes.
*/
public class MusicBuilder {

  /** The main class will play music
  * that is specified as the MusicString.
  */
  public static void main(String[] args) {

    // display the name of the programmer and the date
    System.out.println("Janyl Jumadinova " + new Date());

    // the following examples were taken from http://www.jfugue.org/examples.html
    /*
    System.out.println("Playing string 1");
    player.play("C D E F G A B R R R");

    System.out.println("Playing string 2");
    Pattern p1 = new Pattern("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq");
    Pattern p2 = new Pattern("V1 I[Flute] Rw     | Rw     | GmajQQQ  CmajQ");
    player.play(p1, p2);

    */
    System.out.println("Playing string 3");
    // This is “Twinkle, twinkle, little star”
    Pattern pattern1 = new Pattern("C5q C5q G5q G5q A5q A5q Gh");
    // This is “How I wonder what you are”
    Pattern pattern2 = new Pattern("F5q F5q E5q E5q D5q D5q C5h");
    // This is “Up above the world so high”
    // and “Like a diamond in the sky”
    Pattern pattern3 = new Pattern("G5q G5q F5q F5q E5q E5q D5h");
    Pattern twinkleSong = new Pattern();
    twinkleSong.add(pattern1);
    twinkleSong.add(pattern2);
    twinkleSong.add(pattern3);
    twinkleSong.add(pattern3);
    twinkleSong.add(pattern1);
    twinkleSong.add(pattern2);
    Player player = new Player();
    player.play(twinkleSong);

  }
}
