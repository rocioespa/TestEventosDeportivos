package ar.edu.unlam.pb2;

import java.util.*;

import ar.edu.unlam.pb2.enumeradores.TipoDeEvento;

public class Evento {
	
	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Socio> participantes;
	private String nombreDelEvento;
	
	public Evento(TipoDeEvento tipo, String nombreDelEvento) {
		this.tipo = tipo;
		this.nombreDelEvento = nombreDelEvento;
		this.participantes = new HashMap<>();
	}

	public String getNombreDelEvento() {
		return nombreDelEvento;
	}

	public void setNombreDelEvento(String nombreDelEvento) {
		this.nombreDelEvento = nombreDelEvento;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}
	
	

}
