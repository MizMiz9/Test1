import javax.swing.JOptionPane;
public class Scanner1{

public static void main(String[] args) {
  String name = JOptionPane.showInputDialog("Enter name");
  JOptionPane.showMessageDialog(null,"you are "+name);

  int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
  JOptionPane.showMessageDialog(null,"You are "+age+" years old");
  }
}
