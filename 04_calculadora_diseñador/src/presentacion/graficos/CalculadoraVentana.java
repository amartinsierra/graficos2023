package presentacion.graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraVentana extends JFrame {

	private JPanel contentPane;
	private JTextField jtNum1;
	private JTextField jtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraVentana frame = new CalculadoraVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número uno:");
		lblNewLabel.setBounds(105, 40, 69, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número dos:");
		lblNewLabel_1.setBounds(104, 94, 70, 24);
		contentPane.add(lblNewLabel_1);
		
		jtNum1 = new JTextField();
		jtNum1.setBounds(184, 42, 86, 20);
		contentPane.add(jtNum1);
		jtNum1.setColumns(10);
		
		jtNum2 = new JTextField();
		jtNum2.setText("");
		jtNum2.setBounds(184, 96, 86, 20);
		contentPane.add(jtNum2);
		jtNum2.setColumns(10);
		
		JButton jbSumar = new JButton("Sumar");
		jbSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jbSumar, "Suma: "+(Integer.parseInt(jtNum1.getText())+Integer.parseInt(jtNum2.getText())));
			}
		});
		jbSumar.setBounds(66, 160, 89, 23);
		contentPane.add(jbSumar);
		
		JButton jbMultiplicar = new JButton("Multiplicar");
		jbMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jbSumar, "Multiplicación: "+(Integer.parseInt(jtNum1.getText())*Integer.parseInt(jtNum2.getText())));
			}
		});
		jbMultiplicar.setBounds(248, 160, 89, 23);
		contentPane.add(jbMultiplicar);
	}
}
