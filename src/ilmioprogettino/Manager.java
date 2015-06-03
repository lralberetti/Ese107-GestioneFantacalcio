package ilmioprogettino;

public class Manager {
	private Rosa rosa;
	private String nome;
	private double budget;
	
	public Manager(Rosa rosa, String nome, double budget) {
		this.rosa = rosa;
		if(nome.length()==0)
			throw new IllegalArgumentException ("Cannot be 0");
		else
			this.nome = nome;
		if(budget<0)
			throw new IllegalArgumentException ("Must be positive");
		else
			this.budget = budget;
	}

	public void setRosa(Rosa rosa) {
		this.rosa = rosa;
	}

	public Rosa getRosa() {
		return rosa;
	}

	public String getNome() {
		return nome;
	}

	public double getBudget() {
		return budget;
	}
	
	

}
