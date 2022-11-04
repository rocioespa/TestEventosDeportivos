package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaz.ICorredor;

public class Corredor extends Socio implements ICorredor{
	
	private Integer distanciaPreferida;
	private Integer kmEntrenados =0;

	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida =distanciaPreferida;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.kmEntrenados += km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		
		return kmEntrenados;
	}

}
