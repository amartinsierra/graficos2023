package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import service.ContactosService;
import service.ContactosServiceFactory;

public class AltaContactos extends JFrame {

	private JPanel contentPane;
	private JTextField jtNombre;
	private JTextField jtEmail;
	private JTextField jtEdad;
	private JTextField jtTelefono;

	
	/**
	 * Create the frame.
	 */
	public AltaContactos() {
		setTitle("Alta de contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(34, 25, 56, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(34, 67, 56, 23);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel_1 = new JLabel("Edad:");
		lblNewLabel_1.setBounds(34, 114, 56, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTelfono = new JLabel("Teléfono:");
		lblTelfono.setBounds(34, 165, 56, 23);
		contentPane.add(lblTelfono);
		
		jtNombre = new JTextField();
		jtNombre.setBounds(129, 26, 86, 20);
		contentPane.add(jtNombre);
		jtNombre.setColumns(10);
		
		jtEmail = new JTextField();
		jtEmail.setColumns(10);
		jtEmail.setBounds(129, 68, 86, 20);
		contentPane.add(jtEmail);
		
		jtEdad = new JTextField();
		jtEdad.setColumns(10);
		jtEdad.setBounds(129, 115, 86, 20);
		contentPane.add(jtEdad);
		
		jtTelefono = new JTextField();
		jtTelefono.setColumns(10);
		jtTelefono.setBounds(129, 166, 86, 20);
		contentPane.add(jtTelefono);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService service=ContactosServiceFactory.getContactosService();
				if(service.guardarContacto(Integer.parseInt(jtTelefono.getText()), 
						jtNombre.getText(), 
						jtEmail.getText(),
						Integer.parseInt(jtEdad.getText()))) {
					JOptionPane.showMessageDialog(btnNewButton, "Contacto guardado");
				}else {
					JOptionPane.showMessageDialog(btnNewButton, "Error al guardar!");
				}
			}
		});
		btnNewButton.setBounds(182, 213, 89, 23);
		contentPane.add(btnNewButton);
		this.setVisible(true);
	}

}
