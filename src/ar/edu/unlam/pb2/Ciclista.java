package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.interfaz.ICiclista;

public class Ciclista extends Socio implements ICiclista{
	
	TipoDeBicicleta tBici;

	public Ciclista(Integer numeroDeSocio, String nombre, TipoDeBicicleta tBici) {
		super(numeroDeSocio, nombre);
		this.tBici = tBici;
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		
		return tBici;
	}
	
	
	
	

}
