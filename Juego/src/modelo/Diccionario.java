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
		listaDePalabras.add("TRATO");
		listaDePalabras.add("OPERA");
		listaDePalabras.add("YERBA");
		listaDePalabras.add("QUESO");
		listaDePalabras.add("REMAR");
		listaDePalabras.add("QUEMA");
		listaDePalabras.add("TALCO");
		listaDePalabras.add("PRESO");
		listaDePalabras.add("CIRCO");
		listaDePalabras.add("HACHA");
		listaDePalabras.add("MECHA");
		listaDePalabras.add("LETRA");
		listaDePalabras.add("ARBOL");
		listaDePalabras.add("FUEGO");
		listaDePalabras.add("GENTE");
		listaDePalabras.add("HERIR");
		listaDePalabras.add("JAULA");
		listaDePalabras.add("LIBRO");
		listaDePalabras.add("NOCHE");
		listaDePalabras.add("SABIO");

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
