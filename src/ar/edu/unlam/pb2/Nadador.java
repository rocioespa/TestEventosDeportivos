package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaz.INadador;

public class Nadador extends Socio implements INadador{
	
	private String tipoDeNado;

	public Nadador(Integer numeroDeSocio, String nombre, String tipoDeNado) {
		super(numeroDeSocio, nombre);
		this.tipoDeNado = tipoDeNado;
	}

	@Override
	public String getEstiloPreferido() {
		return this.tipoDeNado;
	}
	
	

}
