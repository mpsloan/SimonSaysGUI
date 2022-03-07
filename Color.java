import javax.swing.*;

public class Color extends JButton {

    private String name;
    // http://www.java2s.com/Code/JavaAPI/javax.swing/extendsJButton.htm
    public Color(String imageName, String name) {
        this(new ImageIcon(imageName));
        this.name = name;
    }

    public Color(ImageIcon colorIcon) {
        setIcon(colorIcon);
    }
    
    public String toString() {
        return name;
    }
}