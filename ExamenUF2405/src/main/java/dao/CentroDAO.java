package dao;

import java.util.List;

import modelo.Centro;

public interface CentroDAO {

	List<Centro> getCentros();
	int eliminarCentro(int cod_centro);
	Centro getCentro(int cod_centro);
	int insertarCentro(Centro centro);
	int actualizarCentro(Centro centro);
}
