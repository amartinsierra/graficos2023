package presentacion.adaptadores;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import service.PaisesService;

public class AdaptadorListaPaises extends DefaultComboBoxModel<String>{
	List<String> continentes;
	public AdaptadorListaPaises() {
		PaisesService service=new PaisesService();
		continentes=service.continentes();
	}
	//sobrescribimos los métodos ListModel que serán llamados por JList para rellenarse
	@Override
	public int getSize() {
		return continentes.size();
	}
	@Override
	public String getElementAt(int index) {
		return continentes.get(index);
	}
	
	
	
}
