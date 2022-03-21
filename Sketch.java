/**
* A simple drawing using processing.
* @author: J.Woo
*
*/
import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// Put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here
   */
  public void setup() {
    // Set background colour
    background(128, 190, 241);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Draw the moon
    stroke(200);
    fill(255, 238, 189);
    ellipse(95, 70, 95, 95);

    // Draw the foreground
    stroke(0, 0, 0);
    fill(90, 133, 65);
    rect(-20, 330, 420, 120);

    //line(150,150,250,250);
    //line(50,250,150,150);
    //line(50,250,250,250);

    fill(224, 219, 215);
    rect(100, 230, 260, 100);
    //fill(138, 57, 39);
    //rect(200, 200, 145, 130);
    //rect(50,250,200,100);

    // Draw the main building
    //stroke(96, 88, 112);
    //fill(146, 157, 196);
    //rect(200, 200, 151, 200);

    // Draw the windows ↓↓↓
    stroke(165, 136, 164);

    // left column with light
    fill(243, 230, 166);
    rect(215, 220, 25, 38);
    fill(243, 230, 166);
    rect(215, 320, 25, 38);
    fill(243, 230, 166);
    rect(215, 370, 25, 38);

    // middle column with light
    fill(243, 230, 166);
    rect(263, 270, 25, 38);
    fill(243, 230, 166);
    rect(263, 370, 25, 38);
    fill(243, 230, 166);
    rect(263, 220, 25, 38);

    // right column with light + one dark window
    fill(26, 25, 30);
    rect(310, 270, 25, 38);
    fill(243, 230, 166);
    rect(310, 320, 25, 38);
    fill(243, 230, 166);
    rect(310, 220, 25, 38);

    // dark windows from left to right
    stroke(30, 31, 61);
    fill(26, 25, 30);
    rect(215, 270, 25, 38);
    fill(26, 25, 30);
    rect(263, 320, 25, 38);
    fill(26, 25, 30);
    rect(310, 370, 25, 38);
  }
}