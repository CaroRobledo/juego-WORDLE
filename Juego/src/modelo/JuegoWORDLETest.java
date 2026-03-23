package modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoWORDLETest {

	@Test
	public void testExistePalabraValida() 
	{
		JuegoWORDLE juego = new JuegoWORDLE("PERRO");
		assertTrue(juego.existePalabra("PERRO"));
	}
	
	@Test
	public void testExistePalabraInvalida() 
	{
		JuegoWORDLE juego = new JuegoWORDLE("PERRO");
		assertFalse(juego.existePalabra("CASAS"));
	}
	
	@Test
	public void testGanaSiAciertaLaPalabra() 
	{
		JuegoWORDLE juego = new JuegoWORDLE("PERRO");
		
		juego.procesarIntento("PERRO");
		
		assertEquals(EstadoJuego.GANO, juego.getEstado());
	}
	
	@Test
	public void testPierdePorCantMaxIntentos() 
	{
		JuegoWORDLE juego = new JuegoWORDLE("PERRO");
		
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");
		juego.procesarIntento("TIGRE");
		
		assertEquals(EstadoJuego.PERDIO, juego.getEstado());
	}

	@Test
	public void testDisminuyeIntentoPorPalabraIncorrecta() 
	{
		JuegoWORDLE juego = new JuegoWORDLE("PERRO");
		
		juego.procesarIntento("TIGRE");
		
		assertEquals(5, juego.intentosRestantes());
	}
	
	@Test
	public void testChequeoEstadoCorrecto() 
	{
		JuegoWORDLE juego = new JuegoWORDLE("PERRO");
		
		Intento intento = juego.procesarIntento("PERRO");
		EstadoLetra[] resultado = intento.getResultado();
		
		assertEquals(EstadoLetra.CORRECTA, resultado[0]);
		assertEquals(EstadoLetra.CORRECTA, resultado[1]);
		assertEquals(EstadoLetra.CORRECTA, resultado[2]);
		assertEquals(EstadoLetra.CORRECTA, resultado[3]);
		assertEquals(EstadoLetra.CORRECTA, resultado[4]);
	}
	
	@Test
	public void testChequeoEstadoAusente() 
	{
		JuegoWORDLE juego = new JuegoWORDLE("PERRO");
		
		Intento intento = juego.procesarIntento("PERNO");
		EstadoLetra[] resultado = intento.getResultado();
		
		assertEquals(EstadoLetra.CORRECTA, resultado[0]);
		assertEquals(EstadoLetra.CORRECTA, resultado[1]);
		assertEquals(EstadoLetra.CORRECTA, resultado[2]);
		assertEquals(EstadoLetra.AUSENTE, resultado[3]);
		assertEquals(EstadoLetra.CORRECTA, resultado[4]);
	}
	
	@Test
	public void testChequeoEstadoPresente() 
	{
		JuegoWORDLE juego = new JuegoWORDLE("PERRO");
		
		Intento intento = juego.procesarIntento("PORRE");
		EstadoLetra[] resultado = intento.getResultado();
		
		assertEquals(EstadoLetra.CORRECTA, resultado[0]);
		assertEquals(EstadoLetra.PRESENTE, resultado[1]);
		assertEquals(EstadoLetra.CORRECTA, resultado[2]);
		assertEquals(EstadoLetra.CORRECTA, resultado[3]);
		assertEquals(EstadoLetra.PRESENTE, resultado[4]);
	}
	
	
}
