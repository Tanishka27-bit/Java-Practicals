import javax.swing.*; import java.awt.*;
public class GUIComponentsDemo extends JFrame {
 public GUIComponentsDemo(){ setTitle("Student Registration Form"); setSize(460,360); setDefaultCloseOperation(EXIT_ON_CLOSE); setLocationRelativeTo(null);
 JPanel p=new JPanel(new GridLayout(0,2,8,8)); p.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
 p.add(new JLabel("Name:")); JTextField name=new JTextField(); p.add(name);
 p.add(new JLabel("Email:")); JTextField email=new JTextField(); p.add(email);
 p.add(new JLabel("Password:")); p.add(new JPasswordField());
 p.add(new JLabel("Gender:")); JPanel g=new JPanel(); ButtonGroup bg=new ButtonGroup(); JRadioButton m=new JRadioButton("Male"), f=new JRadioButton("Female"); bg.add(m);bg.add(f);g.add(m);g.add(f);p.add(g);
 p.add(new JLabel("Notifications:")); p.add(new JCheckBox("Enable"));
 p.add(new JLabel("Student status:")); JToggleButton t=new JToggleButton("OFF"); t.addActionListener(e->t.setText(t.isSelected()?"ON":"OFF"));p.add(t);
 JButton b=new JButton("Register"); b.addActionListener(e->JOptionPane.showMessageDialog(this,"Registered: "+name.getText()+"\n"+email.getText()));p.add(new JLabel());p.add(b);add(p); }
 public static void main(String[] a){SwingUtilities.invokeLater(()->new GUIComponentsDemo().setVisible(true));}
}
