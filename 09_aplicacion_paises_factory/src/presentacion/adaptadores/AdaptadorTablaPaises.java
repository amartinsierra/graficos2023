package presentacion.adaptadores;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Pais;
import service.PaisesService;
import service.PaisesServiceFactory;

public class AdaptadorTablaPaises extends AbstractTableModel{
	
	List<Pais> paises;
	public AdaptadorTablaPaises(String continente) {
		PaisesService service=PaisesServiceFactory.getPaisesService();
		paises=service.paisesContinente(continente);
	}
	@Override
	public int getRowCount() {
		return paises.size();
	}
	@Override
	public int getColumnCount() {
		return 4;
	}
	@Override
	public String getColumnName(int column) {
		switch(column) {
			case 0:
				return "Nombre";
			case 1:
				return "Capital";
			case 2:
				return "Población";
			case 3:
				return "Bandera";
		}
		return "";
	}
	@Override
	public Object getValueAt(int row, int column) {
		switch(column) {
			case 0:
				return paises.get(row).getNombre();
			case 1:
				return paises.get(row).getCapital();
			case 2:
				return paises.get(row).getPoblacion();
			case 3:
				return paises.get(row).getBandera();
		}
		return null;
	}
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch(columnIndex) {
			case 0:
				return String.class;
			case 1:
				return String.class;
			case 2:
				return Double.class;
			case 3:
				return String.class;
		}
		return null;
	}
	
	

}
