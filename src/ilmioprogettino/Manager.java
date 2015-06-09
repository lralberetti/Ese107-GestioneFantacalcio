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
	

	public double getBudgetResiduo(){
		double budgetResiduo;
		budgetResiduo=this.budget;
		for(int i=0;i<rosa.getAttaccanti().size();i++){
			Attaccante a=rosa.getAttaccanti().elementAt(i);
			budgetResiduo-=a.getPrezzo();
		}
		for(int i=0;i<rosa.getCentrocampisti().size();i++){
			Centrocampista c=rosa.getCentrocampisti().elementAt(i);
			budgetResiduo-=c.getPrezzo();
		}
		for(int i=0;i<rosa.getDifensori().size();i++){
			Difensore d=rosa.getDifensori().elementAt(i);
			budgetResiduo-=d.getPrezzo();
		}
		for(int i=0;i<rosa.getPortieri().size();i++){
			Portiere p=rosa.getPortieri().elementAt(i);
			budgetResiduo-=p.getPrezzo();
		}
		return budgetResiduo;
	}
}
