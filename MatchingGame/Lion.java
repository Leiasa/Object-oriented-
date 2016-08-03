/* 
 * Name: Leiasa Horanic
 * Login: cs11wcs
 * Date: February 2, 2014 
 * File: Lion.java 
 * Sources of Help: Muyao Wu, Sachi
 * 
 * This progarm creates each animal object for the animal speak game. It
 * consists of what the animal should, checks when it is clicked on by
 * the user, and contains the framed rectangle that highlights the
 * image if correct.  
 */ 

import objectdraw.*;
import java.awt.Color;
import java.awt.Image;

/* 
 * Name: Lion
 * Purpose: This controls the lion image. It contructs and controls this
 *          object's string and a framed rectangle to highlight the image.  
 */
public class Lion implements AnimalCard
{
  private static String LION_SPEAK = "Roar";
  
  private VisibleImage lionImage;
  private FramedRect picFrame, picFrame2;
  private DrawingCanvas canvas;
  private int rectShrink = 2;
   public boolean uncovered = false;


  /* 
   * Name: Lion
   * Purpose: The purpose of this is to construct the lion object and framed
   *          rectangle object.
   * Parameters: pic, loc, canvas 
   * Return: None (constructor)
   */
  public Lion(Image pic, Location loc, DrawingCanvas canvas)
  {
    lionImage = new VisibleImage(pic, loc, canvas);
    picFrame = new FramedRect( loc, lionImage.getWidth(),
                               lionImage.getHeight(), canvas);
    picFrame2 = new FramedRect( loc.getX()+1, loc.getY()+1, 
                                lionImage.getWidth()-rectShrink,
                                lionImage.getHeight()-rectShrink, canvas);


    canvas = canvas;
    picFrame.hide();
    picFrame2.hide();

  }

  /* 
   * Name: speak 
   * Purpose: This method allows the lion object to speak 
   * Parameters: None 
   * Return: the string so the lion image will have a word by it
   */
  public String speak()
  {
    return LION_SPEAK;
  }

  /* 
   * Name: contains
   * Purpose: This method is checking to see if the point is inside the 
   *          image 
   * Parameters: point
   * Return: if the point contains lionImage
   */
  public boolean contains( Location point )
  {
    return lionImage.contains(point);
  }

  /* 
   * Name: showHighlight 
   * Purpose: This method changes the framed rectangles color 
   * Parameters: color 
   * Return: void
   */
  public void showHighlight( Color color ) 
  { 
    picFrame.setColor(color);
    picFrame.show();
    picFrame2.setColor(color);
    picFrame2.show();

  }
 
  /* 
   * Name: hideHighlight
   * Purpose: This method hides the framed rectangle 
   * Parameters: None 
   * Return: void
   */
  public void hideHighlight()
  { 
    picFrame.hide();
    picFrame2.hide();
  }

  /* 
   * Name: getHighlightColor()
   * Purpose: This method hides the framed rectangle 
   * Parameters: None 
   * Return: gets the current color of the framed rectangle to be able to
   *         highlight
   */
  public Color getHighlightColor()
  {
    return picFrame.getColor();
  }
  /* 
   * Name: equals 
   * Purpose: To check to see if the animal card matches the card of this
   *          class 
   * Parameters: random 
   * Return: It will return true or false depending on if the return
   *         statement is true of false 
   */
 @Override
 public boolean equals(Object o)
  {
    return this.getClass() .equals(o.getClass()); 
  }
   /* 
   * Name: show
   * Purpose: This method shows the lion image and the boolean uncovered is
   *          true if the lion is shown 
   * Parameters: None. 
   * Return: void. 
   */
  public void show()
  {
    uncovered = true;
    lionImage.show();
  }
  /* 
   * Name: hide
   * Purpose: This method hides the lion image and the boolean uncovered is
   *          false if the lion is hidden 
   * Parameters: None. 
   * Return: void. 
   */
  public void hide()
  {
    uncovered = false;
    lionImage.hide();
  }
  /* 
   * Name: show
   * Purpose: This method checks to see if the lion image is shown
   * Parameters: None. 
   * Return: true or false, and uncovered
   */
  public boolean shown()
  {
    return uncovered;
  }

}

