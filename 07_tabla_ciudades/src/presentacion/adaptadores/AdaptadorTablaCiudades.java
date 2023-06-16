package presentacion.adaptadores;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Ciudad;
import service.CiudadesService;

public class AdaptadorTablaCiudades extends AbstractTableModel{
	
	List<Ciudad> ciudades;
	public AdaptadorTablaCiudades() {
		CiudadesService service=new CiudadesService();
		ciudades=service.ciudades();
	}
	@Override
	public int getRowCount() {
		return ciudades.size();
	}
	@Override
	public int getColumnCount() {
		return 2;
	}
	@Override
	public String getColumnName(int column) {
		switch(column) {
			case 0:
				return "Nombre";
			case 1:
				return "Temperatura";
		}
		return "";
	}
	@Override
	public Object getValueAt(int row, int column) {
		switch(column) {
			case 0:
				return ciudades.get(row).getNombre();
			case 1:
				return ciudades.get(row).getTemperatura();
		}
		return null;
	}
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch(columnIndex) {
			case 0:
				return String.class;
			case 1:
				return Double.class;
			}
		return null;
	}
	
	

}
