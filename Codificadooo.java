
package codificadooo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Codificadooo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();              
            }
        });
    }

    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Paseo de Perros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 6));

        JLabel labelHoras = new JLabel(" horas a pasear:");
        JTextField txtHoras = new JTextField();

        JLabel labelGrandes = new JLabel(" perros grandes:");
        JTextField txtGrandes = new JTextField();

        JLabel labelMedianos = new JLabel(" perros medianos:");
        JTextField txtMedianos = new JTextField();

        JLabel labelPequenos = new JLabel(" perros pequeños:");
        JTextField txtPequenos = new JTextField();

        panel.add(labelHoras);
        panel.add(txtHoras);
        panel.add(labelGrandes);
        panel.add(txtGrandes);
        panel.add(labelMedianos);
        panel.add(txtMedianos);
        panel.add(labelPequenos);
        panel.add(txtPequenos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int horas = Integer.parseInt(txtHoras.getText());
                int grandes = Integer.parseInt(txtGrandes.getText());
                int medianos = Integer.parseInt(txtMedianos.getText());
                int pequenos = Integer.parseInt(txtPequenos.getText());

                double total = (grandes * 10000 + medianos * 5000 + pequenos * 3000) * horas;

                if (grandes + medianos + pequenos > 1) {
                    total = total-total * 0.1; 
                }

                JOptionPane.showMessageDialog(frame, "El costo total es: $" + total);
            }
        });

        panel.add(btnCalcular);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(650,280);
    }
}
    
   
