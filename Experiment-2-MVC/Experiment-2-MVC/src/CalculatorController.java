import javax.swing.*;
import java.awt.event.*;

public class CalculatorController implements ActionListener {
    private final CalculatorModel m;
    private final CalculatorView v;

    public CalculatorController(CalculatorModel m, CalculatorView v) {
        this.m = m;
        this.v = v;
        v.add.addActionListener(this);
        v.sub.addActionListener(this);
        v.mul.addActionListener(this);
        v.div.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(v.a.getText().trim()), b = Double.parseDouble(v.b.getText().trim()), r;
            if (e.getSource() == v.add)
                r = m.add(a, b);
            else if (e.getSource() == v.sub)
                r = m.subtract(a, b);
            else if (e.getSource() == v.mul)
                r = m.multiply(a, b);
            else
                r = m.divide(a, b);
            v.result.setText(String.valueOf(r));
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(v, "Enter valid numbers");
        } catch (ArithmeticException x) {
            JOptionPane.showMessageDialog(v, x.getMessage());
        }
    }
}
