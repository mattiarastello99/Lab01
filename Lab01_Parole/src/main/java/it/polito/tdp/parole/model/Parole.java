package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
		
	LinkedList<String> elenco;
	
	
	public Parole() {
		//TODO
		elenco = new LinkedList<String>();
		
	}
	
	public void addParola(String p) {
		//TODO
		elenco.add(p);
		
	}
	
	public class comp implements Comparator<String>{

		@Override
		public int compare(String arg0, String arg1) {
			
			return arg0.compareTo(arg1);
		}
		
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(elenco, new comp());
		
		
		return elenco;
	}
	
	public void reset() {
		// TODO
		elenco.clear();
	}

	public void cancella(String p) {
		
		LinkedList<String> elenco1 = new LinkedList<String>();
		for(String ss : this.elenco) {
			if(p.equals(ss))
				elenco1.add(ss);
		}
		elenco.removeAll(elenco1);
		
	}
}
