import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    final JTextField a = new JTextField(), b = new JTextField(), result = new JTextField();
    final JButton add = new JButton("+"), sub = new JButton("-"), mul = new JButton("*"), div = new JButton("/");

    public CalculatorView() {
        setTitle("MVC Calculator");
        setSize(420, 240);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        result.setEditable(false);
        JPanel p = new JPanel(new GridLayout(3, 2, 8, 8));
        p.add(new JLabel("First number"));
        p.add(a);
        p.add(new JLabel("Second number"));
        p.add(b);
        p.add(new JLabel("Result"));
        p.add(result);
        JPanel q = new JPanel();
        q.add(add);
        q.add(sub);
        q.add(mul);
        q.add(div);
        add(p, BorderLayout.CENTER);
        add(q, BorderLayout.SOUTH);
    }
}
