package Modelo;

import java.util.Random;

// clase que se encarga de colocar las minas en el tablero de forma aleatoria 
public class TableroRandom implements GeneradorTablero{ 
	
	public Casella[][] generarMinas(int filas, int columnas, int minas){
		
		Casella[][] matriz = new Casella[filas][columnas];
        
        for(int i = 0; i < filas; i++) {
        	for(int j = 0; j < columnas; j++) {
        		matriz[i][j] = new Casella();
        	}
        }
		
		
		Random randFilas = new Random();
		Random randColumnas = new Random();
		int filaR = 0;
		int colR = 0;
		int nContadorMinas = 0;
		while(nContadorMinas < minas)
		{
			filaR = randFilas.nextInt(filas);
			colR = randColumnas.nextInt(columnas);
			if(matriz[filaR][colR].getValor() != 9)
			{
				matriz[filaR][colR].setValor(9);
				nContadorMinas = nContadorMinas + 1;
			}
		}
		return matriz;
		
	}

}
