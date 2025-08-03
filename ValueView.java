import javax.swing.*;
import java.awt.*;

public class ValueView extends JFrame {
    JSlider slider;
    JTextField textField;
    JButton plusButton;
    JButton minusButton;

    public ValueView(int min, int max, int initial) {
        setTitle("MVC Slider Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLayout(new BorderLayout());

        slider = new JSlider(JSlider.HORIZONTAL, min, max, initial);
        textField = new JTextField(String.valueOf(initial), 5);
        plusButton = new JButton("+");
        minusButton = new JButton("-");

        JPanel controlPanel = new JPanel();
        controlPanel.add(minusButton);
        controlPanel.add(textField);
        controlPanel.add(plusButton);

        add(slider, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
