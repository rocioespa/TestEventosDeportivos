package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.interfaz.ICiclista;
import ar.edu.unlam.pb2.interfaz.ICorredor;
import ar.edu.unlam.pb2.interfaz.INadador;

public class Triatleta extends Socio implements ICorredor, INadador, ICiclista{
	
	private Integer distanciaPreferida;
	private Integer kmEntrenados =0;
	private String tipoDeNado;
	TipoDeBicicleta tBici;
	TipoDeEvento evento;
	
	public Triatleta(Integer numeroDeSocio, String nombre, TipoDeEvento evento,TipoDeBicicleta tBici, String tipoDeNado) {
		super(numeroDeSocio, nombre);
		this.tipoDeNado = tipoDeNado;
		this.tBici = tBici;
		this.evento =evento;
	}



	public Triatleta(Integer numeroDeSocio, String nombre, TipoDeEvento evento, TipoDeBicicleta tBici) {
		super(numeroDeSocio, nombre);
		this.tBici = tBici;
		this.evento =evento;
	}



	public Triatleta(Integer numeroDeSocio, String nombre, String tipoDeNado, TipoDeBicicleta tBici) {
		super(numeroDeSocio, nombre);
		this.tipoDeNado = tipoDeNado;
		this.tBici = tBici;
	}



	public TipoDeEvento getDistanciaPreferida() {
		return evento;
	}


	public String getTipoDeNado() {
		return tipoDeNado;
	}

	public void setTipoDeNado(String tipoDeNado) {
		this.tipoDeNado = tipoDeNado;
	}



	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return tBici;
	}

	@Override
	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
