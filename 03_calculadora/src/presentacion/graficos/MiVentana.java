package presentacion.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MiVentana extends JFrame {
	public MiVentana() {
		//título ventana
		super("Calculadora");
		//modificar comportamiento botón de cierre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//tamaño y posición
		this.setBounds(120, 50, 800, 500);
		//proceso de creación de controles gráficos
		inicializarComponentes();
		//visualizar ventana
		this.setVisible(true);
	}
	
	private void inicializarComponentes() {
		this.setLayout(null);//desactiva el gestor de organización
		JButton jbSumar=new JButton("Sumar");
		JButton jbMultiplicar=new JButton("Multiplicar");
		JLabel jl1=new JLabel("Numero 1:");
		JLabel jl2=new JLabel("Numero 2:");
		JLabel jlResultado=new JLabel();
		JTextField jtNum1=new JTextField();
		JTextField jtNum2=new JTextField();
		jl1.setBounds(100, 80, 100, 30);
		jtNum1.setBounds(250, 80, 110, 30);
		jl2.setBounds(100, 120, 100, 30);
		jtNum2.setBounds(250, 120, 110, 30);
		jbSumar.setBounds(120, 160, 120, 30);
		jbMultiplicar.setBounds(250, 160, 120, 30);
		jlResultado.setBounds(200, 220, 120, 30);
		this.add(jbSumar);this.add(jbMultiplicar);
		this.add(jl1);this.add(jl2);
		this.add(jtNum1);this.add(jtNum2);
		this.add(jlResultado);
		//eventos
		ActionListener actionSumar=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//jlResultado.setText("Suma: "+(Integer.parseInt(jtNum1.getText())+Integer.parseInt(jtNum2.getText())));
				JOptionPane.showMessageDialog(jbSumar, "Suma: "+(Integer.parseInt(jtNum1.getText())+Integer.parseInt(jtNum2.getText())));
			}
		};
		ActionListener actionMultiplicar=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jlResultado.setText("Multiplicación: "+(Integer.parseInt(jtNum1.getText())*Integer.parseInt(jtNum2.getText())));				
			}
		};
		
		jbSumar.addActionListener(actionSumar);
		jbMultiplicar.addActionListener(actionMultiplicar);
	}
}
