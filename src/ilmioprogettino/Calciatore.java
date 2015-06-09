package ilmioprogettino;

public abstract class Calciatore {
	private String nome;
	private String ruolo;
	private double prezzo;

	public Calciatore(String nome, String ruolo, double prezzo) {
		if(nome.length()==0)
			throw new IllegalArgumentException ("Cannot be 0");
		else
			this.nome = nome;
		if(ruolo.length()==0)
			throw new IllegalArgumentException ("Cannot be 0");

		else
			this.ruolo = ruolo;
		if(prezzo<0)
			throw new IllegalArgumentException ("Must be positive");
		else
			this.prezzo = prezzo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRuolo() {
		return ruolo;
	}
	
	public double getPrezzo() {
		return prezzo;
	}

	@Override
	public String toString() {
		return "Calciatore [nome=" + nome + ", ruolo=" + ruolo + ", prezzo="
				+ prezzo + "]";
	}

}
