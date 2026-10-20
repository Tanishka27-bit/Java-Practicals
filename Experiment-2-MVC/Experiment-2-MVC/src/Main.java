import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] x) {
        SwingUtilities.invokeLater(() -> {
            CalculatorModel m = new CalculatorModel();
            CalculatorView v = new CalculatorView();
            new CalculatorController(m, v);
            v.setVisible(true);
        });
    }
}
