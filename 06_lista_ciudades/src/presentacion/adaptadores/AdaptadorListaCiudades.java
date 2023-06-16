package presentacion.adaptadores;

import java.util.List;

import javax.swing.DefaultListModel;

import model.Ciudad;
import service.CiudadesService;

public class AdaptadorListaCiudades extends DefaultListModel<Ciudad>{
	List<Ciudad> ciudades;
	public AdaptadorListaCiudades() {
		CiudadesService service=new CiudadesService();
		ciudades=service.ciudades();
	}
	//sobrescribimos los métodos ListModel que serán llamados por JList para rellenarse
	@Override
	public int getSize() {
		return ciudades.size();
	}
	@Override
	public Ciudad getElementAt(int index) {
		return ciudades.get(index);
	}
	
	
	
}
