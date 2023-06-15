package presentacion.graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menú agenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jbNuevo = new JButton("Nuevo contacto");
		jbNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AltaContactos();
			}
		});
		jbNuevo.setBounds(47, 31, 144, 23);
		contentPane.add(jbNuevo);
		
		JButton jbEliminar = new JButton("Eliminar contacto");
		jbEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EliminarContacto();
			}
		});
		jbEliminar.setBounds(262, 31, 144, 23);
		contentPane.add(jbEliminar);
		
		JButton jbBuscar = new JButton("Buscar contacto");
		jbBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BuscarContacto();
			}
		});
		jbBuscar.setBounds(47, 131, 144, 23);
		contentPane.add(jbBuscar);
		
		JButton jbListar = new JButton("Listar contactos");
		jbListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ListarContactos();
			}
		});
		jbListar.setBounds(262, 131, 144, 23);
		contentPane.add(jbListar);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//para cerrar una ventana, método dispose() de la clase ventana
				//claseventana.this se refiere al objeto ventana
				Menu.this.dispose();
			}
		});
		btnNewButton.setBounds(169, 198, 89, 23);
		contentPane.add(btnNewButton);
	}

}
