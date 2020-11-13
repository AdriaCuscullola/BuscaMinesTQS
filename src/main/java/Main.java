import Controlador.Partida;
import Controlador.RealPlayer;

public class Main {
	
	public static void main(String[] args) {
		
		Partida P = new RealPlayer();
		
		while(P.getTablero().getFiles() == 0 && P.getTablero().getColumnes()==0)
		{
			P.seleccionarDificultad();
		}
		P.mostrarTablero();
		while(!P.FiPartida()) 
		{
			P.seleccionarTirada();
			P.mostrarTablero();
		}
	}

	
}
