import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class ButtonPanel extends JPanel implements ActionListener {

    public ButtonPanel(ArrayList<Color> colors, ArrayList<Color> userInput) {
        for (Color color: colors) {
            add(color);
            color.addActionListener((ActionListener) new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(color + " was clicked");
                    userInput.add(color);
                }
            });
        }
        setLayout(new GridLayout(0, 4));

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    

    

}