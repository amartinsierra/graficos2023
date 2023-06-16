package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Contacto;
import service.ContactosService;
import service.ContactosServiceFactory;

public class ListarContactos extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public ListarContactos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Listar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService service=ContactosServiceFactory.getContactosService();
				StringBuilder lista=new StringBuilder();
				List<Contacto> contactos=service.contactos();
				contactos.forEach(c->lista.append("Nombre: "+c.getNombre()+"\n"));
				JOptionPane.showMessageDialog(btnNewButton, lista.toString());
			}
		});
		btnNewButton.setBounds(187, 10, 121, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarContactos.this.dispose();
			}
		});
		btnNewButton_1.setBounds(120, 125, 89, 23);
		contentPane.add(btnNewButton_1);
		this.setVisible(true);
	}

}
