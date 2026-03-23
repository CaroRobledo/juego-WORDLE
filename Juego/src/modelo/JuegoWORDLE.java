package modelo;

public class JuegoWORDLE {

		private String palabraSecreta;
		private int nroIntento;
		private int cantMaxIntentos;
		private EstadoJuego estado;
		private Diccionario diccionario;
	    
	    
	//Constructor para el juego con eleccion de la palabra random
	public JuegoWORDLE()
	{
		this.diccionario = new Diccionario();
		this.palabraSecreta = diccionario.damePalabraRandom();
		
		this.nroIntento = 0;
		this.cantMaxIntentos = 6;
		this.estado = EstadoJuego.JUGANDO;	
	}
	
	//Constructor para TEST
	public JuegoWORDLE(String palabra)
	{
		this.diccionario = new Diccionario();
		this.palabraSecreta = palabra.toUpperCase();
		this.nroIntento = 0;
		this.cantMaxIntentos = 6;
		this.estado = EstadoJuego.JUGANDO;	
	}
	
	//Getter
	public EstadoJuego getEstado() {
		return estado;
	}
	
	public int intentosRestantes() 
	{
		return cantMaxIntentos - nroIntento;
	}
	
	public boolean existePalabra(String palabraActual) {
		return diccionario.contienePalabra(palabraActual.toUpperCase());
	}
	
	
	//Metodo de juego
	public Intento procesarIntento(String palabraUsuario) 
	{
		palabraUsuario = palabraUsuario.toUpperCase(); //Paso siempre la palabra a mayuscula para evitar errores
		EstadoLetra[] resultado = compararPalabras(palabraUsuario); //Comparo la palabra secreta con la del usuario
		nroIntento ++; //Aumento en 1 el intento
		
		if (palabraSecreta.equals(palabraUsuario)) estado = EstadoJuego.GANO;
		else if (nroIntento == cantMaxIntentos) estado = EstadoJuego.PERDIO;
		else estado = EstadoJuego.JUGANDO;
		
		Intento intento = new Intento(palabraUsuario, resultado);		
		return intento;
	}

	private EstadoLetra[] compararPalabras(String palabraUsuario) {
		EstadoLetra[] resultado = new EstadoLetra[5];		
		for (int i = 0; i < palabraSecreta.length(); i++)
		{
			if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)) resultado[i] = EstadoLetra.CORRECTA;
			else if (palabraSecreta.contains("" + palabraUsuario.charAt(i))) resultado[i] = EstadoLetra.PRESENTE;
			else resultado[i] = EstadoLetra.AUSENTE;
		}
		return resultado;
	}




	
	
	
	
}
