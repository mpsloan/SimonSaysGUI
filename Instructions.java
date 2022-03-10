import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class Instructions {
    
    private boolean isClosed;

    public Instructions() throws InterruptedException {
        this.isClosed = false;
        JFrame frame = new JFrame("SimonSays!");
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        JLabel label = new JLabel("Instructions:");
        JLabel instructions = new JLabel("Pay close attention to the highlighted color pattern. Once the pattern is over, replicate the exact order.");
        // JLabel instructionsCont = new JLabel("")

        panel.setLayout(layout);
        panel.add(label);
        panel.add(instructions);

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(650, 200);
        frame.setVisible(true);
        frame.addWindowListener((WindowListener) new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
        
            }

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                setOpen(false);
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
        
    }

    public boolean windowIsClosed() {
        return isClosed;
    }

    public void setOpen(boolean isClosed) {
        this.isClosed = isClosed;
    }
}