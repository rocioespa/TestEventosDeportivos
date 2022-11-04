package ar.edu.unlam.pb2;

import java.util.*;

import ar.edu.unlam.pb2.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.interfaz.ICiclista;
import ar.edu.unlam.pb2.interfaz.ICorredor;
import ar.edu.unlam.pb2.interfaz.INadador;

public class Club {
	
	private String nombre;
	private Set<Socio> socios;
	private Map<Evento, Socio> competencias;
	
	public Club(String nombre) {
		super();
		this.nombre = nombre;
		this.socios = new HashSet<>();
		this.competencias = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Set<Socio> getSocios() {
		return socios;
	}

	public void setSocios(Set<Socio> socios) {
		this.socios = socios;
	}

	public Map<Evento, Socio> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<Evento, Socio> competencias) {
		this.competencias = competencias;
	}

	public void agregarDeportista(Socio s) {
		this.socios.add(s);
		
	}

	public void inscribirEnEvento(Evento eventoAInscribir, Socio socioAInscribir) throws NoEstaPreparado {
		switch (eventoAInscribir.getTipo()) {

	    case CARRERA_NATACION_EN_AGUAS_ABIERTAS:

	    	if(socioAInscribir instanceof INadador) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado();
	    	};
			
			break;

	    case CARRERA_NATACION_EN_PICINA:

	    	if(socioAInscribir instanceof INadador) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado();
	    	};
			
			break;
			
	    case CARRERA_5K:

	    	if(socioAInscribir instanceof ICorredor) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado();
	    	};
			
			break;
			
	    case CARRERA_10K:

	    	if(socioAInscribir instanceof ICorredor) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado ();
	    	};
			
			break;
			
	    case CARRERA_21K:

	    	if(socioAInscribir instanceof ICorredor) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado ();
	    	};
			
			break;
			
	    case CARRERA_42K:

	    	if(socioAInscribir instanceof ICorredor) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado ();
	    	};
			
			break;
			
	    case DUATLON:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado ();
	    	};
			
			break;
			
	    case TRIATLON_SHORT:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista && socioAInscribir instanceof INadador ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado ();
	    	};
			
			break;
			
	    case TRIATLON_OLIMPICO:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista && socioAInscribir instanceof INadador ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado ();
	    	};
			
			break;
			
	    case TRIATLON_MEDIO:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista && socioAInscribir instanceof INadador ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado ();
	    	};
			
			break;
			
	    case TRIATLON_IRONMAN:

	    	if(socioAInscribir instanceof ICorredor && socioAInscribir instanceof ICiclista && socioAInscribir instanceof INadador ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado ();
	    	};
			
			break;
			
		

		}
	
	
	
	
	}
	

}
