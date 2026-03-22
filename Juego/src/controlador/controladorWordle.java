package controlador;

import interfaz.VentanaPrincipal;
import modelo.EstadoLetra;
import modelo.Intento;
import modelo.JuegoWORDLE;

public class controladorWordle {
	private String palabraActual;
	private int limiteLetras;
	private int casilleroActual;
	private VentanaPrincipal interfaz;
	private JuegoWORDLE juego;
	
	public controladorWordle (JuegoWORDLE juego, VentanaPrincipal interfaz, int limiteLetras) {
		this.palabraActual = "";
		this.limiteLetras = limiteLetras;
		this.casilleroActual = 0;
		this.interfaz = interfaz;
		this.juego = juego;
	}
	
	
	public void recibirLetra (String letra) {
		if (this.palabraActual.length() < this.limiteLetras) {
			this.palabraActual += letra;
			this.interfaz.dibujarLetra(casilleroActual, letra);
			this.casilleroActual++;
		}
	}
	
	public void borrarLetra () {
		if (this.palabraActual.length() > 0) {
			this.casilleroActual--;
			this.interfaz.dibujarLetra(casilleroActual, "");
			this.palabraActual = this.palabraActual.substring(0, this.palabraActual.length()-1);
		}
	}
	
	public void procesarPalabra() {
		if(this.palabraActual.length() == 5 && this.juego.existePalabra(this.palabraActual)) {
			Intento resultadoIntento = this.juego.procesarIntento(this.palabraActual);
			EstadoLetra[] estados = resultadoIntento.getResultado();
			
			
			int inicioPalabra = this.casilleroActual - 5;
			
			for (int i = 0; i < 5; i++) {
				int casilleroDestino = inicioPalabra + i;
				EstadoLetra estadoLetra = estados[i];
				
				this.interfaz.pintarCasillero(casilleroDestino, estadoLetra);
			}
		}
		
		this.palabraActual = "";
	}
}
