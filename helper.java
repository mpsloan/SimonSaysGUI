import javax.swing.*;

public class helper {
    
    public helper() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        JLabel label = new JLabel("Instructions:");
        JLabel instructions = new JLabel("Pay close attention to the highlighted color pattern. Once the pattern is over, replicate the exact order.");

        panel.setLayout(layout);
        panel.add(label);
        panel.add(instructions);

        frame.getContentPane().add(panel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}