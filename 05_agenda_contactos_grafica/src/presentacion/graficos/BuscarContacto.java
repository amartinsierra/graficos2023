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

import model.Contacto;
import service.ContactosService;

public class BuscarContacto extends JFrame {

	private JPanel contentPane;
	private JTextField jtNumero;

	

	/**
	 * Create the frame.
	 */
	public BuscarContacto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce número");
		lblNewLabel.setBounds(91, 14, 86, 14);
		contentPane.add(lblNewLabel);
		
		JButton jbBuscar = new JButton("Buscar");
		jbBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactosService service=new ContactosService();
				Contacto contacto=service.buscarContacto(Integer.parseInt(jtNumero.getText()));
				if(contacto!=null) {
					String datos="Nombre: "+contacto.getNombre()+"\n";
					datos+="Email: "+contacto.getEmail()+"\n";
					JOptionPane.showMessageDialog(jbBuscar, datos);
				}else {
					JOptionPane.showMessageDialog(jbBuscar, "El contacto no existe");
				}
			}
		});
		jbBuscar.setBounds(155, 52, 86, 23);
		contentPane.add(jbBuscar);
		
		jtNumero = new JTextField();
		jtNumero.setBounds(185, 11, 86, 20);
		jtNumero.setColumns(10);
		contentPane.add(jtNumero);
		this.setVisible(true);
	}

}
