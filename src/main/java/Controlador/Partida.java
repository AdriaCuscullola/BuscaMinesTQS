package Controlador;

import Modelo.GeneradorTablero;
import Modelo.TableroRandom;
import Modelo.Tauler;

public abstract class Partida {
	
	public Tauler TableroPartida;
	
	public Partida() {
		GeneradorTablero rand = new TableroRandom();
		TableroPartida = new Tauler(rand);
	}
	
	
	
	// comen�arPartida --> que ha de cridar el crearTauler(dificultad esollida per usuari)
	
	// gestionarSeleccio --> que haura de cridar al comprovarFila, comprovarColumna, comprovarAccio
	// ha de controlar ell les comporvacions de fila i tot aixo??
	
	// fiPartida --> que tingui el getter de la matriu jugador i busqui si s'ha destapar un 9
	
	
}
