package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import service.ContactosService;

public class EliminarContacto extends JFrame {

	private JPanel contentPane;
	private JTextField jtNumero;

	
	/**
	 * Create the frame.
	 */
	public EliminarContacto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce número");
		lblNewLabel.setBounds(20, 42, 121, 19);
		contentPane.add(lblNewLabel);
		
		jtNumero = new JTextField();
		jtNumero.setBounds(173, 41, 107, 20);
		contentPane.add(jtNumero);
		jtNumero.setColumns(10);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService service=new ContactosService();
				service.eliminarContacto(Integer.parseInt(jtNumero.getText()));
			}
		});
		btnNewButton.setBounds(107, 122, 89, 23);
		contentPane.add(btnNewButton);
		this.setVisible(true);
	}

}
