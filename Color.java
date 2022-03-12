// class for all of the JButtons
import java.awt.*;
import javax.swing.*;

public class Color extends JButton {
    // name of each button to store in ArrayList
    private String name;

    /* http://www.java2s.com/Code/JavaAPI/javax.swing/extendsJButton.htm
    how to set ImageIcon to JButton 
    passing in the image name (png file) and name of color */ 
    public Color(String imageName, String name) {
        this(new ImageIcon(imageName));
        this.name = name;
    }

    /* https://stackoverflow.com/questions/2856480/resizing-a-imageicon-in-a-jbutton
    how to resize a button's image */
    public Color(ImageIcon colorIcon) {
        Image image = colorIcon.getImage();
        Image newImage = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        colorIcon = new ImageIcon(newImage);
        setIcon(colorIcon);
    }

    // returns the color's name as the object
    public String toString() {
        return name;
    }
}