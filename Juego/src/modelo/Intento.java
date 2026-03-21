package modelo;

public class Intento {
	private String palabraUsuario;
	private EstadoLetra[] resultado;
	
	public Intento(String palabraUsuario, EstadoLetra[] resultado)
	{
		this.palabraUsuario = palabraUsuario;
		this.resultado = resultado;
	}

	public String getPalabraUsuario()
	{
		return palabraUsuario;
	}

	public EstadoLetra[] getResultado()
	{
		return resultado;
	}
}
