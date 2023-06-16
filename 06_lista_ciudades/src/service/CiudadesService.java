package service;

import java.util.List;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> ciudades=List.of(new Ciudad("Santander",17.4),
								new Ciudad("Alicante",25.3),
								new Ciudad("Granada",21.6),
								new Ciudad("Logroño",11.9));
	
	public List<Ciudad> ciudades(){
		return ciudades;
	}
}
