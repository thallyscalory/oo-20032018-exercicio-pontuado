import java.util.Scanner; 

public class JogoDaVelha {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("SEJA BEM VINDO ");

		String play = "";

		Partida Game = new Partida();
		while (!play.equals("P")) {
			System.out.println("Digite 'P' para iniciar a partida!");
			play = scan.next().toUpperCase();
		}
		Game.play();
	}

}