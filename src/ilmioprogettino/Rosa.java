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
		if(p!=null){
			portieri.add(p);
		}
		else
			throw new IllegalArgumentException ("Add new goalkeeper");
	}
	
	public void addDifensore(Difensore d){
		if(d!=null){
			difensori.add(d);
		}
		else
			throw new IllegalArgumentException ("Add new defender");
	}
	
	public void addCentrocampista(Centrocampista c){
		if(c!=null){
			centrocampisti.add(c);
		}
		else
			throw new IllegalArgumentException ("Add new midfielder");
	}

	public void addAttaccante(Attaccante a){
		if(a!=null){
			attaccanti.add(a);
		}
		else
			throw new IllegalArgumentException ("Add new forward");
	}	
	
}
