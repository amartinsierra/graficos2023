package service;

import java.util.List;

import model.Contacto;

public interface ContactosService {

	boolean guardarContacto(Integer numero, String nombre, String email, int edad);

	Contacto buscarContacto(Integer numero);

	void eliminarContacto(Integer numero);

	List<Contacto> contactos();

}