package presentacion.graficos;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import presentacion.adaptadores.AdaptadorListaPaises;
import presentacion.adaptadores.AdaptadorTablaPaises;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaPaises extends JFrame {

	private JPanel contentPane;
	private JTable tbPaises;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane_1;
	private JComboBox cbContinentes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPaises frame = new VentanaPaises();
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
	public VentanaPaises() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				cbContinentes.setModel(new AdaptadorListaPaises());
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 147, 496, 169);
		contentPane.add(scrollPane);
		
		tbPaises = new JTable();
		scrollPane.setViewportView(tbPaises);
		
		lblNewLabel = new JLabel("Paises:");
		lblNewLabel.setBounds(65, 122, 68, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Seleccione continente:");
		lblNewLabel_1.setBounds(63, 23, 162, 14);
		contentPane.add(lblNewLabel_1);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(63, 48, 231, 28);
		contentPane.add(scrollPane_1);
		
		cbContinentes = new JComboBox();
		cbContinentes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String continente=(String)cbContinentes.getSelectedItem();
				tbPaises.setModel(new AdaptadorTablaPaises(continente));
			}
		});
		scrollPane_1.setViewportView(cbContinentes);
	}
}
