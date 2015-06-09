package ese107;
import ilmioprogettino.*;

import java.io.*;
import java.util.Vector;
public class Ese107 {

	public static void main(String[] args) throws IOException {
		Manager manager=new Manager("Francesco Trotta",700.000);
		Manager manager2=new Manager("Paolo Testi",700.000);
		
		Rosa rosa=new Rosa(manager);
		manager.setRosa(rosa);
		
		Vector<Calciatore> c = new Vector<Calciatore>();
		c.add(new Attaccante("Federico The Spark Braconi","Attaccante",15.000));
		c.add(new Attaccante("Lorenzo Tranquility Alberetti","Attaccante",5.000));
		c.add(new Attaccante("Federico Broom Hair Alunni Proietti","Attaccante",13.000));
		c.add(new Attaccante("Luca The Leaf Giovannetti ","Attaccante",25.000));
		c.add(new Attaccante("Alessandro Matri","Attaccante",115.000));
		c.add(new Attaccante("Giulio Mommi","Attaccante",450.000));
		c.add(new Attaccante("Axel BigHouse Casagrande","Attaccante",75.000));
		c.add(new Attaccante("Lorenzo Gazzella","Attaccante",2.000));
		c.add(new Attaccante("Nicola Corradini","Attaccante",120.000));
		c.add(new Attaccante("Ivan Garofani","Attaccante",250.000));
		
		c.add(new Centrocampista("Matteo Moschini","Centrocampista",60.000));
		c.add(new Centrocampista("Fabio Giannoni","Centrocampista",499.000));
		c.add(new Centrocampista("Pier Ferdinando Luna","Centrocampista",30.000));
		c.add(new Centrocampista("Paul Pogba","Centrocampista",120.000));
		c.add(new Centrocampista("Mateo Kovacic","Centrocampista",95.000));
		c.add(new Centrocampista("Rodrigo Taddei","Centrocampista",24.000));
		c.add(new Centrocampista("Fredy Guarin","Centrocampista",32.000));
		c.add(new Centrocampista("valerio Verre","Centrocampista",33.000));
		c.add(new Centrocampista("Marco Fossati","Centrocampista",22.000));
		c.add(new Centrocampista("Daniele Sargenti","Centrocampista",11.000));
		
		c.add(new Difensore("Lorenzo The Director Carfagna","Difensore",94.000));
		c.add(new Difensore("Roland Come on guys! Boga","Difensore",93.000));
		c.add(new Difensore("Simone The Punisher Ficola ","Difensore",92.000));
		c.add(new Difensore("Caterina Eracli Verita","Difensore",10.000));
		c.add(new Difensore("Martis indi","Difensore",50.000));
		c.add(new Difensore("Van Der Wiel","Difensore",13.000));
		c.add(new Difensore("Alex Miccio","Difensore",300.000));
		c.add(new Difensore("Andrei Leca","Difensore",310.000));
		c.add(new Difensore("Marco Sargenti ","Difensore",188.000));
		c.add(new Difensore("Andrea Germini","Difensore",88.000));
		
		c.add(new Portiere("Alessandro  Lame De Angelis","Portiere",110.000));
		c.add(new Portiere("Giulio Talpa Paparelli","Portiere",150.000));
		c.add(new Portiere("Simone  ShtaTzhitto Raichini","Portiere",99.000));
		c.add(new Portiere("Cristiano Capretta","Portiere",180.000));
		c.add(new Portiere("Gabriele Quirini","Portiere",99.000));
		c.add(new Portiere("Luca Buz Temperoni","Portiere",330.000));
		c.add(new Portiere("Filippo Pisolo mantovani","Portiere",100.000));
		c.add(new Portiere("Hulk","Portiere",88.000));
		c.add(new Portiere("Capitan America","Portiere",100.000));
		c.add(new Portiere("X-MEN","Portiere",22.000));
		
		
		for(int i=0;i<c.size();i++) {
			System.out.println(c.elementAt(i).toString());
		}
		
		InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader tastiera = new BufferedReader(input);
	    String scelta;
	    boolean nomeEsistente = false;
	    
        for(int i=0;i<6;i++) {
        	System.out.print("Scrivi il nome dell'attaccante " + (i+1) + " che vuoi acquistare: ");
        	scelta = tastiera.readLine();
        	nomeEsistente = false;
        	for(int y=0; y<c.size(); y++) {
        		 if(scelta.equals(c.elementAt(i).getNome())) {
        			 manager.getRosa().addAttaccante((Attaccante)c.elementAt(i));
        		 }
        	 }
     
        }
        for(int i=0;i<8;i++){
        	System.out.print("Scrivi il nome del centrocampista " + (i+1) + " che vuoi acquistare: ");
        	scelta = tastiera.readLine();
       	 for(int y=0; y<c.size(); y++){
       		 if(scelta.equals(c.elementAt(i).getNome())){
       			 manager.getRosa().addCentrocampista((Centrocampista)c.elementAt(i));
       		 }
       	 }
       }
        for(int i=0;i<6;i++){
        	System.out.print("Scrivi il nome del difensore " + (i+1) + " che vuoi acquistare: ");
        	scelta = tastiera.readLine();
       	 for(int y=0; y<c.size(); y++){
       		 if(scelta.equals(c.elementAt(i).getNome())){
       			 manager.getRosa().addDifensore((Difensore)c.elementAt(i));
       		 }
       	 }
       }
        for(int i=0;i<3;i++){
        	System.out.print("Scrivi il nome del portiere " + (i+1) + " che vuoi acquistare: ");
        	scelta = tastiera.readLine();
       	 for(int y=0; y<c.size(); y++){
       		 if(scelta.equals(c.elementAt(i).getNome())){
       			 manager.getRosa().addPortiere((Portiere)c.elementAt(i));
       		 }
       	 }
       }
       
       
        	
	}

}