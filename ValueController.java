import javax.swing.*;
import java.awt.event.*;

public class ValueController {
    private ValueModel model;
    private ValueView view;

    public ValueController(ValueModel model, ValueView view) {
        this.model = model;
        this.view = view;

        // Slider listener
        view.slider.addChangeListener(e -> {
            int val = view.slider.getValue();
            model.setValue(val);
            view.textField.setText(String.valueOf(val));
        });

        // TextField listener
        view.textField.addActionListener(e -> {
            try {
                int val = Integer.parseInt(view.textField.getText());
                model.setValue(val);
                view.slider.setValue(model.getValue());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view, "Invalid number");
            }
        });

        // + button
        view.plusButton.addActionListener(e -> {
            int current = model.getValue();
            if (current < model.getMax()) {
                model.setValue(current + 1);
                view.slider.setValue(model.getValue());
                view.textField.setText(String.valueOf(model.getValue()));
            }
        });

        // - button
        view.minusButton.addActionListener(e -> {
            int current = model.getValue();
            if (current > model.getMin()) {
                model.setValue(current - 1);
                view.slider.setValue(model.getValue());
                view.textField.setText(String.valueOf(model.getValue()));
            }
        });
    }
}
