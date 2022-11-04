package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.enumeradores.TipoDeEvento;

public class TestDeportivo {

	@Test
	public void queSePuedaCrearUnNadador() {
		Nadador nuevo = new Nadador(1, "Camila", "Espalda");

		assertEquals("Espalda", nuevo.getEstiloPreferido());
		assertEquals((Integer)1, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void queSePuedaCrearUnCorredor() {
		Corredor nuevo = new Corredor(2, "Carolina", 10000);
		nuevo.setCantidadDeKilometrosEntrenados(50000);
		
		assertEquals((Integer)10000, nuevo.getDistanciaPreferida());
		assertEquals((Integer)50000, nuevo.getCantidadDeKilometrosEntrenados());
		assertEquals((Integer)2, nuevo.getNumeroDeSocio());
	}

	@Test
	public void  queSePuedaCrearUnCiclista() {
		Ciclista nuevo = new Ciclista(3, "Enzo", TipoDeBicicleta.RUTA);

		assertEquals(TipoDeBicicleta.RUTA, nuevo.getTipoDeBicicleta());
		assertEquals((Integer) 3, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedaCrearUnTriatleta() {
		Triatleta nuevo = new Triatleta(4, "Luna", TipoDeEvento.TRIATLON_OLIMPICO, TipoDeBicicleta.TRIA,"Espalda");
		
		assertEquals(TipoDeEvento.TRIATLON_OLIMPICO, nuevo.getDistanciaPreferida());
		assertEquals(TipoDeBicicleta.TRIA, nuevo.getTipoDeBicicleta());
		assertEquals((Integer)4, nuevo.getNumeroDeSocio());
	}
	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		// El número de socio no se puede repetir
		Club actual = new Club("CARP");
		
		actual.agregarDeportista(new Corredor(1000, "Camila", 42000));
		actual.agregarDeportista(new Corredor(1001, "Natalia", 5000));
		actual.agregarDeportista(new Corredor(1002, "Jorge", 21000));
		actual.agregarDeportista(new Nadador(1003, "Lucrecia", "Pecho"));
		actual.agregarDeportista(new Triatleta(1004, "Tamara", TipoDeEvento.TRIATLON_OLIMPICO, TipoDeBicicleta.RUTA));
		actual.agregarDeportista(new Ciclista(1005, "Alberto", TipoDeBicicleta.MOUNTAIN));
		actual.agregarDeportista(new Ciclista(1006, "Domingo", TipoDeBicicleta.BMX));
		actual.agregarDeportista(new Corredor(1007, "Luciana", 10000));
		actual.agregarDeportista(new Nadador(1008, "Luna", "Crol"));
		actual.agregarDeportista(new Nadador(1009, "Victor", "Mariposa"));
		actual.agregarDeportista(new Triatleta(1004, "Cecilia", "Ironman", TipoDeBicicleta.TRIA));
			
		assertEquals( 10, actual.getSocios().size());		
	}
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws NoEstaPreparado{	
		// En las carreras de natación sólo pueden inscribirse los que sean INadador
		Socio celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		Evento acuatica = new Evento (TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS, "Maraton de aguas abiertas");
		actual.inscribirEnEvento(acuatica, celeste);
				
	}
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnTriatlon () throws NoEstaPreparado{		
		// En los triatlones sólo pueden inscribirse los que sean INadador & ICiclista
		Socio celeste = new Corredor(1000, "Celeste", 10000);
		Club actual = new Club("Sitas");
		
		Evento corredor = new Evento(TipoDeEvento.TRIATLON_IRONMAN, "Triatlon Khona");
		
		actual.inscribirEnEvento(corredor, celeste);		
	}
	
	@Test
	public void  queUnCorredorPuedaCorrerUnaMaraton() throws NoEstaPreparado{		
		Socio celeste = new Corredor(999, "Celeste", 42000);
		Club actual = new Club("Moron");
		actual.agregarDeportista(celeste);
		Evento corredor = new Evento(TipoDeEvento.CARRERA_42K, "Maraton de New York");
		
		actual.inscribirEnEvento(corredor, celeste);		
	}
}
