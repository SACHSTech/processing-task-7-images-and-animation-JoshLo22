import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  PImage imgdiamond;
  PImage imgBaseball;

  // x and y coordinate for basketball
  float fltBaseBallX = 0;
  float fltBaseBallY = 0;
  float fltAngle = 0.05f;
  float fltShapeX = 80;
  float fltShapeY = 10;

  // basketball speed variables
  float fltXSpeed = 3;
  float fltYSpeed = 3;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    imgdiamond = loadImage("diamond.jpg");
    imgdiamond.resize(width, height);
    imgBaseball = loadImage("Baseball.png");
    imgBaseball.resize(imgBaseball.width / 50, imgBaseball.height / 50);

  }

  public void draw() {
    background(imgdiamond);
    image(imgBaseball, fltBaseBallX, fltBaseBallY);

    fltBaseBallX = cos(fltAngle) * 50 + 189;
    fltBaseBallY = sin(fltAngle) * 50 + 111;

    fltAngle -= 0.05f;
    fltShapeX += fltXSpeed;
    fltShapeY += fltYSpeed;
    ellipse(fltShapeX, fltShapeY, 30, 30);
    if (fltShapeX > width - 15 || fltShapeX < 0) {
      fltXSpeed *= -1;

    }

    if (fltShapeY > height - 15 || fltShapeY < 0) {
      fltYSpeed *= -1;
    }

  }

}
