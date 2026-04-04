package modelo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JuegoWORDLETest {

	private JuegoWORDLE juego;
	
	//Inicio del juego
	@Before
	public void inicializar() {
	    juego = new JuegoWORDLE("PERRO");
	}	
	
	@Test
	public void estadoInicialEsJugandoTest() {
	    assertEquals(EstadoJuego.JUGANDO, juego.getEstado());
	}
	
	@Test
	public void numeroIntentoInicialTest() {
	    assertEquals(6, juego.intentosRestantes());
	}
	
	
	@Test
	public void existePalabraEnDiccionarioTest() 
	{
		assertTrue(juego.existePalabra("PERRO"));
	}
	
	
	@Test
	public void noExistePalabraEnDiccionarioTest() 
	{
		assertFalse(juego.existePalabra("HAHAH"));
	}
	
	
	@Test
	public void ganaSiAciertaLaPalabraPrimerIntentoTest() 
	{
		juego.procesarIntento("PERRO");		
		assertEquals(EstadoJuego.GANO, juego.getEstado());
	}
	
	
	@Test
	public void ganaSiAciertaLaPalabraQuintoIntentoTest() 
	{
		juego.procesarIntento("GATOS");	
		juego.procesarIntento("GATOS");	
		juego.procesarIntento("GATOS");	
		juego.procesarIntento("GATOS");	
		juego.procesarIntento("PERRO");		
		assertEquals(EstadoJuego.GANO, juego.getEstado());
	}
	
	@Test
	public void erraPalabraPeroSigueJugandoTest() 
	{
		juego.procesarIntento("GATOS");		
		assertEquals(EstadoJuego.JUGANDO, juego.getEstado());
	}
	
	
	@Test
	public void pierdePorAgotarIntentosTest() 
	{
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");	
		assertEquals(EstadoJuego.PERDIO, juego.getEstado());
	}

	
	@Test
	public void aceptaPalabrasEnMinusculaTest() 
	{
		juego.procesarIntento("gatos");		
		assertEquals(EstadoJuego.JUGANDO, juego.getEstado());
	}
	
	
	@Test
	public void ganaConPalabraEnMinusculaTest() 
	{
		juego.procesarIntento("perro");		
		assertEquals(EstadoJuego.GANO, juego.getEstado());
	}
	
	
	@Test
	public void disminuyeIntentoPorPalabraIncorrectaTest() 
	{
		juego.procesarIntento("TIGRE");
		assertEquals(5, juego.intentosRestantes());
	}
	
	
	@Test
	public void todasEnEstadoCorrectoTest() 
	{

		Intento intento = juego.procesarIntento("PERRO");
		EstadoLetra[] resultado = intento.getResultado();
		
		assertEquals(EstadoLetra.CORRECTA, resultado[0]);
		assertEquals(EstadoLetra.CORRECTA, resultado[1]);
		assertEquals(EstadoLetra.CORRECTA, resultado[2]);
		assertEquals(EstadoLetra.CORRECTA, resultado[3]);
		assertEquals(EstadoLetra.CORRECTA, resultado[4]);
	}
	
	
	@Test
	public void chequeoEstadoAusenteTest() 
	{

		Intento intento = juego.procesarIntento("PERNO");
		EstadoLetra[] resultado = intento.getResultado();
		
		assertEquals(EstadoLetra.CORRECTA, resultado[0]);
		assertEquals(EstadoLetra.CORRECTA, resultado[1]);
		assertEquals(EstadoLetra.CORRECTA, resultado[2]);
		assertEquals(EstadoLetra.AUSENTE, resultado[3]);
		assertEquals(EstadoLetra.CORRECTA, resultado[4]);
	}
	
	@Test
	public void chequeoEstadoPresenteTest() 
	{

		Intento intento = juego.procesarIntento("PORRE");
		EstadoLetra[] resultado = intento.getResultado();
		
		assertEquals(EstadoLetra.CORRECTA, resultado[0]);
		assertEquals(EstadoLetra.PRESENTE, resultado[1]);
		assertEquals(EstadoLetra.CORRECTA, resultado[2]);
		assertEquals(EstadoLetra.CORRECTA, resultado[3]);
		assertEquals(EstadoLetra.PRESENTE, resultado[4]);
	}
	
	
}
