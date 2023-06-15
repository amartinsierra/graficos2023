package presentacion.graficos;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentana extends JFrame {
	public MiVentana() {
		//título ventana
		super("Primera ventana");
		//modificar comportamiento botón de cierre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//tamaño y posición
		this.setBounds(120, 50, 400, 300);
		//proceso de creación de controles gráficos
		inicializarComponentes();
		//visualizar ventana
		this.setVisible(true);
	}
	
	private void inicializarComponentes() {
		this.setLayout(null);//desactiva el gestor de organización
		JButton jb1=new JButton("Pulsar aquí");
		jb1.setBounds(150, 80, 150, 30);
		this.add(jb1);
	}
}
