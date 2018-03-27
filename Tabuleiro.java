public class Tabuleiro {
	
	private int nJogada;
	private Jogador jogador;
	private Quadrante q1;
	private Quadrante q2;
	private Quadrante q3;
	private Quadrante q4;
	private Quadrante q5;
	private Quadrante q6;
	private Quadrante q7;
	private Quadrante q8;
	private Quadrante q9;

	public Tabuleiro() {
		this.q1 = new Quadrante();
		this.q2 = new Quadrante();
		this.q3 = new Quadrante();
		this.q4 = new Quadrante();
		this.q5 = new Quadrante();
		this.q6 = new Quadrante();
		this.q7 = new Quadrante();
		this.q8 = new Quadrante();
		this.q9 = new Quadrante();
	}

	public void desenharTabuleiro(int primeiraVez) {
		if (primeiraVez == 0) {
			System.out.printf("| %s | %s | %s |\n", this.q1.getTipo(), this.q2.getTipo(), this.q3.getTipo());
			System.out.println("-------------");
			System.out.printf("| %s | %s | %s |\n", this.q4.getTipo(), this.q5.getTipo(), this.q6.getTipo());
			System.out.println("-------------");
			System.out.printf("| %s | %s | %s |\n", this.q7.getTipo(), this.q8.getTipo(), this.q9.getTipo());
		} else {
			System.out.printf("| 1 | 2 | 3 |\n", this.q1.getTipo(), this.q2.getTipo(), this.q3.getTipo());
			System.out.println("-------------");
			System.out.printf("| 4 | 5 | 6 |\n", this.q4.getTipo(), this.q5.getTipo(), this.q6.getTipo());
			System.out.println("-------------");
			System.out.printf("| 7 | 8 | 9 |\n", this.q7.getTipo(), this.q8.getTipo(), this.q9.getTipo());			
		}
	}

	public int getNJogada() {
		return this.nJogada;
	}

	public boolean jogar(int quadrante) {
		boolean pass = true;
		
		if (quadrante == 1) {
			if (this.q1.isPreenchido()) {
				pass = false;
			} else {
				this.q1.preencher(jogador.getTipo());
			}
		} else if (quadrante == 2) {
			if (this.q2.isPreenchido()) {
				pass = false;
			} else {
				this.q2.preencher(jogador.getTipo());
			}
		} else if (quadrante == 3) {
			if (this.q3.isPreenchido()) {
				pass = false;
			} else {
				this.q3.preencher(jogador.getTipo());
			}
		} else if (quadrante == 4) {
			if (this.q4.isPreenchido()) {
				pass = false;
			} else {
				this.q4.preencher(jogador.getTipo());
			}
		} else if (quadrante == 5) {
			if (this.q5.isPreenchido()) {
				pass = false;
			} else {
				this.q5.preencher(jogador.getTipo());
			}
		} else if (quadrante == 6) {
			if (this.q6.isPreenchido()) {
				pass = false;
			} else {
				this.q6.preencher(jogador.getTipo());
			}
		} else if (quadrante == 7) {
			if (this.q7.isPreenchido()) {
				pass = false;
			} else {
				this.q7.preencher(jogador.getTipo());
			}
		} else if (quadrante == 8) {
			if (this.q8.isPreenchido()) {
				pass = false;
			} else {
				this.q8.preencher(jogador.getTipo());
			}
		} else if (quadrante == 9) {
			if (this.q9.isPreenchido()) {
				pass = false;
			} else {
				this.q9.preencher(jogador.getTipo());
			}
		}

		if (pass == true) {
			this.nJogada += 1;
		}

		return pass;
				
	}

	public Jogador getJogadorAtual() {
		return this.jogador;
	}
	public void setJogadorAtual(Jogador jogadorAtual){
		this.jogador = jogadorAtual;
	}
	public boolean ganhou() {
		boolean win = false;
		if (this.q1.getTipo() == this.q2.getTipo() && this.q2.getTipo() == this.q3.getTipo() && this.q2.isPreenchido()) {
			System.out.println ("Você Ganhou! 1");
			win = true;
		} else if ( this.q4.getTipo() == this.q5.getTipo() && this.q5.getTipo() == this.q6.getTipo() && this.q5.isPreenchido() ) {
			System.out.println ("Você Ganhou! 2");
			win = true;
		} else if (this.q7.getTipo() == this.q8.getTipo() && this.q8.getTipo() == this.q9.getTipo() && this.q8.isPreenchido()) {
			System.out.println ("Você Ganhou! 3");
			win = true;
		} else if (this.q1.getTipo() == this.q5.getTipo() && this.q5.getTipo() == this.q9.getTipo() && this.q5.isPreenchido()) {
			System.out.println ("Você Ganhou! 4");
			win = true;
		} else if (this.q3.getTipo() == this.q5.getTipo() && this.q5.getTipo() == this.q7.getTipo() && this.q5.isPreenchido()) {
			System.out.println ("Você Ganhou! 5");
			win = true;
		} else if (this.q1.getTipo() == this.q4.getTipo() && this.q4.getTipo() == this.q7.getTipo() && this.q4.isPreenchido()) {
			System.out.println ("Você Ganhou! 6");
			win = true;
		} else if (this.q2.getTipo() == this.q5.getTipo() && this.q5.getTipo() == this.q8.getTipo() && this.q5.isPreenchido()) {
			System.out.println ("Você Ganhou! 7");
			win = true;
		} else if (this.q3.getTipo() == this.q6.getTipo() && this.q6.getTipo() == this.q9.getTipo() && this.q6.isPreenchido()) {
			System.out.println ("Você Ganhou! 8");
			win = true;
		} else if (getNJogada() == 9) {
			System.out.println ("Empate");
			win = true;
		}
		

		return win;
	}


}