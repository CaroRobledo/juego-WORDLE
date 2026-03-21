package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Diccionario {

	private ArrayList<String> listaDePalabras;
	
	public Diccionario()
	{
		listaDePalabras = new ArrayList<>();
		
		listaDePalabras.add("PERRO");
		listaDePalabras.add("TIGRE");
		listaDePalabras.add("RATON");
		listaDePalabras.add("COLOR");
		listaDePalabras.add("NEGRO");
	}
	
	
	public String damePalabraRandom() 
	{
		Random r = new Random();
        int indice = r.nextInt(listaDePalabras.size());
        return listaDePalabras.get(indice);
	}
	
	public boolean contienePalabra(String palabra)
	{
		return listaDePalabras.contains(palabra);
	}

}
