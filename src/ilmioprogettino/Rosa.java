package ilmioprogettino;
import java.util.*;

public class Rosa {
	private Vector<Portiere>portieri;
	private Vector<Difensore>difensori;
	private Vector<Centrocampista>centrocampisti;
	private Vector<Attaccante>attaccanti;
	private Manager manager;
	
	public Rosa(Vector<Portiere> portieri, Vector<Difensore> difensori,
			Vector<Centrocampista> centrocampisti,
			Vector<Attaccante> attaccanti, Manager manager) {
		this.portieri = portieri;
		this.difensori = difensori;
		this.centrocampisti = centrocampisti;
		this.attaccanti = attaccanti;
		if(manager== null)
			throw new IllegalArgumentException ("Cannot be NULL");
		this.manager = manager;
	}

	public Manager getManager() {
		return manager;
	}
	
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	public Vector<Portiere> getPortieri() {
		return portieri;
	}
	
	public Vector<Difensore> getDifensori() {
		return difensori;
	}
	
	public Vector<Centrocampista> getCentrocampisti() {
		return centrocampisti;
	}
	
	public Vector<Attaccante> getAttaccanti() {
		return attaccanti;
	}
	
	public void addPortiere(Portiere p){
		if(p.getPrezzo()>manager.getBudgetResiduo()){
			throw new IllegalArgumentException ("Cannot add this goalkeeper because your budget isn't enought");
		}
		else if(p!=null){
			portieri.add(p);
		}
		else
			throw new IllegalArgumentException ("Add new goalkeeper");
	}
	
	public void addDifensore(Difensore d){
		if(d.getPrezzo()>manager.getBudgetResiduo()){
			throw new IllegalArgumentException ("Cannot add this defender because your budget isn't enought");
		}
		else if(d!=null){
			difensori.add(d);
		}
		else
			throw new IllegalArgumentException ("Add new defender");
	}
	
	public void addCentrocampista(Centrocampista c){
		if(c.getPrezzo()>manager.getBudgetResiduo()){
			throw new IllegalArgumentException ("Cannot add this midfielder because your budget isn't enought");
		}
		else if(c!=null){
			centrocampisti.add(c);
		}
		else
			throw new IllegalArgumentException ("Add new midfielder");
	}

	public void addAttaccante(Attaccante a){
		if(a.getPrezzo()>manager.getBudgetResiduo()){
			throw new IllegalArgumentException ("Cannot add this striker because your budget isn't enought");
		}
		else if(a!=null){
			attaccanti.add(a);
		}
		else
			throw new IllegalArgumentException ("Add new striker");
	}	
	public void RemoveCalciatore(Calciatore c){
		if(c==null)
			throw new IllegalArgumentException ("Cannot be null");
		else if(c.getRuolo().equals("Attaccante")){
			for(int i=0;i<getAttaccanti().size();i++){
				if(c==getAttaccanti().elementAt(i))
					attaccanti.remove(i);
			}
		}
		if(c.getRuolo().equals("Centrocampista")){
			for(int i=0;i<getCentrocampisti().size();i++){
				if(c==getCentrocampisti().elementAt(i))
					centrocampisti.remove(i);
			}
		}
		if(c.getRuolo().equals("Difensore")){
			for(int i=0;i<getDifensori().size();i++){
				if(c==getDifensori().elementAt(i))
					difensori.remove(i);
			}
		}
		if(c.getRuolo().equals("Portiere")){
			for(int i=0;i<getPortieri().size();i++){
				if(c==getPortieri().elementAt(i))
					portieri.remove(i);
			}
		}
	}
}
