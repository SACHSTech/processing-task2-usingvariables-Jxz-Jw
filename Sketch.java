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
    background(14, 52, 97);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Draw the moon
    stroke(200);
    fill(255, 247, 232);
    ellipse(325, 70, 95, 95);

    // Draw the shooting star + stars
    stroke(255);
    line(100, 25, 250, 100); 
    fill(255, 247, 232);
    ellipse(235, 45, 1, 1);
    fill(255, 247, 232);
    ellipse(367, 160, 3, 3);
    fill(255, 247, 232);
    ellipse(240, 173, 2, 2);
    fill(255, 247, 232);
    ellipse(60, 30, 3, 3);
    fill(255, 247, 232);
    ellipse(30, 130, 2, 2);
    fill(255, 247, 232);
    ellipse(135, 220, 4, 4);
    fill(255, 247, 232);
    ellipse(110, 93, 1, 1);

    // Draw the foreground
    stroke(0, 0, 0);
    fill(0, 0, 0);
    rect(-20, 340, 420, 120);

    // Draw the building in the distance
    fill(0, 0, 0);
    rect(70, 298, 115, 200);

    // Draw the main building
    stroke(96, 88, 112);
    fill(32, 25, 33);
    rect(200, 200, 151, 200);

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