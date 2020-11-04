package BuscaMines;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	// 1- test en el que el usuario selecciona una dificultad v�lida
	@Test
	public void testSelectDificultadNormal() {
		Player p = new MockPlayer();
		int dificultad = 0;
		dificultad = p.seleccionarDificultad();
		assertEquals(dificultad, 1);
	}
	
	// 2- test en el que el usuario selecciona una dificultad no v�lida --try catch?---
	
	// 3- test en el que el usuario selecciona una casilla v�lida 
	@Test
	public void testSelectCasilla() {
		Player p = new MockPlayer();
		int[] posCasilla = new int[2];
		posCasilla = p.seleccionarCasilla();
		assertEquals(posCasilla[0], 2);
		assertEquals(posCasilla[1], 6);
		
	}
	
	// 4- test en el que el usuario selecciona una casilla inv�lida -- fuera de rango --
	
	// 5- test en el que el usuario selecciona una casilla inv�lida -- ya abierta --
	
	// 6- test en el que el propio usuario entra un valor --cin--

	

}
