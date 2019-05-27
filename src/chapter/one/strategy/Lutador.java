package chapter.one.strategy;

public class Lutador {

	private String nome;
	
	private Luta luta;

	public Lutador(String nome) {
		this.nome = nome;
	}

	public Lutador(String nome, Luta luta) {
		this.nome = nome;
		this.luta = luta;
	}

	public Luta getLuta() {
		return luta;
	}

	public void setLuta(Luta luta) {
		this.luta = luta;
	}

	public String getNome() {
		return nome;
	}
	
	public void lutar() {
		luta.lutar();
	}
}
